//This will make sure that the code use modern JS
"use strict";
//Exponent
let a = 2**3;

console.log(+true); //converts to 1
console.log(+""); //converts to false

//concat
let s = "my" +"man";

let apple = "2";
let orange = "3";
console.log(+apple + +orange); //Both converted to number

//Incr/Decr precedence
let counter = 0;
console.log( ++counter ); // 1
let counter2 = 0;
console.log(counter2++ ); // 0
let counter3 = counter2++;
console.log(counter3); // 1

//The Nullish Coalescing operator (recent)

let A = null;
 let B = 23;

// if A is defined (neither Undefined or Null), then A,
// if A isn’t defined, then B.
console.log(A ?? B);