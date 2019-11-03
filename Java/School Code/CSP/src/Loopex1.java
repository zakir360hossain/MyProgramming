import java.util.*;
/**
 * 
 */

/**
 * @author 20hossainz
 * January 3, 2019
 * Loops example #1
 * Math works- for loop
 *
 */
public class Loopex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variables
		int evenints=2;
		int mult3=3;
		int summultiples=0;
		int squareNums=1;
		
		
		//For loop
		//for loop executes a set (block) of code a given number of times
		
		//for (int index = 1; index <=7; index++);
		
		//Part A- Print out the even number for 2 to 100
		for(evenints=2; evenints<=100; evenints+=2){
			System.out.print(evenints + " ");
		}
		System.out.println("\n");
		//Part B- the sum of the multiples of 3 up to 36
		for(mult3= 3; mult3<=36; mult3+=3 ){
			summultiples=summultiples+mult3;
		}
		System.out.println("The sum is " + summultiples);
		
		//Part C- the square numbers from 1 to 100
		
		for(squareNums=1; squareNums<=10; squareNums++ ){
			System.out.println("The square " + squareNums+ "is=" +(squareNums*squareNums));
		}
		//Part D-
		//input numbers and determine the largest entered, the smallest entered
		// the average, the total, the range
		Scanner input=new Scanner(System.in);
		
		int largest=0, smallest=0, totalentered=0, range;
		double average=0;
		
		System.out.println("Enter the number");
		totalentered=input.nextInt();
		
		for(int count=1; count<=totalentered; count++){
			
			System.out.println("Please enter your number "+count);
			int num=input.nextInt();
			if(count==1){
				largest=num;
				smallest=num;
			}
			else{
				if (num>largest){
					largest=num;
					if(num<smallest){
					smallest=num;	
					}
				}//ends else
				average=average+1;
			}
		}
	}

}
