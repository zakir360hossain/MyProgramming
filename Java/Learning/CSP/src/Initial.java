import java.util.*;
/**
 * 
 */

/**
 * @author 20hossainz
 * January 30, 2019
 * Finding the largest and smallest elements in an array
 *
 */
public class Initial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random input=new Random();
		// Create an array of 10 doubles
		
		//The index value for the initial element in an array is zero
		double [] data = new double[10];
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;

		for (int i = 0; i < data.length; i++){
			data[i]=input.nextDouble()*100;
			if (data[i] > max){
				max = data[i];
			}
			if (data[i] < min) {
				min = data[i];


			}
		}
		System.out.println("The largest element in the array is: " + max);
		System.out.println("The smallest element in the array is: " + min);

	}

}
