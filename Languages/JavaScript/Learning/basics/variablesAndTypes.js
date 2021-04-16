console.log("Dealing with th vars");

const full_name = "John McCain";
var age = 45;
console.log(age, full_name);

let radius = 45.67;
get
let letter = 'A';
console.log(radius, letter);

//let is limited to the scope of the block, var is global (var is old way too)

let isTrashOut = true;

//JavaScript is dynamically typed, use TypeScript to have static type option
console.log(typeof undefined); // "undefined"

typeof 0; // "number"

typeof 10n; // "bigint" ends with n

typeof true; // "boolean"

typeof "foo"; // "string"

typeof Symbol("id"); // "symbol"

typeof Math; // "object"  (1)

typeof null; // "object"  (2)

typeof alert; // "function"  (3)