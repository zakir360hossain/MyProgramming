/**
 * Queue uses the FIFO discipline. See documents for detail
 * <p>
 * In this program, a queue of names is implemented as singly linked-list.
 */
public class QueueDS {

    public static void main(String[] args) {
        LinkedQueue names = new LinkedQueue();
        System.out.println(names.size());
        names.enqueue("Henry");
        System.out.println(names.size());


    }
}

//Linked-list implementation
class LinkedQueue<T> {
    private Node first, last;
    private int size = 0;

    private class Node {
        T item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(T item) {
        if (item != null) {
            Node oldlast = last;
            last = new Node();
            last.item = item;
            last.next =  null;
            //special case for empty queue
            if (isEmpty()) first = last;
            else oldlast.next = last;
            size += 1;
        } else {
            System.out.println("Empty field is not allowed!");
        }
    }
    public T dequeue() {
        T item = first.item;
        first = first.next;
        //special case ofr empty queue
        if (isEmpty()) last = null;
        size -= 1;
        return item;
    }

    public int size() {
        if (this.isEmpty()) {
            return 0;
        } else {
            return size;
        }
    }
}

//Resizing array implementation
class ResizedCapQueue<T>{
    private T[] items;
    private int N = 0;

    public ResizedCapQueue() {
        { items = (T[]) new Object[1];}
    }

    public boolean isEmpty() {
        return N == 0;
    }


    public void enqueue(T item) {
        int tail = items.length;
        if (item != null) {
            // doubling the size of items[] when it's full
            if (N == items.length) resize(2 * items.length);
            items[tail] = item;
        } else {
            System.out.println("Empty field is not allowed!");
        }
    }

    public T dequeue() {
        T item = items[0];
        items[N]=null;
        //halving the size of items[] when it's one-quarter full
        if(N>0 && N==items.length/4) resize(items.length/2);
        return item;
    }
    public void resize(int capacity) {
        T[] copy = (T[]) new Object[capacity];
        for (int i = 0; 1<N; i++){
            copy[i] = items[i];
            items = copy;
        }
    }

}