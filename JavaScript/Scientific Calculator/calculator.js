function clearScreen() {
  document.getElementById("input").value = "";
  document.getElementById("answer").value = "";
}

function getOperand(operand) {
  var input_var = document.getElementById("input");
  switch (operand) {
    case "+":
      input_var.value += "+";
      break;

    case "-":
      input_var.value += "-";
      break;

    case "x":
      input_var.value += "*";
      break;

    case "/":
      input_var.value += "/";
      break;

    case "+/-":
      input_var.value += "-" + input_var.value;
      break;
  }
}

function deleteOneAtEach() {
  var input_var = document.getElementById("input");
  var x = input_var.value;
  if (x.length > 0) {
    x = x.substring(0, x.length - 1);
    input_var.value = x;
  }
}

function squareRoot() {
  input_var = document.getElementById("input");

  if (input_var.value == "&radic;");
}

function clearTopBox() {
  const inta = document.getElementById("input");
  inta.value = "";
}

function squaring() {
  input_var = document.getElementById("input");
  ans = Math.pow(input_var.value, 2);
  document.getElementById("answer").value = +ans;
}

function compute() {
  var input_var = document.getElementById("input");
  var input_var2 = document.getElementById("input2");
  var input_var3 = document.getElementById("answer");

  input_var2.value = input_var.value;

  // Special numbers
  if (input_var.value.includes("π")) {
    input_var2.value = input_var2.value.replace(/π/g, Math.PI);
  }
  if (input_var.value.includes("e")) {
    input_var2.value = input_var2.value.replace(/e/g, Math.E);
  }
  if (input_var.value.includes("ln(")) {
    input_var2.value = input_var.value.replace("ln(", "");
    input_var2.value = input_var.value.replace(")", "");
    input_var2.value = Math.log10(input_var2.value);
  }

  // Trignometry
  if (input_var.value.includes("cos(")) {
    input_var2.value = input_var2.value.replace("cos(", "");
    input_var2.value = input_var2.value.replace(")", "");
    input_var2.value = Math.cos(input_var2.value);
  }
  if (input_var.value.includes("sin(")) {
    input_var2.value = input_var2.value.replace("sin(", "");
    input_var2.value = input_var2.value.replace(")", "");
    input_var2.value = Math.sin(input_var2.value);
  }
  if (input_var.value.includes("tan(")) {
    input_var2.value = input_var2.value.replace("tan(", "");
    input_var2.value = input_var2.value.replace(")", "");
    input_var2.value = Math.tan(input_var2.value);
  }
  if (input_var.value.includes("log(")) {
    input_var2.value = input_var2.value.replace("log(", "");
    input_var2.value = input_var2.value.replace(")", "");
    input_var2.value = Math.log10(input_var2.value);
  }

  if (input_var.value.includes("ln(")) {
    input_var2.value = input_var2.value.replace("ln(", "");
    input_var2.value = input_var2.value.replace(")", "");
    input_var2.value = Math.log(input_var2.value);
  }

  // Implicit Operations
  if (input_var3.value.length > 0) {
    if (input_var.value.includes("*", 0)) {
      input_var2.value = input_var3.value.concat(input_var.value);
    }
    if (input_var.value.includes("/", 0)) {
      input_var2.value = input_var3.value.concat(input_var.value);
    }
    if (input_var.value.includes("+", 0)) {
      input_var2.value = input_var3.value.concat(input_var.value);
    }
    if (input_var.value.includes("-", 0)) {
      input_var2.value = input_var3.value.concat(input_var.value);
    }
    if (input_var.value.includes("^", 0)) {
      input_var.value = input_var3.value.concat(input_var.value);
    }
  }
  if (input_var.value.includes("^")) {
    var first_pos = input_var.value.indexOf("^");
    var input_size = input_var.value.length;
    var sec_pos = input_size - first_pos;
    var mantissa = input_var.value.slice(0, -sec_pos);
    var exponent = input_var.value.slice(first_pos + 1);
    input_var2.value = Math.pow(mantissa, exponent);
  }
  if (input_var.value.includes(")(")) {
    input_var2.value = input_var.value.replace(")(", ")*(");
  }

  ans = eval(input_var2.value);
  document.getElementById("answer").value = ans;
}
