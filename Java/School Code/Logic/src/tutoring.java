import java.util.*;
/**
 *
 */

/**
 * @author Zakir Hossain September 19, 2019
 *          Program 1
 *         This program generates two random numbers and output an addition
 *         expression with the two numbers in such a way that the user
 *         (students) can find the sum.
 *
 */
public class tutoring {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rn = new Random();

        int number1, number2;

        // Generating random numbers between 1 to 99.
        number1 = rn.nextInt(100) + 1;
        number2 = rn.nextInt(100) + 1;

        int real_answer = number1 + number2;
        int user_entered_answer;
        int retry_signifier;

        System.out.println("What is the sum: " + number1 + "+" + number2 + " = ?");
        user_entered_answer = input.nextInt();

        if (user_entered_answer == real_answer) {
            System.out.println("Congratulations!");
            return;
        }

        // Gives a retry when the answer is wrong in the first attempt.
        while (user_entered_answer != real_answer) {
            System.out.println("Sorry, that's incorrect! To try again, enter 1, otherwise enter any other number");
            retry_signifier = input.nextInt();
            if (retry_signifier == 1) {
                System.out.println("What is the sum: " + number1 + "+" + number2 + " = ?");
                user_entered_answer = input.nextInt();

                if (user_entered_answer == real_answer) {
                    System.out.println("Congratulations!");
                    return;
                }

            } else {
                System.out.println("You will get it next time!");
                return;
            }

        }
    }
}

