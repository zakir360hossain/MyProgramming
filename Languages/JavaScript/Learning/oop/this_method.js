"use strict";

let user = {
  name: "John",
  age: 30,

  sayHi() {
    /**
     * "this" is the current object, 'user' will also work"
     * but reachability issue may occur if 'user' is used instead of 'this'"
     */
    console.log(this.name);
  },
};

user.sayHi(); // John

user = { name: "John" };
let admin = { name: "Admin" };

function sayHi() {
  console.log(this.name);
}

// use the same function in two objects
user.f = sayHi;
admin.f = sayHi;

// these calls have different this
// "this" inside the function is the object "before the dot"
user.f(); // John  (this == user)
admin.f(); // Admin  (this == admin)

admin["f"](); // Admin (dot or square brackets access the method – doesn't matter)

function f2() {
  console.log(this);
}

f2(); // undefined, error if in non strict mode
