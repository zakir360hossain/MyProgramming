import java.util.*;

public class Tester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] value = {1, 2, 3, 4,-9, 6, 10 };
		int max = value[0];
		int min = value[0];
		for (int i = 0; i < value.length; i++) {
			if (value[i] > max) {
				max = value[i];
			}
			if (value[i] < min) {
				min = value[i];
				}
			
		}
		System.out.println("Max: " + max + " Min: " + min);
		
		int[] list = {4,3,67,2,7,78};
		int[] temp =  new int [5];
		
		for (int i = 0; i < list.length; i++) {
			temp[i] = list[i];
			if ( list[i] > list[i+1]) {
				temp[i] = list [i+1];
			}
			
		}
		for (int j = 0; j < temp.length; j++) {
			System.out.println(j);
		}

	}

}
