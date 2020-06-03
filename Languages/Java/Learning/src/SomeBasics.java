
public class SomeBasics {

    public static void main(String[] args) {

        //Ternary Operator: condition?A:B
        //A if condition is true, B otherwise. Does not


        // Unlike Python, Java has right shift zero fill bitwise operator, other languages may have it as well
        System.out.println(14>>2); // right shift
        System.out.println(14>>>2); // right shift zero fill, for non-negative numbers, both results the same thing
        // However, for negative numbers, the results are different
        System.out.println(-14>>2);
        System.out.println(-14>>>2);


        //Upcasting and Down casting
        /*
        Upcasting is when casting a subtype to a supertype
        Down casting is the opposite, casting a supertype to subtype.
        */

        //Swapping values easily.
        int a = 5;
        int b = 6;
        b=a+b- (a=b);
        System.out.println(a+ " " +b);



    }
}
