package practical;

import java.util.*;

/**
 * Requirement
 */

/**
 * @author Zakir Hossain
 * September 26, 2019
 * 			This is the test program for the flag object
 *
 */

public class TestFlag {

    public static void main(String[] args) {
        // Create a scanner object
        Scanner  input = new Scanner(System.in);

        //Create 3 flag objects
        Flag USA = new Flag(2, "National", "USA", 18, 24);
        Flag school = new Flag();
        Flag college = new Flag(1, "college");


        System.out.println(USA);

        double USAarea = USA.calcArea();

        System.out.println("USA flag area = " +USAarea);
        System.out.println(USA);

        String USAdata = USA.toString();
        System.out.println("\nUSA data is \n" + USAdata);
        System.out.println("USA type is: " + USA.getType());

        Flag Peirce = new Flag(1, "Middle School", "Peirce", 20, 8);
        System.out.println(Peirce);

        System.out.println(school);
        school.setHeight(20);
        school.setName("Henderson");
        school.setType("High School");
        school.setShape(1);
        school.setWidth(8);
        System.out.println(school);

        Flag Rustin = new Flag(1, "High School", "Rustin", 20, 8);
        if (school.equals(Rustin)){
            System.out.println("Rusting pennant and Henderson pennant are same");
        }
        if(Peirce.equals(school)){
            System.out.println("Peirce pennant is same as Henderson");
        }


    }
}
