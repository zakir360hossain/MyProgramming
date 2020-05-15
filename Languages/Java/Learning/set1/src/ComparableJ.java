import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Comparable is an interface and it is often implemented to rearrange objects, often of user_defined types,
according to certain instance fields.

Difference between Comparable and Comparator: Comparator takes two objects and compare
Comparable takes one object
 */

class Student implements Comparable<Student>{
    int id, grade;
    String name;

    public Student(int id, int grade, String name) {
        this.id = id;
        this.grade = grade;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return grade<student.grade?1:-1;
    }
}

public class ComparableJ {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>(){{
            add(new Student(101, 89, "Joseph"));
            add(new Student(102, 99, "Zakir"));
            add(new Student(103, 96, "Jonathan"));
            add(new Student(104, 95, "Amber"));
        }};
        //Lets sort in descending by grade, before implementing Comparable in Student class
        //*Collections.sort(students); Exception, need to implement Comparable


        //After implementing Comparable
        Collections.sort(students);
        students.forEach(System.out::println);

        //Sorting according to name length with lambda, not touching the Student class
        Collections.sort(students, (i, j) -> i.name.length()>j.name.length()?1:-1);
        System.out.println("\nSorting According to name length");
        students.forEach(System.out::println);
    }
}
