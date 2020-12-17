/**
 * Queue uses the FIFO discipline. See documents for detail
 * <p>
 * In this program, a queue of names is implemented as singly linked-list.
 */
public class QueueDS {

    public static void main(String[] args) {
        LinkedQueueOfStrings names = new LinkedQueueOfStrings();
        System.out.println(names.size());
        names.enqueue("Henry");
        System.out.println(names.size());


    }
}

//Linked-list implementation
class LinkedQueueOfStrings {
    private Node first, last;
    private int size = 0;

    private class Node {
        String item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(String item) {
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
    public String dequeue() {
        String item = first.item;
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
class ResizedCapacityQueueOfStrings{
    private String[] items;
    private int N = 0;

    public ResizedCapacityQueueOfStrings() {
        items = new String[1];
    }

    public boolean isEmpty() {
        return N == 0;
    }


    public void enqueue(String item) {
        int tail = items.length;
        if (item != null) {
            // doubling the size of items[] when it's full
            if (N == items.length) resize(2 * items.length);
            items[tail] = item;
        } else {
            System.out.println("Empty field is not allowed!");
        }
    }

    public String dequeue() {
        String item = items[0];
        items[N]=null;
        //halving the size of items[] when it's one-quarter full
        if(N>0 && N==items.length/4) resize(items.length/2);
        return item;
    }
    public void resize(int capacity) {
        String[] copy = new String[capacity];
        for (int i = 0; 1<N; i++){
            copy[i] = items[i];
            items = copy;
        }
    }
}