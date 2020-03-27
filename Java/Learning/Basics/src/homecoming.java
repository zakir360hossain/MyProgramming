import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Zakir Hossain September 4, 2019
 *
 */
public class homecoming {

	/**
	 * 
	 */
	public static void main(String[] args) {

		// ask the user for the numbers of student
		// use the random number method to generate the money from the carnival

		Scanner input = new Scanner(System.in);
		Random rn = new Random();

		int freshman, sophomore, junior, senior = 0;
		double shirtMoney, carnivalMoney;
		double fmoney, smoney, jmoney, senmoney;

		final double print = 4.35;
		final double cost = 12.00;

		// ask for information

		System.out.println("Freshmen shirts: ");
		freshman = input.nextInt();
		System.out.println("Sophomores shirts: ");
		sophomore = input.nextInt();
		System.out.println("Juniors shirts: ");
		junior = input.nextInt();
		System.out.println("Seniors shirts: ");
		senior = input.nextInt();

		fmoney = cost * freshman;
		smoney = cost * sophomore;
		jmoney = cost * junior;
		senmoney = cost * senior;

		System.out.println("Freshman\tSophomore\tJunior\t\tSenior\n");

		System.out.println(fmoney + "\t\t " + smoney + "\t\t" + jmoney + "\t\t" + senmoney + "\n");

		// Using Random method to generate carnival money

		carnivalMoney = (rn.nextDouble()) * 1000 + 1;
		System.out.println(carnivalMoney);
		// Generate random integer w/ 1 and 10
		int randint;
		randint = rn.nextInt();
		if (randint < 0) {
			randint = randint * (-1);
		}

		System.out.println("Random number " + randint);
		randint = (randint % 10) + 1;
		System.out.println(randint);

		/*
		 * errors that happen in code
		 * 
		 * 1. syntax error - red indicator that you typed incorrect structure 2. runtime
		 * error (exception error) - usually incorrect data type or divide by zero 3.
		 * Logic error
		 * 
		 */
	}

}
