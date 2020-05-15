package methods;

import java.util.*;


/**
 * @author Zakir Hossain
 * November 19
 * 			Program Description
 *
 */
public class StatWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        System.out.println("Enter all values");
        a = input.nextInt();
        b= input.nextInt();
        c =input.nextInt();

        System.out.println(average(a, b, c));
        System.out.println(median(a, b, c));
        System.out.println();
    }

    public static double average(int a, int b, int c){
        return (a+b+c)/3.0;
    }
    public static int median(int a, int b, int c){
        int lowest, middle, highest;
        lowest = Math.min(a, Math.min(b, c));
        highest = Math.max(a, Math.max(b, c));

        if (lowest ==a && highest==b){
            middle = c;
        }
        else if (lowest == a && highest==c){
            middle = b;
        }
        else {
            middle = a;
        }
        return middle;
    }
    public static void compare(int a, int m){
        if (a >m){
            System.out.println("Average is bigger");
        }
        else if (m>a){
            System.out.println("Median is bigger");
        }
        else {
            System.out.println("They are equal");
        }
    }
}
