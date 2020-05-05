import java.util.*;
/**
 * 
 */

/**
 * @author 20hossainz
 * February 2, 2019
 * Calculating the average and the range from a list of numbers
 *
 */
public class MathList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create an array with ten numbers
		Random value = new Random();

		int[] number = new int[10];
		double max = Double.MIN_VALUE; 
		double min = Double.MAX_VALUE;
		double average = 0, range = 0, total = 0;

		for (int i = 0; i < number.length; i++) {
			number[i] = value.nextInt(101-10)+10;
			System.out.print(" " + number[i]);

			if (number[i] > max) {
				max = number[i];
			}
			if (number[i] < min) {
				min = number[i];
			}
			total += number[i];
			average = total / number.length;
			range = max - min;
		}
		System.out.println("\n");
		System.out.println("Average: " + average + "\n" + "Range: " + range);

	}
}
