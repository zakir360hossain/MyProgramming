package practical;

/**
 * @author Zakir Hossain
 * Feb 26, 2020
 * This main class is for testing the practical.Student and its child classes, and the practical.Team class.
 */
public class TestStudent {
    public static void main(String[] args) {

        // Instantiation of practical.Student for two objects
        Student student1 = new Student("Ethan Chedda", 8);
        Student student2 = new Student("Julia Lee", 7);
        System.out.println("\n==============Regular Students=============");
        System.out.println(student1 + "\n"+student2);

        // Instantiation of practical.StudentAthlete for two objects
        StudentAthlete stAthlete1  = new StudentAthlete("Mohan Kumar", 2, "Tennis");
        StudentAthlete stAthlete2 = new StudentAthlete("Vijay Ann", 4, "Volleyball");
        System.out.println("\n==============Athletic Students=============");
        System.out.println(stAthlete1+ "\n"+stAthlete2);
        System.out.println("Are the two athletes above play the same sports?  "+stAthlete1.areSameSport(stAthlete2));

        // Instantiation of practical.GraduateStudent for two objects
        GraduateStudent student3 = new GraduateStudent("Morgan Sanderson", 6,
                "Computer Science");
        GraduateStudent student4 = new GraduateStudent("Arnold Freeman", 6,
                "Computer Science");

        System.out.println("\n==============Graduate Students=============");
        System.out.println(student3 + "\n" +student4);
        System.out.println("Are the two graduate students pursuing same degree? "+student3.areSameDegree(student4));
        System.out.println();


        // Instantiation of practical.GraduateStudent for two objects
        System.out.println("\n============practical.Team============\nBegin entering data for the objects (henderson and east)" +
                " created with the type practical.Team");
        Team henderson = new Team("Warrior", "Basketball");
        Team east = new Team("Cherokee", "Football");
        System.out.println(henderson);
        System.out.println(east);

    }
}
