import java.util.*;
/**
 * 
 */

/**
 * @author 20hossainz January 2, 2019
 *
 */
public class Rainfall {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Define variables
		int years = 0;
		final int MPY = 12;// Month per year
		int months = 0;
		double totalRainfall = 0, averageRainfall;
		double RPM;// Rainfall Per Month
		double AR;// Average Rainfall
		
		while(years<1){
		System.out.println("Enter the number of year");
		years = input.nextInt();
		}
		for(int y = 1; y <= years; y++){
			for (int m = 1; m <= months*years; m++) {
				System.out.println("What is the rainfall (in inch) for the month" + m + ",year" + y + "?");
				RPM = input.nextDouble();
				m = m + 1;
				totalRainfall = totalRainfall + RPM;
			}
		}
		AR = totalRainfall / months;
		System.out.println("The total rainfall is " + totalRainfall);
		System.out.println("The average rainfall is" + AR);
		System.out.println("The total number of months is " + months);
		
	}

}
