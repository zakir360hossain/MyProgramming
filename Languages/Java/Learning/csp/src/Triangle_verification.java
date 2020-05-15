import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;


/**
 * @author 20hossainz Identify if it is a valid triangle by its sides
 *
 */
public class Triangle_verification {

	public static void main(String[] args) {
		// Define variable
		Scanner s = new Scanner(System.in);
		int A;
		int B;
		int C;
		System.out.println("What is the value of side A?");
		A = s.nextInt();
		System.out.println("What  is the value of side B?");
		B = s.nextInt();
		System.out.println("What is the value of side C?");
		C = s.nextInt();
		if (A + B > C && A + C > B && B + C > A) {
			System.out.println("This is a valid triangle. ");
		}
		if (C == Math.sqrt((A * A) + (B * B))) {
			System.out.println("This is also a right triangle. ");
		}
		if (C != Math.sqrt((A * A) + (B * B)) && (A + B > C && A + C > B && B + C > A)) {
			System.out.println("This is a valid triangle but not a right triangle ");
			System.out.println("A valid triangle cannot be form with these lengths.");
		}
	}

}
