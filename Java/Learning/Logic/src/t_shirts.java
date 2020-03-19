import java.util.*;
/**
 *
 */

/**
 * @author Zakir Hossain September 19, 2019
 *          Program 3
 *         This program calculates the total price of t-shirts. Depending on the number of t-shirts
 *         bought the program discounts a certain percentage. There is a 6% tax.
 *
 *         Quantity         Discount
 *         100 - 350         20%
 *         351 - 500         30%
 *         501 - 999         40%
 *         1000 or more      50%
 */


public class t_shirts {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // The t-shirt'sprice has to be declared in a way that it's immutable because it
        // is a constant number that will remain same.
        final double T_SHIRT_PRICE = 24.95, TAX;
        double cost = 0, final_cost;
        int t_shirt_quantity;

        System.out.println("How many t-shirts are ordered?");
        t_shirt_quantity = input.nextInt();
        double gross_cost = T_SHIRT_PRICE*t_shirt_quantity;

        if(t_shirt_quantity>=0) {
            if (t_shirt_quantity < 100) {
               cost = gross_cost;
            }

            else if (t_shirt_quantity >= 100 && t_shirt_quantity <= 350) {
                System.out.println("Discount Percentage: 20%");
                cost = gross_cost* 0.8;
            }

           else if (t_shirt_quantity >= 351 && t_shirt_quantity <= 500) {
                System.out.println("Discount Percentage: 30%");
                cost = gross_cost * 0.7;
            }

           else if (t_shirt_quantity >= 501 && t_shirt_quantity <= 999) {
                System.out.println("Discount Percentage: 40%");
                cost = gross_cost * 0.6;
            }

          else if (t_shirt_quantity >= 1000) {
                System.out.println("Discount Percentage: 50%");
                cost = gross_cost * 0.5;
            }
          TAX = Math.round(0.06*cost*100.0)/100.0;

            final_cost = cost+TAX;  // Applying the 6% tax at this time.

            gross_cost = Math.round(gross_cost *100.0)/100.0;
            final_cost = Math.round(final_cost *100.0)/100.0;

            System.out.println("Gross Cost: $" + gross_cost);
            System.out.println("Cost after discount(net): $"+ cost);
            System.out.println("Tax:        $"+TAX);
            System.out.println("Total cost: $"+final_cost);
        }
        else{
            System.out.println("The quantity cannot be a negative number");

        }

    }
}
