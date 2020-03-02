
/**
 * 
 */
import java.util.Scanner;

/**
 * @author Zack
 *
 */
public class LogicExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a decimal");
		double number = input.nextDouble();

		if (number > 15 && number % 2 != 0) {
			System.out.println("Number 1");

		}
		if (number > 15 || number % 2 != 0) {
			System.out.println("Number 2");

		}
		if (number == 15) {
			System.out.println("Number 15");

		}
		String word;
		System.out.println("Word");
		word = input.next();

	}

}
