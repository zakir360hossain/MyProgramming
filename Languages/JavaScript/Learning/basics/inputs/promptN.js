var prompt = require("prompt");

prompt.start();

// Get two properties from the user: username and email
prompt.get(["username", "email"], function (err, result) {
  console.log("Command-line input received:");
  console.log("  username: " + result.username);
  console.log("  email: " + result.email);
});
//If no callback is passed to prompt.get(schema), then it returns a Promise, so you can also write:
const { username, email } = await prompt.get(["username", "email"]);