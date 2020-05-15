package loop;

import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Enter num1");
        num1 = input.nextInt();
        System.out.println("Enter num2");
        num2 = input.nextInt();

        int small = num1;
        if (num2<num1){
            small = Math.abs(num2);
        }
        for (int count = small;  count>=1; count--){
            if (num1 % count == 0 && num2 % count ==0){
                System.out.println("GCD: " + count);
                break;
            }
        }
    }
}
