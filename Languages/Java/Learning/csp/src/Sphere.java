
/**
 *
 * 
 */
import java.util.Scanner;

/**
 * @author Zakir Hossain September 7, 2019
 * 
 *         This program calculates the diameter, circumference, surface area,
 *         and the volume of a sphere with given radius.
 */
public class Sphere {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double radius, diameter, cir, SA, volume;
		// "cir" = circumference, "SA" = Surface Area

		// read in the radius
		System.out.println("Enter the radius\n");
		radius = input.nextDouble();

		// Calculate the diameter
		diameter = 2 * radius;

		// Calculate the circumference
		cir = Math.PI * radius * radius;

		// Calculate the surface area
		SA = 4 * Math.PI * radius * radius;

		// Calculate the volume
		volume = 4 * (Math.PI * radius * radius * radius) / 3;

		System.out.println("Radius entered: " + radius + "\n");
		System.out.println("Calculations:\n");
		System.out.println("diameter: " + diameter);
		System.out.println("circumeference: " + cir);
		System.out.println("surface area: " + SA);
		System.out.println("volume: " + volume);

	}

}
