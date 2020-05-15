package loop;

import java.util.*;

/**
 * @author Zakir Hossain
 * November 9, 2019
 * 			Ask the user to guess the number the program generates.
 *
 */


public class GuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rn = new Random();

        int guessed_num = 0;

        int rand_num = rn.nextInt(100);
        // The bound limit is exclusive and the lower boundary is 0 (inclusive) so to make it from 1 to 100 (inclusive)
        // needed to add one
        rand_num = rand_num +1;
        System.out.println(rand_num);

        int count = 1;
        while (guessed_num != -1){
            System.out.println("Guess the number");
            guessed_num =input.nextInt();

            if (guessed_num!=rand_num){
                if (guessed_num>rand_num && guessed_num!=-1){
                    System.out.println("To high, guess again or enter -1 to quit");
                }
                else if (guessed_num<rand_num && guessed_num!=-1){
                    System.out.println("To low, guess again or enter -1 to quit");

                }
                count++;
            }

            else if (guessed_num==rand_num){
                System.out.println("You Got It! It took you " +count +" guess (s)");
                count++;
                break;
            }

        }


    }
}
