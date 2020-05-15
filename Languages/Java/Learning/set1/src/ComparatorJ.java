/*
An interface used to fully customize the way how objects in a user_defined class are arranged.
 */

import java.util.*;

// A user_defined class with name to use for Comparator.
class ForCom implements Comparator<Integer>{

    @Override
    // Orders the values according to the last digit
    public int compare(Integer o1, Integer o2) {
        if (o1%10>o2%10){
            return 1; // Means swap o1 and o2
        }
        return -1; // Does not swap them
    }
}

public class ComparatorJ {
    public static void main(String[] args) {
        Random rn = new Random();

        List<Integer> values = new ArrayList<>();
        for (int i = 0; i<15; i++){
            values.add(rn.nextInt((450-100)+1)+100);
        }

        List<Integer> values2 = values;

        // Using Comparator with name_defined user class
        Comparator<Integer> com = new ForCom();
        Collections.sort(values, com); // List.sort is best here, but for the sake of concept.
        for (int v:values){
            System.out.println(v);
        }

        // Using Comparator with anonymous inner class, lambda, and ternary operator in a single line
        // Orders the elements according to the last two digits
        // With Lambda, object type is not needed. Again, 1 means swap, -1 means no swap.
        Comparator<Integer> com2 = (o1, o2) -> o1%100>o2%100?1:-1;
        Collections.sort(values2, com2);
        System.out.println("With Anonymous, Lambda, etc.");
        for (int v2:values2){
            System.out.println(v2);
        }
    }

}



