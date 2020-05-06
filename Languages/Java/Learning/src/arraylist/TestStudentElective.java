package arraylist;

import java.util.*;

/**
 * @author Zakir Hossain
 * Feb 2, 2020
 *
 * This is the main class for the Elective and the Student classes. It instantiates objects from both types and
 * it utilizes methods from both classes to manipulate and compute those objects.
 *
 */
public class TestStudentElective {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Elective course array list
        ArrayList<Elective> elective_courses = new ArrayList<>();

        // Instantiation of objects of type Elective and simultaneously
        // appending the objects to the array list of type Elective.
        Elective art = new Elective("Art", 5, 1);
        Elective cooking = new Elective("Cooking", 4, 4);
        Elective music = new Elective("Music", 3, 0);
        elective_courses.add(art);
        elective_courses.add(cooking);
        elective_courses.add(music);

        // Instantiations of 10 students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Daniel Aleardi"));
        students.add(new Student("Luke Albergo"));
        students.add(new Student("Vijay Anne"));
        students.add(new Student("Kelly Bane"));
        students.add(new Student("Korey Bell"));
        students.add(new Student("Morgan Bitzberger"));
        students.add(new Student("Chloe Brockson"));
        students.add(new Student("Brian Burton"));
        students.add(new Student("Kerry Collins"));
        students.add(new Student("Olivia Cordaro"));

        // Enhanced for loop to register students to course and adding course to student course list.
		for (Student student : students) {
				for (int i = 0; i<2; i++){
					System.out.println("Which elective are you choosing " + student.getName() + "?");
				System.out.println("Art (A)   Cooking (C)    Music (M) ");
				String course = input.nextLine();
				if (course.equalsIgnoreCase("A")) {
					art.addStudent(student);
					student.registerElective(art);
				}
				if (course.equalsIgnoreCase("C")) {
					cooking.addStudent(student);
					student.registerElective(cooking);
				}
				if (course.equalsIgnoreCase("M")) {
					music.addStudent(student);
					student.registerElective(music);
				}
			}

		}

		System.out.println("\n");
		System.out.println("From Elective class\n");
		System.out.println(art.getStudents());
		System.out.println("\n");
		System.out.println(cooking.getStudents());
		System.out.println("\n");
		System.out.println(music.getStudents());;

		System.out.println("\n\n" + "From Student class\n");
		for (Student student:students){
			System.out.println(student.toString() +"\n");

		}
    }

}
