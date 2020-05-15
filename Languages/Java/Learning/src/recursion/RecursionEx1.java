package recursion;

import java.util.*;

/**
 * @author Zakir Hossain
 * December 2, 2019
 * 			Recursion-  a mehod call itself
 *
 */
public class RecursionEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Will read a positive integer and add up all values, including the input.

        // Non-recursive
        System.out.println("Enter an integer");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);

        int sumRec = sum(n);
        System.out.println(sumRec);
    }

    public static int sum(int n){
        // Determine the end or break condition
        if (n<=1){
            return 1;
        }
        else {
            return (n+sum(n-1));
        }
    }
}
