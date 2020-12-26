/**
 * Comparable:
 * An interface containing compareTo()
 * Compares this object with the given object in its natural order
 * Type can be specified via generics
 * Many classes and interfaces in Java implements this interface
 *
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html">Details of Comparable</a>
 */

public class ComparableJ {
    public static void main(String[] args) {
        Integer a = 0, b = 1;
        System.out.println(less(a, b)); // Works because Integer implements Comparable<Integer>

        Student[] students = new Student[4];
        students[0] = new Student(101, 89, "Joseph");
        students[1] = new Student(102, 99, "Zakir");
        students[2] = new Student(103, 96, "Jonathan");
        students[3] = new Student(104, 95, "Amber");
        Student.sort(students);
        Student.show(students);

    }

    public static<T extends Comparable<? super T>> boolean less(T v, T w) { return v.compareTo(w) < 0;}
    public static boolean lessRaw(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static <T> void exchange(T[] list, int i, int j){
        T temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    public static void selectionSort(Comparable[] list) {
        int N = list.length;

        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if(ComparableJ.less(list[j], list[min])) min = j;
            }
            ComparableJ.exchange(list, i, min);
        }
    }
}

class Student implements Comparable<Student> {
    int id, grade;
    String name;

    public Student(int id, int grade, String name) {
        this.id = id;
        this.grade = grade;
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        if (grade > student.grade) return +1;
        else if (grade < student.grade) return -1;
        return 0;
    }

    public static void sort(Student[] students) {
        //lets sort the students by their grade
        ComparableJ.selectionSort(students);
    }

    public static void show(Student[] students) {
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }
}