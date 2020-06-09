import java.util.*;
/**
 * 
 */

/**
 * @author 20hossainz
 *
 */
public class spdqd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Read two integers and calculate their sum, product, difference, quotient, and modulus
		
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		double sum, product, difference, quotient, modulus;
		
		// Read the integers
		System.out.println("Enter the 1st integer");
		a=input.nextInt();
		System.out.println("Enter the 2nd ineteger");
		b=input.nextInt();
		
		// Calculate the sum, product, difference, quotient, modulus
		sum = (a+b);
		System.out.println("Sum:" + sum);
		product = (a*b);
		System.out.println("Product:" + product);
		difference = (a-b);
		System.out.println("Difference:" + difference);
		quotient = (a/b);
		System.out.println("Quotient:" + quotient);
		modulus = (a%b);
		System.out.println("Modulus:" + modulus);
		
		// Print the answers
	}

}
