package recursion;

import java.util.*;


/**
 * @author Zakir Hossain
 * December 5, 2019
 * This program computes the conversion of decimal to binary
 *
 */

public class BinaryInt {
    /**
     * This class determines the corresponding binary form of a decimal number
     */

    private int b;
    private int d;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        int a = input.nextInt();

        // Calling the method
        toBinary(a);

    }

    public BinaryInt(){

    }

    public static void toBinary(int decimal){
        if (decimal>0){
            toBinary(decimal/2);
            System.out.printf("%d", decimal%2);
        }
    }
    // These methods are not needed to be implemented; I needed to comment them because they were giving me errors

//    public binaryInt add(binaryInt other){
//
//    }
//    public String toString(){
//
//    }
//    public int compareTo(binaryInt other){
//
//    }




}
