import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

/**
 * An array is partially sorted if the number of inversions is ≤ cN (c is a constant)
 * Def. An inversion is a pair of elements in a list that are out of order
 */
@SuppressWarnings("unchecked")
class ElementarySortingAlgorithms {
    public static void main(String[] args) {
        Integer[] list = {34, 17, 23, 35, 45, 9, 1};
        System.out.println("Original: ");
        show(list);

        System.out.println("Selection: ");
        selectionSort(list);
        show(list);
        selectionSort(list, true);
        show(list);

        System.out.println("Insertion");
        insertionSort(list);
        show(list);
        insertionSort(list, true);
        show(list);

        System.out.println("Shell:");
        shellSort(list);
        show(list);
        shellSort(list, true);
        show(list);

        System.out.println("Merge:");
        MergeSort.mergeSort(list);
        show(list);
        MergeSort.mergeSort(list, true);
        show(list);

        System.out.println("Bottom Up Merge:");
        MergeSort.bottom_upMergeSort(list);
        show(list);


    }

    /**
     * Implementation of selection sort with generics
     * Algorithm step:
     * In iteration i, find the index min of smallest remaining entry, swap array[i] and array[min].'
     * compares: 1/2N^2
     * exchanges: N
     * Running time insensitive to input
     * Reverse: min=max, smallest = largest, rests hold true.
     *
     * @param list list being sorted
     * @param <T>  type of list
     */

    //This is possible because almost all common data types (String, Integer, etc.) implements compareTo()
    //And T will ultimately become one of this data type
    public static <T extends Comparable<? super T>> void selectionSort(T[] list) {
        int N = list.length;

        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (ComparableJ.less(list[j], list[min])) min = j;
            }
            ComparableJ.exchange(list, i, min);
        }
        assert isSorted(list);
    }

    public static <T extends Comparable<? super T>> void selectionSort(T[] list, boolean reverse) {
        int N = list.length;

        if (!reverse) {
            selectionSort(list);

        } else {
            for (int i = 0; i < N; i++) {
                int max = i;
                for (int j = i + 1; j < N; j++) {
                    if (ComparableJ.less(list[max], list[j])) max = j;
                }
                ComparableJ.exchange(list, i, max);
            }

        }
        assert isSorted(list);

    }

    /**
     * Implementation of Insertion sort with generics
     * Algorithm step:
     * In iteration i, swap array[i] with each larger entry to its left.
     * compare: ~1/4N^2
     * exchange: ~1/4N^2
     * Best case (if already in ascending): N-1 compares and 0 exchange
     * Worst cases (if initially in descending order): ~1/2N^2 compares and ~1/2N^2 exchange
     * Partially Sorted: linear time (exchanges=inversions); compares=exchanges+(N-1)
     * Reverse: larger = smaller, rests hold true.
     *
     * @param list list being sorted
     * @param <T>  type of list
     */
    public static <T extends Comparable<? super T>> void insertionSort(T[] list) {
        int N = list.length;

        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (ComparableJ.less(list[j], list[j - 1])) ComparableJ.exchange(list, j, j - 1);
                else break;
            }
        }
        assert isSorted(list);
    }

    public static <T extends Comparable<? super T>> void insertionSort(T[] list, boolean reverse) {
        int N = list.length;
        if (!reverse) {
            insertionSort(list);
        } else {
            for (int i = 0; i < N; i++) {
                for (int j = i; j > 0; j--) {
                    if (ComparableJ.less(list[j - 1], list[j])) ComparableJ.exchange(list, j - 1, j);
                    else break;
                }
            }
        }
        assert isSorted(list);
    }

    /**
     * Move the entries more than one position at a time by h-sorting the array
     * [Shell 1959] h-sort array for decreasing sequence of values of h
     * How to h-sort an array? Insertion sort, with stride length h instead of 1 when moving to the left entries.
     * which sequence for h to use? options: (2^n)-1 maybe, 3n+1 OK, [1, 5, 19, 41, 109,
     * ...merging of (9*46^i)-(9*2^i)+1 and 4^n-(3*2^n)+1 Good
     * <p>
     * See document for running time analysis
     *
     * @param list list being sorted
     * @param <T>  type of list
     */
    public static <T extends Comparable<? super T>> void shellSort(T[] list) {
        int N = list.length;
        int h = 1;
        while (h < N / 3) h = 3 * h + 1; //using 3n+1
        //h-sort the array
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && ComparableJ.less(list[j], list[j - h]); j -= h) {
                    ComparableJ.exchange(list, j, j - h);
                }
            }
            h /= 3;
        }
        assert isSorted(list);
    }

    public static <T extends Comparable<? super T>> void shellSort(T[] list, boolean reveres) {
        int N = list.length;
        int h = 1;
        if (!reveres) shellSort(list);
        else {
            while (h < N / 3) h = 3 * h + 1; //using 3n+1
            //h-sort the array
            while (h >= 1) {
                for (int i = h; i < N; i++) {
                    for (int j = i; j >= h && ComparableJ.less(list[j - h], list[j]); j -= h) {
                        ComparableJ.exchange(list, j - h, j);
                    }
                }
                h /= 3;
            }
        }
        assert isSorted(list);
    }

    /**
     * Java use this sort technique to sort objects
     * And used by many other tools.
     */
    public static class MergeSort {

        public static <T extends Comparable<? super T>> void mergeSort(T[] list) {
            T[] aux = (T[]) new Comparable[list.length];
            sort(list, aux, 0, list.length - 1);
            assert isSorted(list);
        }

        public static <T extends Comparable<? super T>> void mergeSort(T[] list, boolean reverse) {
            T[] aux = (T[]) new Comparable[list.length];
            if (!reverse) mergeSort(list);
            else sort(list, aux, list.length - 1, 0);
        }

        /**
         * Pass through array, merging subarrays of size 1.
         * Repeat for subarrays of size 2, 4, 8, 16.
         * No recursion is required.
         *
         * @param <T>
         */
        public static <T extends Comparable<? super T>> void bottom_upMergeSort(T[] list) {
            int N = list.length;
            T[] aux = (T[]) new Comparable[list.length];
            for (int sz = 1; sz < N; sz = 2 * sz) {
                for (int lo = 0; lo < N - sz; lo += 2 * sz) {
                    merge(list, aux, lo, lo + sz - 1, Math.min(lo + 2 * sz - 1, N - 1));
                }
            }
        }

        public static <T extends Comparable<? super T>> void sort(T[] list, T[] aux, int lo, int hi) {
            if (hi <= lo) return;
            int mid = lo + (hi - lo) / 2;
            sort(list, aux, lo, mid);
            sort(list, aux, mid + 1, hi);
            merge(list, aux, lo, mid, hi);
        }

        /**
         * Basic plan:
         * Divide array into two halves
         * Recursively sort each half
         * Merge the two halves
         * Goal:
         * Given two sorted subarrays a[lo] to a[mid] and a[mid+1] to a[hi], replace with sorted subarray a[lo] to a[hi]
         *
         * @param list
         * @param <T>
         */
        public static <T extends Comparable<? super T>> void merge(T[] list, T[] aux, int lo, int mid, int hi) {
            //Preconditions
            assert isSorted(list, lo, mid);
            assert isSorted(list, mid + 1, hi);

            //copying to aux[]
            if (hi + 1 - lo >= 0) System.arraycopy(list, lo, aux, lo, hi + 1 - lo);

            int i = lo, j = mid + 1;
            for (int k = lo; k <= hi; k++) {
                if (i > mid) list[k] = aux[j++];
                else if (j > hi) list[k] = aux[i++];
                else if (ComparableJ.less(aux[j], aux[i])) list[k] = aux[j++];
                else list[k] = aux[i++];
            }
            //Post-condition
            assert isSorted(list, lo, hi);
        }
    }

    public static class QuickSort {
        public static <T extends Comparable<? super T>> void quickSort(T[] list){
            shuffle(list);
            sortLeftAndRight(list, 0, list.length-1);
        }
        public static <T extends Comparable<? super T>> int partition(T[] list, int lo, int hi) {
            int i = lo, j = hi + 1;

            while (true) {
                while (ComparableJ.less(list[++i], list[lo]))// find item on the left to swap
                    if (i == hi) break;
                while (ComparableJ.less(list[lo], list[--j]))// find item on the right to swap
                    if (j == lo) break;
                   if(i>=j) break; //Check if pointers cross then swap
                   ComparableJ.exchange(list, i, j);
            }
            ComparableJ.exchange(list, lo, j);// swap the partitioning element.
            return j;// index of element known to be in place.
        }
        public static <T> void shuffle(T[] list){
            for (int i = 0; i < list.length; i++) {
                int index = (int) (Math.random() * list.length);
                ComparableJ.exchange(list, i, index);
            }
        }
        public static<T extends Comparable<? super T>> void sortLeftAndRight(T[] list, int lo, int hi){
            if (hi<=lo) return;
            int j = partition(list, lo, hi);
            sortLeftAndRight(list, lo, j-1);
            sortLeftAndRight(list, j+1, hi);
        }

        /**
         *This method is almost same as the sortLeftAndRight, but it's optimized to deal with duplicate keys.
         */
        public static<T extends Comparable<? super T>> void threeWayQuickSort(T[] list, int lo, int hi){
            if (hi<=lo) return;
            int lt = lo, gt = hi;
            T v = list[lo];
            int i = lo;
            while (i <= gt){
                int cmp = list[i].compareTo(v);
                if(cmp < 0) ComparableJ.exchange(list, lt++, i++);
                else if(cmp > 0) ComparableJ.exchange(list, i, gt--);
                else i++;
            }
            threeWayQuickSort(list, lo, lt-1);
            threeWayQuickSort(list, gt+1, hi);
        }
    }

    /**
     * In iteration i, pick integer r between 0 and i uniformly at random. Swap[i] and a[r]
     * Often used when objects are shuffled with uniformly random permutation.
     *
     * @param list
     * @param <T>
     */
    public static <T> void shuffleSort(T[] list) {
        int N = list.length;
        for (int i = 0; i < N; i++) {
            int r = new Random().nextInt(i + 1);
            ComparableJ.exchange(list, i, r);
        }
    }

    /**
     * The convex hull of a set N points is the smallest perimeter fence enclosing the points. See doc for more detail
     */
    public static class ConvexHull {

        public class Point2Dim {
            final double x, y;

            Point2Dim(double x, double y) {
                this.x = x;
                this.y = y;
            }
        }

        public static int orientation(Point2Dim a, Point2Dim b, Point2Dim c) {
            double area = (b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x);
            if (area > 0) return +1; //ccw
            else if (area < 0) return -1; //cw
            else return 0; //collinear
        }

        // Prints convex hull of a set of n points.
        public static void convexHull(Point2Dim points[], int n) {
            assert (n >= 3); // there must be at least 3 points in the plane
            Vector<Point2Dim> hull = new Vector<>();

            //find the most left point
            int mlp = 0;
            for (int i = 1; i < n; i++) {
                if (points[i].x < points[mlp].x) mlp = i;
            }
            // Start from leftmost point, keep moving
            // counterclockwise until reach the start point
            // again. This loop runs O(h) times where h is
            // number of points in result or output.
            int p = mlp, q;
            do {
                //Ad current point to result
                hull.add(points[p]);
                // Search for a point 'q' such that orientation(p, x, q) is counterclockwise
                // for all points 'x'. The idea is to keep track of last visited most counterclock-
                // wise point in q. If any point 'i' is more counterclockwise than q, then update q.
                q = (p + 1) % n;
                for (int i = 0; i < n; i++) {
                    // If i is more counterclockwise than current q, then update q
                    if (orientation(points[p], points[i], points[q]) > 0) q = i;
                }
                // Now q is the most counterclockwise with respect to p. Set p as q for next iteration,
                // so that q is added to result 'hull'
                p = q;
            } while (p != 1); //While we don't come to first point

            //Print out the points of the hull
            for (Point2Dim coordinate : hull) {
                System.out.println("(" + coordinate.x + ", " + coordinate.y + ")");
            }
        }
    }

    //Abstracted methods
    public static <T> void show(T[] list) {
        System.out.println(Arrays.toString(list) + "\n");
    }

    private static <T extends Comparable<? super T>> boolean isSorted(T[] a) {
        for (int i = 1; i < a.length; i++)
            if (ComparableJ.less(a[i], a[i - 1])) return false;
        return true;
    }
    /**
     * Overloading isSorted() to accommodate index range subarray.
     *
     * @param a       the array
     * @param beginAt the beginning index of the subarray of a[] which to be checked if sorted
     * @param endAt   the ending index of the subarray of a[] which to be checked if sorted
     * @param <T>
     * @return true if sorted, otherwise false
     */
    private static <T extends Comparable<? super T>> boolean isSorted(T[] a, int beginAt, int endAt) {
        for (int i = beginAt; i <= endAt; i++) {
            if (ComparableJ.less(a[i], a[i - 1])) return false;
        }
        return true;
    }
}
