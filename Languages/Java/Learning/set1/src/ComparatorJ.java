import java.time.LocalDateTime;
import java.util.*;

/**
 * Comparable:
 * An interface containing compare(Key v, Key w)
 * Compares the two objects in alternative order, such as in terms of date or last name
 * Type can be specified via generics
 * Many classes and interfaces in Java implements this interface
 *
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html">Details of Comparator</a>
 */

public class ComparatorJ {
    public static void main(String[] args) {
        Files[] files = new Files[5];
        files[0] = new Files("Slides", 24);
        files[1] = new Files("Recipes", 90);
        files[2] = new Files("Notes", 23);
        files[3] = new Files("Homeworks", 103);
        files[4] = new Files("Photos", 899);
        System.out.println("By Time");
        Files.sortByDate(files);
        Files.show(files);
        System.out.println("By Name ");
        Files.sortByName(files);
        Files.show(files);


    }

    public static boolean less(Comparator c, Object v, Object w) {
        return c.compare(v, w) < 0;
    }

    public static <T> void exchange(T[] list, int i, int j) {
        T temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void selectionSort(Object[] list, Comparator comparator) {
        int N = list.length;
        ;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (ComparatorJ.less(comparator, list[j], list[min])) min = j;
            }
            ComparableJ.exchange(list, i, min);
        }
    }
}

class Files {
    private String name;
    private final int timeCreatedInHour; // I could use LocalDateTime, but for simplicity
    public static final Comparator<Files> BY_NAME = new ByName();
    public static final Comparator<Files> BY_TIME = new ByTime();

    public Files(String name, int timeCreatedInHour) {
        this.name = name;
        this.timeCreatedInHour = timeCreatedInHour;
    }

    private static class ByName implements Comparator<Files> {
        public int compare(Files v, Files w) {
            return v.name.compareTo(w.name);
        }
    }

    private static class ByTime implements Comparator<Files> {
        public int compare(Files v, Files w) {
            return v.timeCreatedInHour - w.timeCreatedInHour;
        }
    }

    public static void sortByName(Files[] files) {
        //lets sort the files by the Name
        ComparatorJ.selectionSort(files, Files.BY_NAME);
    }

    public static void sortByDate(Files[] files) {
        //lets sort the files by the date
        ComparatorJ.selectionSort(files, Files.BY_TIME);
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void show(Files[] files) {
        for (Files s : files) {
            System.out.println(s.toString());
        }
    }

    @Override
    public String toString() {
        return "Files{" +
                "name='" + name + '\'' +
                ", timeCreatedInHour=" + timeCreatedInHour +
                '}';
    }
}


