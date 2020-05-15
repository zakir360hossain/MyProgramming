package recursion;

import java.util.*;


/**
 * @author Zakir Hossain
 * December 3, 2019
 * 			This program evaluates a piecewise function recursivel based on some conditions.
 *
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number please");
        int n = input.nextInt();

        // Calling the method
        System.out.println(func(n));
    }

    // Recursive Implementation
    public static int func(int x){
        if(x>1){
            return 2*func(x-1)+3;
        }
        else if (x==1){
            return 2;
        }
        else {
            return (int) Math.pow(func(x), 2);
        }
    }
}
