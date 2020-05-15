package recursion;

import java.util.*;

public class RecursionEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        int n = input.nextInt();

        System.out.println(outpu(5));

    }
    public static int outpu(int n){
     if (n>=7 || n<=0){
         return 1;
     }
     else {
         return (outpu(n-1));
     }
    }
}
