import java.util.*;

/**
 * @author 20hossainz
 * January 6, 2019
 * Calculate the sum of all numbers from 1 all the way to a certain number
 *
 */
public class SumOfnumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		//Variables
		int num=26, sum=0;
		
		while(num>25 || num <=0){//A while loop that will repeat if the user enter a number that is negative, zero, or greater 
			//than 25
			System.out.println("Please enter a non-zero integer that is no bigger than 25");
			 num=input.nextInt();
		}
		for( int i=1; i<=num; i++){//If the number is greater than one, then it will increment by one
			//sum of all the numbers = sum of all the previous number + next number
			sum +=i;
		}
		System.out.println("The sum of all the numbers from 1 to " +num+ " is " +sum);

	}
	//Print all the result

}
