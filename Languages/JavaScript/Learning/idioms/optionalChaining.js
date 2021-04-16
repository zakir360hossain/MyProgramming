
/*
The “non-existing property” problem
Suppose a patient does not have an address, then the statement:
patient.address.street is nonsense

How to check that address exist without conditionals?

*/

let patient = {
    name: "John"
}
//printed street if name exist, else it's undefined if left side does not exist
console.log(patient.address?.street)//undefined

let patient2 = null;
console.log(patient2?.address)//undefined, patient is null

//Can be used for function that may not exist
let userAdmin = {
  admin() {
    console.log("I am admin");
  }
};
let userGuest = {};
userAdmin.admin?.(); // I am admin
userGuest.admin?.(); // nothing (no such method)

//Can be used to access properties that may not exist'
let key = "firstName";
let user1 = {
  firstName: "John"
};
let user2 = null;
alert( user1?.[key] ); // John
alert( user2?.[key] ); // undefined

delete user2?.name; // delete user2.name if user exists