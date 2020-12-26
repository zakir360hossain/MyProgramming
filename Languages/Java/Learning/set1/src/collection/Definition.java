package collection;

/** collection is a topic
 Collection is an Interface/framework
 collections is a class

 SuperInterface:
 Iterable

 SubInterfaces:
 BeanContext, BeanContextServices, BlockingDeque, BlockingQueue, Deque, List,
 NavigableSet, Queue, Set, SortedSet, TransferQueue

 Implemented Classes:
 AbstractCollection, AbstractList, AbstractQueue, AbstractSequentialList, AbstractSet,
 ArrayBlockingQueue, ArrayDeque, ArrayList, AttributeList, BeanContextServicesSupport, BeanContextSupport,
 ConcurrentHashMap, KeySetView, ConcurrentLinkedDeque, ConcurrentLinkedQueue, ConcurrentSkipListSet,
 CopyOnWriteArrayList, CopyOnWriteArraySet, DelayQueue, EnumSet, HashSet, JobStateReasons,
 LinkedBlockingDeque, LinkedBlockingQueue, LinkedHashSet, LinkedList, LinkedTransferQueue,
 PriorityBlockingQueue, PriorityQueue, RoleList, RoleUnresolvedList, Stack, SynchronousQueue, TreeSet, Vector


  i.e ArrayList (class) implements List (interface) which extends Collection.

 The container with Collection type will treat everything as object by default.
 To make Collection more type-safe, generic is useful.

*/

import java.util.*;

public class Definition {
    public static void main(String[] args) {

        Collection a = new ArrayList(); // A can be any type
        a.add(10);
        a.add("Susan");
        a.add(34.56);
        a.add(4.4040f);

        // With generic to specify type
        Collection<String> b = new ArrayList<String>();
        b.add("John");
        b.add("Susan");

        // explicit type in the right side is not needed in version 1.7 and above
        Collection<Integer> c = new ArrayList<>();

        // Collection does not work with indexing, so to manipulate data through indexing
        // List or Set would be an option; both are interfaces of Collection framework.
        List<Integer> d = new ArrayList<>();

        // HashSet is the class which implements Set.
        // Elements are unique. The order at which elements will be returned is random
        Set<Integer> e = new HashSet<>();

        // The advantage TreeSet over HashSet is that it will give everything in a sorted format.
        Set<Integer> f = new TreeSet<>();

    }
}
