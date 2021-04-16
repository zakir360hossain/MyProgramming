function showMessage(){
    console.log("Function just called");
}
showMessage();


function showPrimes(n) {
  for (let i = 2; i < n; i++) {
    if (!isPrime(i)) continue;

    console.log(i); // a prime
  }
}

function isPrime(n) {
  for (let i = 2; i < n; i++) {
    if (n % i == 0) return false;
  }
  return true;
}

//Function expressions
// Function Declaration
function sum(a, b) {
  return a + b;
}
// Function Expression
let sum1 = function(a, b) {
  return a + b;
}
let sayHi = function() {
  console.log( "Hello" );
}

let func = sayHi;
func();


let age = prompt("What is your age?", 18);
// conditionally declare a function
if (age < 18) {
  function welcome() {
    console.log("Hello!");
  }

} else {
  function welcome() {
    console.log("Greetings!");
  }
}
//welcome(); Error: welcome is not defined
 age = prompt("What is your age?", 18);
let welcome;

if (age < 18) {
  welcome = function() {
    console.log("Hello!");
  };
} else {
  welcome = function() {
    console.log("Greetings!");
  };

}
welcome(); // ok now

//Simplified
age = prompt("What is your age?", 18);

let welcome2 = (age < 18) ?
  function() { console.log("Hello!"); } :
  function() { console.log("Greetings!"); }

welcome2(); // ok now