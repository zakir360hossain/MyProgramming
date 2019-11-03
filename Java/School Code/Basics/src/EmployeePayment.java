
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Zakir Hossain
 *
 */
public class EmployeePayment {

	/**
	 * This program calculates the payment of an employees based on the hourly wage
	 * and number of hours worked, including overtime, which has an increased hourly
	 * wage. Overtime is considered only if the numbers of hours exceed 40.
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

//		Variables
		double hours_worked, hourly_rate, total_pay;
		double regular_pay, overtime_pay, overtime, total_hours;

		System.out.println("Please enter the number of worked hours");
		hours_worked = input.nextDouble();
		System.out.println("Please enter the hourly wage");
		hourly_rate = input.nextDouble();

//		Conditions depending on the worked hours.
		if (hours_worked > 40) {
			overtime = hours_worked - 40;
			hours_worked = hours_worked - overtime;
			regular_pay = hours_worked * hourly_rate;
			overtime_pay = overtime * (hourly_rate * 1.5);
			total_pay = regular_pay + overtime_pay;
			total_hours = hours_worked + overtime;

			System.out.println("---------Check Information-------\n\n");
			System.out.println("Regular hours worked        " + hours_worked);
			System.out.println("Overtime hours worked       " + overtime);
			System.out.println("Total hours worked          " + total_hours);
			System.out.println("Hourly wage                 $" + hourly_rate);
			System.out.println("Regular pay                 $" + regular_pay);
			System.out.println("Overtime pay                $" + overtime_pay);
			System.out.println("Total pay                   $" + total_pay);
		} else {
			total_hours = hours_worked;
			total_pay = hours_worked * hourly_rate;
			System.out.println("---------Check Information-------\n\n");
			System.out.println("Total hours worked          " + total_hours);
			System.out.println("Hourly wage                 $" + hourly_rate);
			System.out.println("Total pay                   $" + total_pay);
		}

	}

}
