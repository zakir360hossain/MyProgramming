import java.util.Scanner;

/**
 * @author Zakir Hossain December 10, 2018 This program finds the distance
 *         between two coordinates
 *
 */
public class Distance {

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
		double distance;
		System.out.println("What is x1?");
		x1 = s.nextDouble();
		System.out.println("What is y1?");
		y1 = s.nextDouble();
		System.out.println("What is x2?");
		x2 = s.nextDouble();
		System.out.println("What is y2?");
		y2 = s.nextDouble();

		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println(
				"Distance between (" + x1 + ", " + y1 + ")" + ", " + "(" + x2 + ", " + y2 + ")" + ": " + distance);

	}

}
