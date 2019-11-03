import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leftover, van_remainder;

        System.out.println("Enter left");
        leftover = input.nextInt();

       int  van_count = leftover/12;


        van_remainder = leftover%12;

        if(van_remainder>=0 && van_remainder<5){
            van_count=van_count;
        }

        else if(van_remainder>=5) {
            van_count+=1;
        }

        System.out.println(leftover);
        System.out.println(van_remainder);
        System.out.println(van_count);
    }
}
