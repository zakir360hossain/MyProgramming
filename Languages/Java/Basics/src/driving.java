
import java.util.Scanner;

/**
 * 
 */
/**
 * @author Zack
 *
 */
public class driving {

	/**
	 * This program calculates the rate of fuel based on the fuel burnt for a
	 * certain miles driven.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//		Variables
		double mile_driven, gallon_used;
		double pmg;

		System.out.println("Mile driven?");
		mile_driven = input.nextInt();
		System.out.println("Fuel burnt (in gallon)?");
		gallon_used = input.nextInt();

		pmg = mile_driven / gallon_used;
		pmg = Math.round(pmg * 100d) / 100d;

		System.out.println("\n");
		System.out.println("Mile driven:   " + mile_driven);
		System.out.println("Fule burnt:    " + gallon_used + " gallons");
		System.out.println("MPG: " + pmg + " miles per gallon.");

	}

}
