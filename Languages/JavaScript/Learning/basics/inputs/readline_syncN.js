
var readlineSync = require("readline-sync");


// Wait for user's response.
var userName = readlineSync.question("May I have your name? ");
console.log("Hi " + userName + "!");

// Handle the secret text (e.g. password).
var favFood = readlineSync.question("What is your favorite food? ", {
  hideEchoBack: true, // The typed text on screen is hidden by `*` (default).
});
console.log("Oh, " + userName + " loves " + favFood + "!");

//Get the user's response by a single key without the Enter key:
var readlineSync = require("readline-sync");
if (readlineSync.keyInYN("Do you want this module?")) {
  // 'Y' key was pressed.
  console.log("Installing now...");
  // Do something...
} else {
  // Another key was pressed.
  console.log("Searching another...");
  // Do something...
}

//Handle the commands repeatedly, such as the shell interface
readlineSync.promptCLLoop({
  add: function (target, into) {
    console.log(target + " is added into " + into + ".");
    // Do something...
  },
  remove: function (target) {
    console.log(target + " is removed.");
    // Do something...
  },
  bye: function () {
    return true;
  }
});
console.log("Exited");