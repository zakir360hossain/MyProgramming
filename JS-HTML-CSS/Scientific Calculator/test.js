var str1 = "8(9)6";

var first_integer_loc = str1.indexOf("(") - 1;
var first_integer = str1.charAt(first_integer_loc);
var last_integer_loc = str1.indexOf(")") + 1;
var last_integer = str1.charAt(last_integer_loc);

if (typeof first_integer !== isNaN || typeof last_integer !== isNaN) {
  if (
    str1.charAt(first_integer_loc + 1) == "(" ||
    str1.charAt(second_integer_loc - 1) == ")"
  ) {
    str1 = str1.replace(str1.charAt(first_integer_loc + 1), "*(");
    str1 = str1.replace(str1.charAt(last_integer_loc + 1), "*" + last_integer);
    console.log(str1);
  }
}
