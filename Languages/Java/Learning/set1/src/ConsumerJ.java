/*
Consumer is a predefined functional interface
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerJ {

    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(4, 5, 6, 6);
        //Using forEach to print elements of values. forEach() takes an object of Consumer
        Consumer<Integer> obj = i -> System.out.println(2*i);
        values.forEach(obj);

        //Creating Consumer object through lambda expression
        values.forEach(i -> System.out.println(2*i));

        //With method reference
        Consumer<Integer> obj2 = System.out::println;
        values.forEach(obj2);
        values.forEach(System.out::println);

    }
}
