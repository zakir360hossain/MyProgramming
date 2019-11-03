const question = document.getElementById("question");
const choices = Array.from(document.getElementsByClassName("choice-text"));
const progressText = document.getElementById('progressText');
const scoreText = document.getElementById('score');
const progressBarFull = document.getElementById('progressBarFull');
const loader = document.getElementById('loader');
const game = document.getElementById("game");


let currentQuestion = {};
let acceptingAnswers = false;
let score = 0;
let questionCounter = 0;


let availableQuesions = [];
let questions = [];

fetch(
    "https://opentdb.com/api.php?amount=5&category=19&difficulty=medium&type=multiple"
  )
    .then(response => {
      return response.json();
    })
    //Formatting Questions
    .then(loadedQuestions => {
      console.log(loadedQuestions.results);
      questions = loadedQuestions.results.map(loadedQuestion => {
        const formattedQuestion = {
          question: loadedQuestion.question
        };
        //Randomizing answer choices
        const answerChoices = [...loadedQuestion.incorrect_answers];
        formattedQuestion.answer = Math.floor(Math.random() * 3) + 1;
        answerChoices.splice(
          formattedQuestion.answer - 1,
          0,
          loadedQuestion.correct_answer
        );
  
        answerChoices.forEach((choice, index) => {
          formattedQuestion["choice" + (index + 1)] = choice;
        });
  
        return formattedQuestion;
      });
      startGame();
    })
    .catch(error => { // This catch method can help to identify any mistakes when fetching an API.
        console.error(error);
    });

const CORRECT_ANSWER_POINT = 10;
const numberOfQuestions = questions.length;
startGame = () => {
    questionCounter = -1;
    score = 0;
    availableQuesions = [...questions];
    getNewQuestion();
    game.classList.remove("hidden");
    loader.classList.add("hidden");
};

getNewQuestion = () => {
    if (availableQuesions.length === 0 || questionCounter >= numberOfQuestions) {
        localStorage.setItem("mostRecentScore", score);

        return window.location.assign("/resultPage.html");
    }
    questionCounter++;

    progressText.innerText = `Question ${questionCounter}/${numberOfQuestions}`; //= Question questionCounter + "/" +MAX_QUESTIONS;

    console.log(questionCounter / numberOfQuestions);
    // //Update the progress bar
    progressBarFull.style.width = `${(questionCounter / numberOfQuestions) * 100}%`; //This will fill the bar with a % of color when the question is right

    const questionIndex = Math.floor(Math.random() * availableQuesions.length);
    currentQuestion = availableQuesions[questionIndex];
    question.innerHTML = currentQuestion.question;

    choices.forEach(choice => {
        const number = choice.dataset["number"];
        choice.innerHTML = currentQuestion["choice" + number];
    });

    availableQuesions.splice(questionIndex, 1);
    acceptingAnswers = true;
};

choices.forEach(choice => {
    choice.addEventListener("click", e => {
        if (!acceptingAnswers) return;

        acceptingAnswers = false;
        const selectedChoice = e.target;
        const selectedAnswer = selectedChoice.dataset["number"];

        const classToApply =
            selectedAnswer == currentQuestion.answer ? "correct" : "incorrect";

        if (classToApply === 'correct') {
            incrementScore(CORRECT_ANSWER_POINT);
        }

        selectedChoice.parentElement.classList.add(classToApply);

        setTimeout(() => {
            selectedChoice.parentElement.classList.remove(classToApply);
            getNewQuestion();
        }, 1000);
    });
});

incrementScore = num => {  //If parameterized {in this case "num", the "( { =>" is not needed }
    score += num;
    scoreText.innerText = score;

};

