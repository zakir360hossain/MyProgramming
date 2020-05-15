package recursion;

import java.util.*;

/**
 * @author Zakir Hossain
 * December 3, 2019
 * 			This program evaluates piecewise function recursively based on some conditions.
 *
 */

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number");
        int n = input.nextInt();

        //Calling the method
        int ans = func(func(func(func(n))));
        System.out.println(ans);

    }
    // Recursive Implementation
    public static int func(int x){
        if (x<7){
            return func(x+2)+1;
        }
        else {
            return x-5;
        }
    }
}
