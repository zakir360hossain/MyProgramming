import java.util.Scanner;

/**
 * @author Zakir Hossain December 10, 2018 Finding the slope, y-intercept, and
 *         the equation through two points in a Cartesian plan
 */
public class Slope {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Define variables
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		double x1;
		double y1;
		double x2;
		double y2;
		System.out.println("What is x1?");
		x1 = s.nextDouble();
		System.out.println("What is y1?");
		y1 = s.nextDouble();
		System.out.println("What is x2?");
		x2 = s.nextDouble();
		System.out.println("What is y2?");
		y2 = s.nextDouble();

		// Calculate the slope
		double change_in_x = x2 - x1;
		double change_in_y = y2 - y1;
		double m = change_in_y / change_in_x;
		System.out.println("The slope is " + m);

		// Calculate the y-intercept
		double b;
		b = y1 - m * x1;
		System.out.println("The y-intercept is " + b);

		// Find the equation of the line

		if (b < 0) {
			System.out.println("The eqaution of the line is: y = " + m + "x " + b);

		} else if (b == 0) {
			System.out.println("The eqaution of the line is: y = " + m + "x");
		} else {
			System.out.println("The eqaution of the line is: y = " + m + "x + " + b);
		}

	}

}