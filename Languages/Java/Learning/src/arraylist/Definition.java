package arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
ArrayList is a class that supports dynamic array creation and manipulation.
The class implements the List interface, which itself is a sub-interface of Collection interface in Java.
The Collection interface is present in java.util

The default capacity of an array list is 10

Common methods:
1.size() returns the size of array list
2.get(index) returns the element at the given index
3.add(*index, elem) adds into a specified position if index is provided (overloaded)
  otherwise appends to the end. Returns a boolean.
4.set(index, elem) replaces the old element with the new element in the given index. Returns the old element.
5.remove(index/elem) removes the element at the given index, or removes the first occurrence of the given
element. Returns the removed element.
6.indexOf(elem) returns the index of the first occurrence of the given element
7.lastIndex(elem) returns the index of the last occurrence of elem; -1 otherwise
8.clear() removes all the elements of this list
9.toArray() converts all the elements into an array and returns it
10.subList(fromIndex, toIndex) returns the segment from this array list with the given index boundaries.
11.addAll(Collection c) appends the collection to this arraylist.
12.removeIf() removes all of the elements of this arraylist that satisfy a given predicate
13.forEach() performs the given action for all elements.
14.ensureCapacity(minCapacity) increases the capacity of the arraylist to the minCapacity
 */


public class Definition {

    public static void main(String[] args) {

        // ArrayList without generic
        ArrayList a = new ArrayList();
        // Default Constructor of ArrayList
        ArrayList<Integer> b = new ArrayList<>();
        // Constructor with an initial capacity
        ArrayList<Integer> c = new ArrayList<>(10);
        c.add(23);
        boolean isAdded = c.add(24);
        System.out.println(isAdded);
        c.add(0, 22);

        int oldElem = c.set(1, 29);
        System.out.println(oldElem); // 23 is in index 1

        System.out.println(c.get(1));

        int removedElem = c.remove(0);// 22 is in index 0
        System.out.println(removedElem);

        System.out.println(c.size());

        // Declaration with List Interface
        List<Integer> d = new ArrayList<>();
        // Instantiating values during declaration;if the values are known
        List<Integer> e = Arrays.asList(1, 2, 3, 4, 5);

        // Through Double Brace Initialization
        List<Integer> f = new ArrayList<Integer>()
        {{
            add(23);
            add(34);
            add(67);
        }}; // This is called Anonymous Inner Class

    }
}
