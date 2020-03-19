import java.util.*;

/**
 * Requirement
 */

/**
 * @author Zakir Hossain
 * September 20, 2019
 * Read in an integer, have five cases, each will do something different. Includes a default case
 */

public class SwitchCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Please enter the number of ice cream flavors you like");
        number = input.nextInt();

        //This program can handle only five cases.
        switch (number) {
            case 1:
                System.out.println("One favorite");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("More than one flavor");
                break;
            case 5:
                System.out.println("You like all flavors");
                break;
            default:
                System.out.println("Invalid");
        }
        System.out.println("End");


    }
}
