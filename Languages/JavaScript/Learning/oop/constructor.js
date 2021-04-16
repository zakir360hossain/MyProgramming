/**
 * The regular {...} syntax allows to create one object. But often we need to create many similar objects, like multiple users or
 * menu items and so on.
 * That can be done using constructor functions and the "new" operator.
 */


/**
 * Constructor functions technically are regular functions. There are two conventions though:
 * They are named with capital letter first.
 * They should be executed only with "new" operator.
 */

function User(name){
    console.log(new.target) //reveals if instance is created wth new or not.
  //this  = {}; implicitly
  this.name = name;
  this.isAdmin = false;
  // return this;  (implicitly)
}

let user = new User("Jack");
console.log(user.name);

//Single object with complex instructions, not reusable
let user = new function () {
  this.name = "John";
  this.isAdmin = false;

  // ...other code for user creation
  // maybe complex logic and statements
  // local variables etc
}