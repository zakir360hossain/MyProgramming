package doublescriptedarray;

import java.util.*;

/**
 * @author Zakir Hossain
 * Jan 7, 2020
 * This program is being implemented in the style of OOPS. User will input an nxn double-scripted array by calling
 * function called 'isMagicSquare'. The program will determine if it's indeed a magic square or not.
 *
 * Definition of Magic Square:
 * - The sum of every rows, columns, prime diagonal, and secondary diagonal has to be the same.
 * - It has to be a square matrix (nxn dimmension).
 */
public class MagicSquare {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner input = new Scanner(System.in);
        // Initializing a 3x3 double-scripted array.
        int[][] square_matrix = new int[3][3];
        // Populating the values for the matrix, between 1 and 16 inclusive.
        for (int row = 0; row < square_matrix.length; row++) {
            for (int col = 0; col < square_matrix[0].length; col++) {
                square_matrix[row][col] = random.nextInt(16)+1;
            }
        }
        // Printing out the matrix with enhanced for loop, just in case.
        for (int[] row : square_matrix) {
            for (int col : row) {
                System.out.print(" " + col);
            }
            System.out.print("\n");
        }
        // Calling the isMagicSquare function to determine if the square matrix is a magic square.
        System.out.println(isMagicSquare(square_matrix));
    }
    public static String isMagicSquare(int[][] number) {
        int rowSum = 0;
        int colSum = 0;
        int prime_diagonal = 0;
        int secondary_diagonal = 0;

        // For accumulation of sums
        for (int row = 0; row < number.length; row++) {
            for (int col = 0; col < number.length; col++) {
                // Sum of all values in the array, by the row
                rowSum += number[row][col];
                //  Sum of all values in the array, by the column.
                colSum += number[col][row];
            }
            //Sum of the prime diagonal
            prime_diagonal += number[row][row];
            //Sum of the secondary diagonal
            secondary_diagonal += number[row][number.length - 1 - row];
        }
        // Sum from multiple ways. Basically, doubling the sum of all values in the array and adding the sum of prime
        // and the secondary diagonals.
        int totalSum = rowSum + colSum + secondary_diagonal + prime_diagonal;

        // This sum is assumed, based on the definition of a magic square. To use for conditional purposes.
        int assumedSum = ((2 * number.length) + 2) * prime_diagonal;

        // Putting all the conditions together, since all the values at the end has to be the same.
        // Most importantly, comparing the actual total sum with the assumed to sum.
        if (prime_diagonal == secondary_diagonal && rowSum == colSum && totalSum == assumedSum) {
            return  "This is a valid " + number.length + "x" + number.length + " Magic Square. " +
                    "The sums of all rows, columns, and diagonals are the same"+ prime_diagonal;
        } else {
            return "This is not a valid " + number.length + "x" + number.length + " Magic Square. " +
                    "The sums of all rows, columns, and diagonals are not the same";
        }
    }

}
