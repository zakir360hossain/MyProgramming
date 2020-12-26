package doublescriptedarray;

import java.util.*;
import java.util.Random;

/**
 * @author Zakir Hossain
 * Jan 2, 2020
 *
 * This program is fairly the basic of double-scripted, matrix-like, arrays in Java. Here, one matrix is generated
 * through the user, and is being manipulated and performed certain computations using Enhanced for-loops.
 * A second matrix, n x n, is being generated randomly, and still being performed certain computations.
 */

/**
 * @author Zakir Hossain
 * Jan 2, 2020
 *  Program descriptio
 */
public class DoubleScriptedArray {

    public static void main(String[] args) {
        double[][] numbers = new double[4][5];
//        rows are always first in the array declaration so in the example: 4 rows and 5 columns.


        Scanner input = new Scanner(System.in);
        Random input2 = new Random();
//
//       read in the data
//               go through the table row, then columns
//               the .length of the array is the number of rows in the table
//               in the ex, .length is 4

       for (int row = 0; row < numbers.length; row++) {
           for (int col = 0; col < numbers[0].length; col++) {
               System.out.println("Enter data for row: " + (row + 1) + " column: " + (col + 1));
               numbers[row][col] = input.nextDouble();
           }
       }
       //Print the table using an enhanced for loop
       //print the data in row/column table format.

       for (double[] row : numbers) {
           for (double col : row) {
               System.out.print(col + "\t");

           }
           System.out.print("\n");
       }

       double sumCol3 = 0, sumRow2 = 0, sameIndex = 0;
       for (int row = 0; row < numbers.length; row++) {
           sumCol3 += numbers[row][2];
       }

       for (int col = 0; col < numbers[1].length; col++) {
           sumRow2 += numbers[1][col];
       }

       System.out.println("Sum of column 2  = " + sumCol3);
       System.out.println("Sum of row 2 = " + sumRow2);

       // Sum of values that have the same row/column index

       for (int row = 0; row < numbers.length; row++) {
           for (int col = 0; col < numbers[0].length; col++) {
               if (row == col) {
                   sameIndex = sameIndex + numbers[row][col];
               }
           }
       }
       System.out.println("Sum of all same index values = " + sameIndex);

        int[][] matrix = new int[6][6];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = input2.nextInt(36)+1;
            }
        }
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + "\t");

            }
            System.out.print("\n");
        }

        // Sum of both diagonals
        int left_diagonals_sum = 0, right_diagonals_sum = 0, both_diagonals_sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (row == col) {
                    left_diagonals_sum += matrix[row][col];
                }
                if (row == matrix.length - col -1){
                    right_diagonals_sum +=matrix[row][col];
                }
            }
        }
        both_diagonals_sum = left_diagonals_sum + right_diagonals_sum;

        System.out.println("\n");
        System.out.println("The sum of both diagonals = " +both_diagonals_sum);
    }
}
