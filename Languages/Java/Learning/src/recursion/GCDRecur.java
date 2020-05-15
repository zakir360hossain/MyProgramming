package recursion;

import java.util.*;
/**
 * @author Zakir Hossain
 * Dec 3, 2019
 * 			Program Description
 *
 */
public class GCDRecur {
    /**
     *
     * Finds the gcd of two numbers
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2;
        System.out.println("Enter the 2 numbers");
        n1 = input.nextInt();
        n2 = input.nextInt();

        //Non-recursive
        int largest = Math.max(n1, n2);
        int GCD_n = 1;

        for (int i  = largest; i>=1; i--){
            if(n1%i == 0 && n2%i==0){
                GCD_n = i;
                break;
            }
        }
        System.out.println(GCD_n);
        int gcd = calc_gcd(n1, n2);
        System.out.println(gcd);

    }

    public static int calc_gcd(int n1, int n2){
        if (n1 % n2 == 0){
            return n2;
        }
        else {
            int value = calc_gcd(n2, n1%n2);
            return value;
        }
    }
}
