package arraylist;

import java.util.*;

/**
 * @author Zakir Hossain
 * Jan 27, 2020
 * This is the main for Swimmer class. It initializes several objects with array list and
 * calls multiple methods and functions of array list to several objects. The methods from the
 * Swimmer class are also being called at the end, such as equals() and changeTime(). The data
 * gets manipulated and the elements also get rearranged multiple times. The objects are printed
 * at the end.
 */
public class SwimTeam {
    public static void main(String[] args) {

        ArrayList<Swimmer> swimmers = new ArrayList();

        swimmers.add(new Swimmer("Mr.Finch", 45.45));
        swimmers.add(new Swimmer("Mr.Marks", 12.12));
        swimmers.add(new Swimmer("Mr.McNichol", 32.32));
        swimmers.add(new Swimmer("Mr.Fisher", 32.32));

        // Adding a new swimmer to spot 0
        swimmers.set(0, new Swimmer("Mr. Carlton", 80.8));
        // Adding another swimmer to the end of the array list
        swimmers.add(new Swimmer("Mr. Johnson", 70.56));
        System.out.println(swimmers);
        // Getting swimmer at position 1
        System.out.println(swimmers.get(1));

        // This removes swimmer in position 3 from the array and then adds it to the end.
        swimmers.add(swimmers.remove(3));
        System.out.println(swimmers);

        // Creating a new swimmer and inserting it to the 3rd position of swimmers list
        // placing the older swimmer to the end
        System.out.println(swimmers);
        Swimmer temp_swimmer = swimmers.remove(3);
        Swimmer new_swimmer = new Swimmer("Mr. Ronald", 100.1);
        swimmers.set(3, new_swimmer);
        swimmers.add(temp_swimmer);
        System.out.println(swimmers);

        // Using methods from the Swimmer class
        System.out.println(swimmers.get(2).getTime());
        System.out.println(swimmers.get(2).getName());
        swimmers.get(3).changeTime(300);
        System.out.println(swimmers.get(0).equals(swimmers.get(2)));

        System.out.println(swimmers);





    }

}
