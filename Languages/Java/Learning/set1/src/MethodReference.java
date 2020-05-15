import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*

 */

public class MethodReference {

    public static void main(String[] args) {

        int[] num = {256, 354, 7546, 23, 45, 67};
        List<Integer> v = new ArrayList<>();
        for (int e : num) {
            v.add(e);
        }
        // Passing a function to forEach
        // To show compiler to println is a method, :: is needed.
        // Converting Lambda Expression to Method Reference.
        v.forEach(System.out::println);

    }
}
