import java.util.*;
/**
 * 
 */

/**
 * @author 20HossainZ
 * January 8, 2019
 * Find the integer with most divisors (between 1 and 100)
 * if several have the same  number
 * this code will indicate the first number found
 *
 */
public class LoopEx2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Varibale
		Scanner input=new Scanner(System.in);
		
		//Using the mod operation (%)-returns 0 if it is a divisor
		
		int largedivisor=1; //represent the number that has the largest number of divisors
		int mostdivisor=0; //represent the number of divisors
		
		System.out.println("what is the value you like to check up until?");
		int maxnumber=input.nextInt();
		
		
		for(int number=1; number<=maxnumber; number++ ){
			int countD=0;
			
			for(int i=1; i<=number; i++){
				if(number%i==0 ){
					countD=countD+1;
				}
					
			
			}
			if(countD>mostdivisor){
				mostdivisor=countD;
				largedivisor=number;
				
						
			}
		}
		System.out.println("The number with the largest amount of divisors is: " +largedivisor);
		System.out.println("It has:" + mostdivisor + " divisor");
		

	}

}
