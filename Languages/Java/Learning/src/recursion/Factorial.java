package recursion;

import java.util.*;

/**
 * @author Zakir Hossain
 * December 3, 2019
 * 			Calculate the factorial of a given integer in two ways: non-recursively and recursively.
 *
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integer");
        // Data-type long is best suited because factorial get extremely bigger.
        long n = input.nextInt();

     // Non-recursive implementation
     long result = 1;

     if (n==0){
         result = 1;
     }
     else if (n>1){
         for (long i=n; i>=1; i--){
             result*=i;
         }
     }


        System.out.println(result);

     // Calling the recursive method
        System.out.println(factorial(n));

    }

    // Recursive Implementation
    public static long factorial(long n){
        if (n ==0){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
