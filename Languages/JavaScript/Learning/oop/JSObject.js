const prompt = require('prompt-sync')({ sigint: true });

let anObject = new Object();

let user = {
  // an object
  name: "Jamail Khan", // by key "name" store value "John"
  age: 30, // by key "age" store value 30
  "Likes Poetry": true
};

console.log(user.name);
console.log(user["Likes Poetry"]);
//Add a new property
user.isFaculty = true;
console.log(user.isFaculty);

//remove a property
delete user.age;

let fruit = prompt("Which fruit to buy?", "apple");
let bag = {
  [fruit]: 5, // the name of the property is taken from the variable fruit
};

console.log( bag.apple ); // 5 if fruit="apple"


//Object instance creation with functions

function registerPlayer(playerName, playerAge, playerHeight){
    return {
        name: playerName,
        age: playerAge,
        height: playerHeight
    }
}

let player1 = registerPlayer("Ben Preston", 22, 84);
console.log("age" in player1);

//Special for...in (only applicable to objects)
for(let key in player1){
    console.log(key);
}

//Integer properties are sorted, others are not
let codes = {
  49: "Germany",
  41: "Switzerland",
  44: "Great Britain",
  // ..,
  1: "USA",
};

for (let code in codes) {
  console.log(code); // 1, 41, 44, 49
}


//Returns true if an object as no properties, false otherwsie
let isEmpty = (obj) => Object.keys(obj).length === 0;
console.log(isEmpty(codes))


//Object referencing and copying
let user = { name: 'John' };
let admin = user;
admin.name = 'Pete'; // changed by the "admin" reference
alert(user.name); // 'Pete', changes are seen from the "user" reference

let patient1 = {
  name: "Alan Curly",
  age: 13
}

let patient2 = {};
for (let key in user){
  patient2[key] = patient1[key]
}
patient2.name = "Jim Curly";

let trail1 = {
  difficulty: "very strenuous",
  distance: 9.3
}

let trail2 = {
  name: "Old Rag"
}
//Object.assign(dest, [src1, src2, src3...])
//It copies the properties of all source objects src1, ..., srcN into the target dest
Object.assign(trail2, trail1);
let trail3 = Object.assign({}, trail1, trail2);
