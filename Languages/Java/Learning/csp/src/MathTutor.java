import java.util.*;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 * 
 */

/**
 * @author 20hossainz December 16, 2018 Practice addition operation in
 *         mathematics by generating two random numbers and finding their sum.
 *
 */
public class MathTutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// got help from my uncle
		Random rnd = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the MathTutor. Today we will practice some addition operartion problems.");
		System.out.println(
				"Enter how many problems you think you will be able to complete, based on your time. You can enter up to 100.");

		int counter = 1;
		int numCorrect = 0;
		double percent;
		// Entering the number of problems
		int Prob = Integer.parseInt(JOptionPane.showInputDialog("How manny problems would you like to practice?"));
		if (Prob > 100)
			Prob = Integer.parseInt(JOptionPane.showInputDialog("Enter a number that is less than or equal to a 100."));
		while (counter <= Prob) {

			// Define variables

			int x = rnd.nextInt(100);
			int y = rnd.nextInt(100);
			double sum = x + y;
			int ans = Integer.parseInt(JOptionPane

			.showInputDialog("What is the answer for problem " + counter + " : " + x + " + " + y + " ?"));
			if (ans == sum) {
				JOptionPane.showMessageDialog(null, "Nice job!" + " That's correct.");
				numCorrect++;
			} else {
				JOptionPane.showConfirmDialog(null, "That's incorrect." + "The answer is " + sum);
			}
			counter = counter + 1;
		}
		// Calculate the overall grade percentage
		percent = (double) (numCorrect) / (double) (Prob) * (100.0);
		JOptionPane.showMessageDialog(null, "Your over all grade is " + percent + "%.");

	}
}