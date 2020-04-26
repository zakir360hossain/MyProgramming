import java.util.Scanner;

/**
 * This program will read in an integer.
 * 
 */

/**
 * @author Zakir Hossain September 18, 2019
 * 
 *
 */
public class LogicExampl1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number1;

		System.out.println("Enter an integer");
		number1 = input.nextInt();

		if (number1 > 0) {
			System.out.println("Positive");
		} else if (number1 < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
		if (number1 % 2 == 0) {
			System.out.println("Even");
		}

	}

}
