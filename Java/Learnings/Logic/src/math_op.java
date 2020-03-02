import java.util.*;
/**
 *
 */

/**
 * @author Zakir Hossain September 19, 2019
 *          Program 2
 *         This program asks the user for two integers and asks if the user want to perform an operation on them.
 *
 */

public class math_op {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2;
        String operator_signifier; // Which operation to perform

        System.out.println("Enter the first number");
        number1 = input.nextInt();

        System.out.println("Enter the second number");
        number2 = input.nextInt();

        System.out.println("Which operation would you like to perform \n Add => A \n Subtract => S \n " +
                "Multiply => M \n Divide => D");
        operator_signifier = input.next();

        if (operator_signifier.equalsIgnoreCase("A")) {
            int sum = number1 + number2;
            System.out.println("The sum is " + sum);

        }
        else if (operator_signifier.equalsIgnoreCase("S")) {
            int difference = number1 - number2;
            System.out.println("The difference is " + difference);

        }
      else  if (operator_signifier.equalsIgnoreCase("M")) {
            int product = number1 * number2;
            System.out.println("The product is " + product);

        }
      else  if (operator_signifier.equalsIgnoreCase("M")) {
            double quotient = (double)number1 / number2;
            System.out.println("The quotient is " + quotient);

        }
      else{
            System.out.println( "'"+operator_signifier +"'" + " is an invalid operator.");
        }


    }
}
