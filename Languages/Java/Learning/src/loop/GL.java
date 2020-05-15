package loop;

import java.util.*;


public class GL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int greatest = Integer.MIN_VALUE, least = Integer.MAX_VALUE, number=0;
        int average, total;

        while (number != -99){
            System.out.println("First Integer (-99 to end)");
            number = input.nextInt();
            if(number > greatest){
                greatest = number;
            }
            if(number < least && number!=-99){
                least = number;
            }
        }
        System.out.println("Greatest: "+ greatest);
        System.out.println("Least: "+ least);

    }
}
