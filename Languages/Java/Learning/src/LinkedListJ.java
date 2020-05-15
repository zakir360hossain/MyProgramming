import java.util.LinkedList;

/*
LinkedList and ArrayList both implements the List interface.
LinkedList is also dynamic, however unlike Dynamic Array concept, the implementation of LinkedList
is based on the concept of Double LinkedList.

The big difference is that when adding elements in between, LinkedList is more efficient than ArrayList.
It assigns a Previous (p) and Next (n) node to each element, where p represents the previous element
and n represents the next element. So, to add a new element in between, redirecting the nodes will be enough
Unlike ArrayList, it will not need to shift up or down all the other elements.

For fetching, ArrayList is faster.
LinkedList's capacity is 0 initially.
LinkedList implements RandomAccess interface.
 */
public class LinkedListJ {
    public static void main(String[] args) {
        LinkedList a = new LinkedList();

        // with generic
        LinkedList<Integer> b = new LinkedList<>();

    }
}
