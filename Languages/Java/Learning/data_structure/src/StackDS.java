/**
 * Stack uses the LIFO discipline. See documents for detail
 * <p>
 * In this program, a stack of names is implemented as singly linked-list.
 */
public class StackDS {

    public static void main(String[] args) {
        LinkedStack<String> names = new LinkedStack<>();
        System.out.println(names.size());
        names.push("Henry");
        System.out.println(names.size());


    }
}

//Linked-list implementation
class LinkedStack<T> {
    private Node first = null;
    private int size = 0;

    private class Node {
        T item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(T item) {
        if (item != null) {
            Node oldFirst = first;
            first = new Node();
            first.item = item;
            first.next = oldFirst;
            size += 1;
        } else {
            System.out.println("Empty field is not allowed!");
        }
    }
    public T pop() {
        T item = first.item;
        first = first.next;
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

/**Array implementation: fixed capacity-> asking for capacity to user (this is not modular); no more an API
 **/
class FixedCapStack<T> {
    private T[] items;
    private int N = 0;

    public FixedCapStack(int capacity) {
        { items = (T[]) new Object[capacity];}
    } //asking for size to client is not fine.

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(T item) {
        if(item != null){
            items[N++] = item;
        }else{
            System.out.println("Empty field is not allowed!");
        }
    }

    public T pop() {
        T item = items[--N];
        items[N] = null;
        return item;
    }
}

/**Resizing-array implementation (with "repeated doubling" method); this solves the issue of asking for capacity
Method: if array is full, create a new array twice the size and copy the items
 This is an efficient implementation cost wise
 **/

class ResizedCapStack<T> {
    private T[] items;
    private int N = 0;

    public ResizedCapStack() {
        {items = (T[]) new Object[1];}
    }

    public boolean isEmpty() {
        return N == 0;
    }


    public void push(T item) {
        if (item != null) {
            // doubling the size of items[] when it's full
            if (N == items.length) resize(2 * items.length);
            items[N++] = item;
        } else {
            System.out.println("Empty field is not allowed!");
        }
    }

    public T pop() {
        T item = items[--N];
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
