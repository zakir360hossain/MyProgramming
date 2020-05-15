import java.util.Random;
import java.util.Scanner;


/**
 * @author Zakir Hossain September 11, 2019
 *
 */
public class SyntaxFillin {

	public static void main(String[] args) {

		/*
		 * for all variables use good naming conventions -start with lower case -use
		 * camel notation if appropriate There are three types of variables: 1.
		 * Primitive Data type: int, double, char, boolean, float, long 2. Java object
		 * variable - Scanner, Random, String, user defined object
		 *
		 * 
		 */

		// declare and initialize 2 integer variables
		int x1 = 0, x2 = 0;

		// declare and initialize 2 double variables
		double a1 = 6.6, a2 = 2.0;

		// declare and initialize 4 String objects
		String fruit = "Apple", firsn = "John", lastn = "Brat", nickn = "Johnny";

		// declare and initialize 2 boolean variables and print
		boolean yes = true, no = false;

		// declare and initialize 2 char variables
		char alph1 = 'A', alph2 = 'B';

		// declare and initialize 3 Integer objects
		Integer int1 = 0, int2 = 0;
		System.out.println("int1 " + int1);

		// declare and initialize 3 Double objects
		Double fruit2 = 12.0, firstn2 = 20.0, lastn2 = 30.0;

		// declare a Scanner object
		Scanner input = new Scanner(System.in);

		// declare a Random object
		Random rn = new Random();

		// declare 2 constants - a "variable" that never changes value
		// one should be a double
		final int num1 = 1, num2 = 2;

		// use the Math class functions to
		// take the square root of a number
		// Math class is a static class
		// static - the variable being used by the math function keeps its original
		// value
		double squarerootednum = Math.sqrt(a1);

		// cube a number
		double cubenum = Math.pow(a1, a2);

		// find a random number between 1 and 20
		int val1 = (int) (Math.random() * 20);
		// print your results
		System.out.println(val1);

		double val2 = Math.random();
		System.out.println(val2);

		// using the Random object you created above
		// get a random integer between 1 and 500, inclusive
		int randnum = (int) (Math.random() * 500 + 1);

		// get a random double: [0.0, 200.0)
		double randnum2 = Math.random() * 200;
		System.out.println(randnum);
		System.out.println(randnum2);

		/*
		 * Math and arithmetic operations -use ++ on an integer variable -use -- on an
		 * integer variable -use +=, -=, *= -use the arithmetic operations on integers
		 * (+, -, *, /, %) -use the arithmetic operations on doubles (+, -, *, /) -use
		 * the casting capability, both up and down casting print the results of your
		 * calculations
		 */
		int i1 = -5, i2 = 8;

		// Concatenate your String variables into one String object and print

		// using the .length method, print out the number of spaces your
		// concatenated name uses
		// take one of your Integer objects and add 7 to its value and print

	}

}
