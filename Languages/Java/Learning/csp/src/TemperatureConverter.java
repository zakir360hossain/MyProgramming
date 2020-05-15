import java.util.Scanner;


/**
 * @author Zakir Hossain September 5, 2019
 *
 */
public class TemperatureConverter {

	/**
	 * @param This program converts temperature from centigrade to Fahrenheit.
	 *             Quantity does not have to be a whole number.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Formula: F = 9/5C + 32

		double centigrade;
		double fahrenheit;

		System.out.println("Please enter the temperature in centigrade");
		centigrade = input.nextDouble();
		fahrenheit = centigrade * 9 / 5 + 32;

		System.out.println("Temperature entered (centigrade): " + centigrade + "°\n");
		System.out.println("Temperature after converting to Fahrenheit: " + fahrenheit + "°");

	}

}
