package practical;

import java.util.ArrayList;

public class Hailstone {

	public static int hailstoneLength(int n){
		ArrayList arr = new ArrayList();

		while(n>1){
			arr.add(n);
			if (n % 2 == 0){
				n = n/2;
			}
			else {
				n = 3*n+1;
			}
		}

		arr.add(1);
		return  arr.size();
	}

	public static boolean isLongSeq(int n){
		return hailstoneLength(n) > n;
	}

	public static double proLong(int n){
		double counter = 0;
		// one will never lead to be Long
		while (n>1){
			if (isLongSeq(n)){
				counter+=1;
			}
			n--;
		}
		return counter/n;
	}
}