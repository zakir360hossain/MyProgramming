const readIn = require('./inputs/readIn.js');
/*A simpler way to write function expression

let func = (arg1, arg2, ..., argN) => expression

same as:
let func = function(arg1, arg2, ..., argN) {
  return expression;
};
*/

let sum = (a, b) => a+b;
console.log(sum(3, 4));

// () can be omitted for 1 argument
let cube = a => a**3;
console.log(cube(5));

//() is empty for no args
let intro = () => console.log("I am Zakir the Lord of Universe");
intro();

//create functions best on inputs
let age = readIn.readInput("What is your age?");
let welcome = age < 18 ? 
() => console.log("Hello") : 
() => console.log("Greetings!");

welcome();

