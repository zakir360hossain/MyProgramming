import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
java.util.stream (1.8)
stream contains classes to support functional-style operations on streams of elements.

The API gives advantage for multithreading and working with huge data
Stream object cannot be used more than once, it is not for preserving, but simply processing data.

Two types of stream:  Sequential and Parallel
Parallel Stream is for bigger size data, like length > 1000.

Interfaces
1. BaseStream<T,S extends BaseStream<T,S>>
   Base interface for streams, which are sequences of elements supporting sequential and parallel aggregate operations.
2. Collector<T,A,R>
   A mutable reduction operation that accumulates input elements into a mutable result container, optionally
   transforming the accumulated result into a final representation after all input elements have been processed.
3. DoubleStream
   A sequence of primitive double-valued elements supporting sequential and parallel aggregate operations.
4. DoubleStream.Builder
   A mutable builder for a DoubleStream.
5. IntStream
   A sequence of primitive int-valued elements supporting sequential and parallel aggregate operations.
6. IntStream.Builder
   A mutable builder for an IntStream.
7. LongStream
   A sequence of primitive long-valued elements supporting sequential and parallel aggregate operations.
8. LongStream.Builder
   A mutable builder for a LongStream.
9. Stream<T>
   A sequence of elements supporting sequential and parallel aggregate operations.
10.Stream.Builder<T>
   A mutable builder for a Stream.

Common methods:
Intermediate: filter(), map()
Terminate: findFirst(), forEach()
=================================
distinct(), sorted(), limit(), skip(), toArray(),anyMatch(), allMatch(), boxed()
average(), min(), max(), sum(), count()
Static: of(), range()


 */


public class Streams {

    public static void main(String[] args) {

        int [] numbers = {4, 2, 345, 56, 23};
        //IntStream is an interface
        OptionalInt min = (IntStream.of(numbers).min()); // gets the minimum, not as int
        int min2 = (IntStream.of(numbers).min().getAsInt());// As integer, Exception if array is empty
        IntStream.of(numbers).min().ifPresent(System.out::println); // Prints if there is minimum

        // IntSummaryStatistics gives count, min, max, average, sum
        IntSummaryStatistics stat = IntStream.of(numbers).summaryStatistics();
        System.out.println(stat.getAverage());

        // Gets three smallest distinct numbers with method chaining
        //Chain: create (IntStream), process(distinct, sorted, limit), consume(forEach)
        IntStream.of(numbers).distinct().sorted().limit(3).forEach(System.out::println);

        //IntSteam.range() creates a range when there is no array

        //Checks if any of the elements is odd
        boolean hasOdd = IntStream.of(numbers).anyMatch(num -> num%2==1);
        //Checks if all elements are odd
        boolean allOdd = IntStream.of(numbers).allMatch(num -> num%2==1);


        //Stream works with objects
        List<Integer> values = new ArrayList<Integer>(){{
            for (int i= 1; i<=10; i++){
                add(i);
            }
        }};
        values.stream().forEach(System.out::println); // Java added stream() method to Collection interface

        Stream<Integer> s = values.stream();
        //s.forEach(System.out::println); Will work
        //s.forEach(System.out::println); Exception, because Stream object works once

        // Gets the names of 3 highest salary employees
        List<Employee> employees = new ArrayList<>();
        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .limit(3).map(Employee::getName)
                .forEach(System.out::println);

        // Puts the names of 5 highest salary employees who are active into a list
        List<String> names = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .filter(Employee::isActive)
                .limit(3)
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

}

class Employee{
    private int salary;
    private String name;

    public int getSalary(){return salary;}
    public String getName() { return name;}
    public static  boolean isActive(Employee e){return true;}
}

