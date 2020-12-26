package arraylist;

import java.util.ArrayList;

/**
 * @author Zakir Hossain
 * Jan 25, 2020
 * This program uses the Walker class to instantiate objects and uses ArrayList to
 * manipulate and compute data.
 */
public class TestWalker {
    public static void main(String[] args) {
        // Instantiations of four walkers
        Walker james = new Walker("James Mow", 10);
        Walker ethan = new Walker("Ethan Chedda", 20);
        Walker cleveland = new Walker("Clevend Angel", 30);
        Walker david = new Walker("David Bowie ", 40);
        ArrayList<Walker> walkers = new ArrayList<Walker>();

        // add method of ArrayList
        walkers.add(james);
        walkers.add(ethan);
        walkers.add(cleveland);
        walkers.add(david);

        System.out.println(walkers);

        System.out.println("\n");
        // Update method with the get() method of ArrayList
       walkers.get(0).updateMiles(30, true);
       walkers.get(2).updateMiles(100, false);


        Walker Peter = new Walker("Peter Faulkner ", 5);

        // set method of ArrayList
        walkers.set(3, Peter);

        // remove method of
        walkers.remove(1);
        System.out.println(walkers);

    }
}
