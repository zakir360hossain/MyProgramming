public class Problems {
}

/**
 * This problem is related to the quickSort algorithm.
 * <p>
 * Goal:
 * Given an array of N items. Find the k-th largest.
 * Ex:
 * Min(k=0), max(k=n-1), median(k= N/2)
 * <p>
 * Applications:
 * Order statistic
 * Find the "top K"
 */
class Selection {

    //Quick-select
    public static <T extends Comparable<? super T>> T select(T[] list, int k) {
        ElementarySortingAlgorithms.QuickSort.shuffle(list);
        int lo = 0, hi = list.length-1;
        while (hi >lo){
            int j =  ElementarySortingAlgorithms.QuickSort.partition(list, lo, hi);
            if (j < k) lo = j+1;
            else if(j > k) hi = j-1;
            else return list[k];
        }
        return list[k];
    }
}