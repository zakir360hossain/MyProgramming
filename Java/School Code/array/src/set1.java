import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Zakir Hossain
 * Decembe 8, 2019
 * This program takes 12 integers and turns them into an array. Then, the program separates the array into
 * different categories, such as odd, even, etc.
 */
public class set1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Main array
        int[] valueList = new int[12];

        // Categorized arrays (from valueList array)
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        ArrayList<Integer> oddList = new ArrayList<Integer>();
        ArrayList<Integer> posList = new ArrayList<Integer>();
        ArrayList<Integer> negList = new ArrayList<Integer>();

        for (int i = 0; i < valueList.length; i++) {
            System.out.println("Enter value # " + (i + 1));
            valueList[i] = input.nextInt();
        }
        // This is the Enhanced for Loop in the recent version of java, not just for loop but more like 'For-each loop.
        // Here, the 'element' does not represent the index of the element, but the actual element itself. Very common
        // in Python Mrs. Hohwald. I hope you don't mind using this, it just makes things easier, given that I know
        // what's going on in here
        for (int element : valueList) {
            if (element % 2 == 0) {
                evenList.add(element);
            }
            if (element % 2 != 0) {
                oddList.add(element);
            }
            if (element >= 0) {
                posList.add(element);
            }
            if (element < 0) {
                negList.add(element);
            }
        }


        // Copying the original array into a new array
        int[] add8 = valueList.clone();
        for (int i = 0; i < add8.length; i++) {
            add8[i] = add8[i] + 8;
        }

//         Reversing the original array with algorithm
        ArrayList<Integer> reversedList = new ArrayList<Integer>();
        for (int i = valueList.length - 1; i >= 0; i--) {
            reversedList.add(valueList[i]);
        }


//        Outputs:

        System.out.println("Even List");
        if (evenList.toArray().length > 0) {
            System.out.println(Arrays.toString(evenList.toArray()));
        } else {
            System.out.println("There are no even numbers in your list");
        }

        System.out.println("\n");
        System.out.println("Odd List");
        if (oddList.toArray().length > 0) {
            System.out.println(Arrays.toString(oddList.toArray()));
        } else {
            System.out.println("There are no odd numbers in your list");
        }

        System.out.println("\n");
        System.out.println("Positive List");
        if (posList.toArray().length > 0) {
            System.out.println(Arrays.toString(posList.toArray()));
        } else {
            System.out.println("There are no positive numbers in your list");
        }

        System.out.println("\n");
        System.out.println("Negative List");
        if (negList.toArray().length > 0) {
            System.out.println(Arrays.toString(negList.toArray()));
        } else {
            System.out.println("There are no negative numbers in your list");
        }

        System.out.println("\n");
        System.out.println("New list after adding 8");
        System.out.println(Arrays.toString(add8));

        System.out.println("\n");
        System.out.println("Reversed version of the original array");
        System.out.println(Arrays.toString(reversedList.toArray()));
    }

}
