/*
Lambda Expression are often used to implement bodies of an interface.
Conceptually, lambda are shorthand for Anonymous Inner class.
 */

import java.util.ArrayList;
import java.util.List;

interface Extract {
    List<Integer> lastTwoDigits(int[] id);
}

public class LambdaExpression {

    public static void main(String[] args) {
        int[] num = {256, 354, 7546, 23, 45, 67};
        List<Integer> values = new ArrayList<>();
        for (int e : num) {
            values.add(e);
        }
        // Prints the last 2 digits of each element using lambda expresion (->)
        // The forEach method takes an object of Consumer
        values.forEach(e -> System.out.println(e % 100));

        // Converting Lambda Expression to Method Reference.
        values.forEach(System.out::println);

        // Using Lambda expression when implementing an anonymous inner class for interface
        Extract e = (id) -> {
            List<Integer> lastTwo = new ArrayList<>();
            for (int elem : id) {
                lastTwo.add(elem % 100);
            }
            return lastTwo;
        };
        System.out.println(e.lastTwoDigits(num));

    }
}
