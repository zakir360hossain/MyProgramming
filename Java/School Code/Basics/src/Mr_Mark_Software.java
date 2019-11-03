import java.util.Scanner;

/**
 * 
 */

/**
 * @author Zakir Hossain September 9, 2019
 *
 */
public class Mr_Mark_Software {

	/**
	 * This program calculates the area and the circumference of a circle based on
	 * the diameter entered by user.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Input variable
		double diameter;
		// Output variables
		double circumference, area;

		System.out.println("Please enter the diamter of the cirle:");
		diameter = input.nextDouble();

		circumference = Math.PI * diameter;
		area = Math.pow(diameter / 2, 2) * Math.PI;
		circumference = Math.round(circumference * 1000.0) / 1000.0;
		area = Math.round(area * 1000.0) / 1000.0;

		System.out.println("\n");
		System.out.println("Diameter entered: " + diameter);
		System.out.println("Circumference: " + circumference);
		System.out.println("Area: " + area);

	}

}
