window.addEventListener("load", initGame);

// const RANDOM_QUOTE_API_URL = "http://api.quotable.io/random";

// Global variables

// Available levels
const levels = {
  easy: 8,
  medium: 10,
  hard: 12
};

// To change level
const currentLevel = levels.easy;

let time = currentLevel; // not const but let because the time is going to be changed
let score = 0;
let isPlaying;

// DOM Elements
const wordInput = document.querySelector("#word-input");
const currentWord = document.querySelector("#current-word");
const scoreDisplay = document.querySelector("#score");
const timeDisplay = document.querySelector("#time");
const message = document.querySelector("#message");
const seconds = document.querySelector("#seconds");

// Loading json data to a javascript array
var words = [];
fetch("words.json")
  .then(function(res) {
    return res.json();
  })
  .then(function(data) {
    words = data.word;
  });

// Initialize Game
function initGame() {
  // Show number of seconds in UI
  seconds.innerHTML = currentLevel;

  // Load words from array randomly;
  showWord(words);

  // Start matching on word input
  wordInput.addEventListener("input", startMatch);

  // Call countdown every second
  setInterval(countdown, 1000);

  // Check game status
  setInterval(checkStatus, 50);
}

// Start match
function startMatch() {
  if (matchWords()) {
    isPlaying = true;
    time = currentLevel + 1;
    showWord(words);
    wordInput.value = "";
    score++;
  }

  // if score is -1, display 0;
  if (score === -1) {
    scoreDisplay.innerHTML = 0;
  } else {
    scoreDisplay.innerHTML = score;
  }
}

// Match the current word to the word input
function matchWords() {
  if (wordInput.value === currentWord.innerHTML) {
    message.innerHTML = "Correct!";
    return true;
  } else {
    message.innerHTML = "";
    return false;
  }
}

// Pick and show random word
function showWord(words) {
  // Generates random array index
  const randIndex = Math.floor(Math.random() * words.length);
  // Output word randomly
  currentWord.innerHTML = words[randIndex];
}

// Countdown timer
function countdown() {
  // Make sure time is not run out
  if (time > 0) {
    time--;
  } else if (time === 0) {
    // Game is over
    isPlaying = false;
  }

  //Show time
  timeDisplay.innerHTML = time;
}

// Checking status
function checkStatus() {
  if (!isPlaying && time === 0) {
    message.innerHTML = "Game Over!!!";
    score = -1;
  }
}
