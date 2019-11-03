import java.util.*;

/**
 * 
 */

/**
 * @author 20hossainz
 * December 18, 2018
 * Calculate the final cost of certain items after applying certain discount percentage.
 *
 */
public class SoftwearPackage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		//Define variables
		
		int quan=0;
		double totalP, discountedP = 0;
		
		//Ask the user how many packages of item is 
		System.out.println("How many packages of item did you purchase ?");
		quan =s.nextInt();
		
		//Total price without the taxes
		totalP=(99*quan);
		
		//Total price, including a taxes of 6%
		totalP=totalP+totalP*.06;
		
		//Calculating the discounted price
		if (quan>=10 && quan<=19){
			discountedP=totalP*0.8;
			discountedP=Math.round(discountedP*100.0)/(100.0);
		}
		else if (quan>=20 && quan<=49){
			discountedP=totalP*0.7;
			discountedP=Math.round(discountedP*100.0)/(100.0);

		}
		
		else if (quan>=50 && quan<=99){
			discountedP=totalP*0.6;
			discountedP=Math.round(discountedP*100.0)/(100.0);

		}
		else if (quan>=100){
			discountedP=totalP*0.5;
			discountedP=Math.round(discountedP*100.0)/(100.0);

		}
		else
		{
			discountedP=totalP;
		}
		//Calculate the total price after the discount
		System.out.println("The total price is " + "$" + discountedP);
	}

}
