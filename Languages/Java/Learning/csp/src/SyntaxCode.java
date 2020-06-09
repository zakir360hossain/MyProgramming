import java.util.Random;
import java.util.Scanner;


/**
 * @author Zakir Hossain September 13, 2019
 *
 */
public class SyntaxCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rn = new Random();

		// 1. Declare and initialize a random integer between [1, 350]
		int randnum1 = 0;
		randnum1 = (int) (Math.random() * 350) + 1;
		System.out.println("Random number1: " + randnum1);

		// Using Random class
		int randnum2 = rn.nextInt(350) + 1;
		System.out.println("Random number2: " + randnum2 + "\n");

		// 2. Find the remainder when divided by 7
		int remainder = randnum1 % 7;
		System.out.println("The Remainder of " + randnum1 + " into 7 is " + remainder);

		int remainder2 = randnum2 % 7;
		System.out.println("The Remainder of " + randnum2 + " into 7 is " + remainder2 + "\n");

		// 3. Random double between [1, 225)
		double randnum3 = 0;
		randnum3 = (int) (Math.random() * 224) + 1;
		System.out.println("Random number3: " + randnum3);

		// Using Random class
		double randnum4 = rn.nextInt(224) + 1;
		System.out.println("Random number4: " + randnum4 + "\n");

		// 4. Performing operations on the doubles
		System.out.println("The new values after performing assignment operations:");
		randnum3 += 2;
		randnum3 -= 3;
		randnum3 *= 1.5;
		randnum3 /= 1.1;
		System.out.println(randnum3);

		randnum4 += 2;
		randnum4 -= 3;
		randnum4 *= 1.5;
		randnum4 /= 1.1;
		System.out.println(randnum4 + "\n");

		// 5. Math Functions
		double num1 = -4.6;

		num1 = Math.abs(num1);
		System.out.println("Absolute value of -4.6: " + num1 + "\n");
		System.out.println("Square root of 4.6: " + Math.sqrt(num1) + "\n");
		System.out.println("4.6 to the third power is: " + Math.pow(num1, 3) + "\n");
		System.out.println("A random number between 1 to 4.6 is: " + Math.random() * 4.6 + 1 + "\n");
		System.out.println("Flooring " + num1 + ":  " + Math.floor(num1) + "\n");
		System.out.println("Ceiling " + num1 + ":  " + Math.floor(num1) + "\n\n");

		// 6. Address
		String name = "Zakir Hossain", street = "415 Rexford St", city = "Alexandria", state = "Virginia",
				zip = "19435";
		String name_and_address = "\t\t\t" + name + "\n\t\t" + street + " " + city + " " + state + " " + zip;

		System.out.println(name_and_address + "\n");

		System.out.println(
				"The last character of my street address (Rexford St) : " + street.charAt(street.length() - 1));

		System.out.println("Address character length: " + name_and_address.length());

	}

}
