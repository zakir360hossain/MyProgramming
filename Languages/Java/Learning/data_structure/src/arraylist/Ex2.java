package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * @author Zakir Hossain
 * Decembe 8, 2019
 * This program takes 12 integers and turns them into an array. Then, the program separates the array into
 * different categories, such as odd, even, etc.
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Main array
        int[] valueList = new int[12];

        // Categorized arrays (from valueList array)
        // These are temporary Array Lists, just to use the add() method
        List<Integer> temp_even = new ArrayList<Integer>();
        List<Integer> temp_odd = new ArrayList<Integer>();
        List<Integer> temp_pos = new ArrayList<Integer>();
        List<Integer> temp_neg = new ArrayList<Integer>();

        for (int i = 0; i < valueList.length; i++) {
            System.out.println("Enter value # " + (i + 1));
            valueList[i] = input.nextInt();
        }
        // Enhanced for loops to extract the appropriate numbers into the temporary arrays for each category
        for (int element : valueList) {
            if (element % 2 == 0) {
                temp_even.add(element);
            }
            if (element % 2 != 0) {
                temp_odd.add(element);
            }
            if (element >= 0) {
                temp_pos.add(element);
            }
            if (element < 0) {
                temp_neg.add(element);
            }
        }

        // types.Converting the temporary arrays (Array List) to array objects.
        // These are the final arrays, these can be used. Categorized arrays (from valueList array)
        Integer[] even_nums = new Integer[temp_even.size()];
        even_nums = temp_even.toArray(even_nums);

        Integer[] odd_nums = new Integer[temp_odd.size()];
        odd_nums = temp_odd.toArray(odd_nums);

        Integer[] pos_nums = new Integer[temp_pos.size()];
        pos_nums = temp_pos.toArray(pos_nums);

        Integer[] neg_nums = new Integer[temp_neg.size()];
        neg_nums = temp_neg.toArray(neg_nums);


        // Copying the original array into a new array
        int[] add8 = valueList.clone();
        for (int i = 0; i < add8.length; i++) {
            add8[i] = add8[i] + 8;
        }

//         Reversing the original array with algorithm
        List<Integer> temp_reverse = new ArrayList<Integer>();
        for (int i = valueList.length - 1; i >= 0; i--) {
            temp_reverse.add(valueList[i]);
        }
        // types.Converting the List temp_reverse to array object
        Integer[] reversed_List = new Integer[temp_reverse.size()];
        reversed_List = temp_reverse.toArray(reversed_List);


//        Outputs (with conditions):
        System.out.println("Even List");
        if (even_nums.length > 0) {
            System.out.println(Arrays.toString(even_nums));
        } else {
            System.out.println("There are no even numbers in your list");
        }

        System.out.println("\n");
        System.out.println("Odd List");
        if (odd_nums.length > 0) {
            System.out.println(Arrays.toString(odd_nums));
        } else {
            System.out.println("There are no odd numbers in your list");
        }

        System.out.println("\n");
        System.out.println("Positive List");
        if (pos_nums.length > 0) {
            System.out.println(Arrays.toString(pos_nums));
        } else {
            System.out.println("There are no positive numbers in your list");
        }

        System.out.println("\n");
        System.out.println("Negative List");
        if (neg_nums.length > 0) {
            System.out.println(Arrays.toString(neg_nums));
        } else {
            System.out.println("There are no negative numbers in your list");
        }

        System.out.println("\n");
        System.out.println("New list after adding 8");
        System.out.println(Arrays.toString(add8));

        System.out.println("\n");
        System.out.println("Reversed version of the original array");
        System.out.println(Arrays.toString(reversed_List));
    }

}
