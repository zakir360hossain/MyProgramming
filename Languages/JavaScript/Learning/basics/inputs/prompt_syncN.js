//Node and Deno provide many ways to read in inputs from the console

/*
Even though Ctrl + C will exit, sigint = true is to make sure it happens
*/
const prompt = require("prompt-sync")({ sigint: true });

const name = prompt("What is your name?");
console.log(`Hey there ${name}`);

let readInput = (requestInputPhrase) => (input = prompt(requestInputPhrase));

let age = readInput("What is your age");
console.log(age);
