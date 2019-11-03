import java.util.*;

public class Tester_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 100, y=200, z=3;

        System.out.println(( x == y && x != z ) || ( x != y && x == z ));

        System.out.println((x == y && x == z ) && ( x != y && x != z));

        System.out.println(( x == y) != ( x == z ));
    }
}
