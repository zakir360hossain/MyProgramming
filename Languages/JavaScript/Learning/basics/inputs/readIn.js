
const prompt = require("prompt-sync")({ sigint: true });

// I will use this function throughout to readInput
let readInput = (requestInputPhrase) => (input = prompt(requestInputPhrase));

//Making the readInput function available, so I can use it to read inputs in another .js files
module.exports = { readInput };
