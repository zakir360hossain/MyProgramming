package methods;

import java.util.*;

/**
 * @author Zakir Hossain
 * November 20, 2019
 *
 * 		This program gets a woodlenght, pieces out into 5 and 2 meter segments and determines
 * 	how mucb is left.
 *
 */
public class CarpenterWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double woodLength, surplus;
        int num5, num2;
        int counter_2 = 0;
        int counter_5 = 0;
        double total_surplus = 0;

        do {
            System.out.println("Enter the woodLength. Enter 0 to quit");
            woodLength = input.nextInt();

            // Input cannot be less than 2
           while (woodLength<2 && woodLength!=0){
               System.out.println("Invalid number. enter again");
               woodLength = input.nextInt();

           }
           if (woodLength>=2){
                num5 = d5(woodLength);

                num2 = d2(woodLength - num5*5);

               surplus = woodLength - (num5*5) - (num2*2);
               total_surplus +=surplus;
               counter_2 +=1;
               counter_5 +=1;
               System.out.println("5-meter: " +num5 + " \n2-meter: " + num2 + "\nsurplus: "+surplus );

           }

        }while (woodLength!=0);

        System.out.println("The number of 5-meter wood segment: "+ counter_5);
        System.out.println("The number of 2-meter wood segment: "+ counter_2);
        System.out.println("The cumulative surplus wood: "+ total_surplus);

    }

    public static int d5(double x){
        return (int) (x / 5);
    }
    public static int d2(double x){
        return (int) (x / 2);
    }
}
