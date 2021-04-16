
/**
 * Symbol is a unique identifier
 * It is not a string
 */

let id = Symbol("id");

let user = {
  name: "John",
  [id]: 123, // not "id": 123
};

//Symbols are skipped in for loop
for (let key in user) {
    (key); // name, age (no symbols)
}
