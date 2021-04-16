//While
let i = 3;
while (i) {
  // when i becomes 0, the condition becomes falsy, and the loop stops
  alert(i);
  i--;
}

//Do While
let i = 0;
do {
  console.log(i);
  i++;
} while (i < 3);

//For
for (let i = 0; i < 3; i++) {
  i += i ^ (i + 1);
}

//Can be skipped
let j = 0;
for (; j < 3; ) {
  console.log(j++);
}

/*
    for (;;) {
    repeats without limits
    }
*/

//break and continue
let value = 9;
while (true) {
  if (value == 0) break; // (*)
  value -= 1;
}

for (let i = 0; i < 10; i++) {
  // if true, skip the remaining part of the body
  if (i % 2 == 0) continue;

  console.log(i); // 1, 3, 5, 7, 9
}

//Name Label
outer: for (let i = 0; i < 3; i++) {
  for (let j = 0; j < 3; j++) {
    let input = prompt(`Value at coords (${i},${j})`, "");

    // if an empty string or canceled, then break out of both loops
    if (!input) break outer; // (*)

    // do something with the value...
  }
}
console.log("Done!");
