import java.util.*;


/**
 * @author Zakir Hossain
 * November 9, 2019
 * 			Adding fractions. Denominator from 30 to 1 and numerator from 1 to 30
 *
 */
public class Fraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        double sum = 0;
        System.out.println("Enter a number that is no greater than 30 and no less than 1");
        number = input.nextInt();
        if (number<1 || number>30){
            System.out.println("Invalid number.");
        }
        else {
            number  = number+1;
            for (int i=1; i<number; i++){

                sum +=((double)(i) / (double)(number-i));
            }
            System.out.println(sum);

        }

    }
}
