//Callbacks are nothing but assuring that an operation (call it A) happens before
//another operation (call it B). Using callback, which is often a function, JS will make sure
//that A happens before B regardless of the time to complete the operations

var users = ["Sam", "Ellie", "Bernie"];

function addUser(username, callback) {
  setTimeout(function () {
    //First add the user
    users.push(username);
    //then complete the callback (get the user)
    callback();
  }, 200);
}

//Even though the time to add user is 200 ms and to get users is 100, the user will be added first.
function getUser() {
  setTimeout(function () {
    console.log(users);
  }, 100);
}

addUser("Jake", getUser);
