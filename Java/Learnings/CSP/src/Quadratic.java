import java.util.*;
/**
 * 
 */

/**
 * @author 20hossainz
 * December 10, 2018
 *Finds the zeros of quadratic equation
 */
public class Quadratic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Define variable
		int a, b, c;
		double x1, x2;
		Scanner input = new Scanner(System.in);
	// read in data
		do
		{
			System.out.println("What is the quadratic conefficient");
			a=input.nextInt();
			if (a==0)
			{ 
				System.out.println("you enetred a zero for the quadratic equation");
				System.out.println("Please re-enter");
			}
		}while (a==0);
		System.out.println("What is the linear conefficient");
		b=input.nextInt();
		System.out.println("What is the constant");
		c=input.nextInt();
		
		// Check discriminant for imaginary answer
		double disc = Math.pow(b, 2)-4*a*c;
		if (disc < 0)
		{
			System.out.println("Your quadratic equation gives imaginary number answer");
			System.out.println("The discriminant is: " + disc);
		}
		 else
	   {
			// if the user incorrectly enter a to be zero
			 // that is a linear, not quadratic
			 if (a==0)
				 System.out.println("You enetred the coefficient to be zero - that's a linear equation ");
			// calculate the zeros using quadratic formula
			x1 = (-b+ Math.sqrt(b*b-4*a*c)) / (2*a);
			// print 
			x2 = (-b-Math.sqrt(Math.pow(b, 2 )-4*a*c)) / (2*a);
			System.out.println("The zeros are: " + x1 + "and " + x2);
		}
		
		

	}

}