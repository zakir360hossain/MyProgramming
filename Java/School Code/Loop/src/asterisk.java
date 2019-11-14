import java.util.*;

/**
 * Requirement
 */

/**
 * @author Zakir Hossain
 * Date
 * Program Description
 */
public class asterisk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables
        String figType = "";
        int number, height, width;

        System.out.println("What is the figure type you are trying to draw?");
        figType = input.nextLine();

        if (figType.equalsIgnoreCase("S") || figType.equalsIgnoreCase("H") ||
                figType.equalsIgnoreCase("L") || figType.equalsIgnoreCase("T")) {

            System.out.println("Enter the height please");
            height = input.nextInt();
            System.out.println("Enter the number of figures to be repeated");
            number = input.nextInt();

            // Done
            if (figType.equalsIgnoreCase("S")) {

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height; j++) {
                            System.out.print(" *");
                        }
                        System.out.println(" ");
                    }
                    System.out.print(" ");
            }


            if (figType.equalsIgnoreCase("H")){
                for (int i=1; i<=height; i++){
                    for (int j = height; j>=i; j--){
                        System.out.print(" *");
                    }
                    System.out.println(" ");
                }
            }


            if (figType.equalsIgnoreCase("L")){
                for (int i=1; i<=height; i++){
                    for (int j = 1; j<=i; j++){
                        System.out.print(" *");
                    }
                    System.out.println(" ");
                }
            }


        } else if (figType.equalsIgnoreCase("B")) {
            System.out.println("Enter the height please");
            int length = input.nextInt();
            System.out.println("Enter the width");
            width = input.nextInt();
            System.out.println("Enter the number");
            number = input.nextInt();
            for (int i=1; i<=width; i++){
                for (int j = 1; j<=length; j++){
                    System.out.print(" *");
                }
                System.out.println(" ");
            }
        }
    }
}
