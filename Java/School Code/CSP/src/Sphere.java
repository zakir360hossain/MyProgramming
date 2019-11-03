import java.util.*;
/**
 *
 * 
 */

/**
 * @author 20hossainz
 *Decemeber 7. 2018
 * To calculate the diameter, circumference, surface area, and the volume of a sphere
 */
public class Sphere {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare variable
		Scanner input = new Scanner(System.in);
		double radius, diameter, cir, SA, volume;
		
		// read in the radius
		System.out.println("Enter the radius");
		radius=input.nextDouble();
		// Calculate the diameter
		diameter = 2 * radius;
		System.out.println("diameter: " + diameter);
		
		// Calculate the circumference
		cir = Math.PI * radius * radius;
		System.out.println("circumeference: " + cir);
		
		// Calculate the surface area 
		SA = 4 * Math.PI * radius * radius;
		System.out.println("surface area: " + SA);
		
		// Calculate the volume
		volume =4*( Math.PI * radius * radius * radius)/3;
		System.out.println("volume: " + volume);
		
		
		
		
		
		
		
		
		

	}

}
