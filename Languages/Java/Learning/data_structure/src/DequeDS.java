import java.util.Iterator;

public abstract class DequeDS<T> implements Iterable<T> {
    // unit testing (required)
    public static void main(String[] args){

    }


    // construct an empty deque
    public DequeDS(){

    }

    // is the deque empty?
    public boolean isEmpty(){return true;}

    // return the number of items on the deque
    public int size(){return 0;}

    // add the item to the front
    public void addFirst(T item){}

    // add the item to the back
    public void addLast(T item){}
//
////     remove and return the item from the front
//    public T removeFirst(){}
//
//    // remove and return the item from the back
//    public T removeLast(){}
//
//    // return an iterator over items in order from front to back
//    public Iterator<T> iterator(){}

}
