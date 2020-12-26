import java.util.Iterator;

/**
 * The Iterable, a super interface of Collection API, and Iterator interface
 * Implementing Iterable allows an object to be the target of the "foreach" statement (the enhanced for loop)
 * A custom data structure not implementing Iterable cannot use for each or enhanced loop
 * Link between Iterable and Iterator: Iterable is a source for Iterator; from an Iterable, you can obtain an Iterator
 *
 */

public class IterableAndIterator {
    public static void main(String[] args) {
        // Create Linked List
        CustomList<VanguardClients> clientsDataBase = new CustomList<>();

        // Iterate through the list using For Each Loop (now it's applicable)
        for (VanguardClients client : clientsDataBase)
            System.out.println(client.getName());

    }
}

// Custom Linked List class using Generics
class CustomList<T> implements Iterable<T> {
    Node<T> head, tail;

    // add new Element at tail of the linked list in O(1)
    public void add(T data)
    {
        Node<T> node = new Node<>(data, null);
        if (head == null)
            tail = head = node;
        else {
            tail.setNext(node);
            tail = node;
        }
    }

    // return Head
    public Node<T> getHead()
    {
        return head;
    }

    // return Tail
    public Node<T> getTail()
    {
        return tail;
    }

    // return Iterator instance
    public Iterator<T> iterator()
    {
        return new ListIterator<T>(this);
    }
}

class ListIterator<T> implements Iterator<T> {
    Node<T> current;

    // initialize pointer to head of the list for iteration
    public ListIterator(CustomList<T> list)
    {
        current = list.getHead();
    }

    // returns false if next element does not exist
    public boolean hasNext()
    {
        return current != null;
    }

    // return current data and update pointer
    public T next()
    {
        T data = current.getData();
        current = current.getNext();
        return data;
    }

    // implement if needed
    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}

// Constituent Node of Linked List
class Node<T> {
    T data;
    Node<T> next;
    public Node(T data, Node<T> next)
    {
        this.data = data;
        this.next = next;
    }

    // Setter getter methods for Data and Next Pointer
    public void setData(T data)
    {
        this.data = data;
    }

    public void setNext(Node<T> next)
    {
        this.next = next;
    }

    public T getData()
    {
        return data;
    }

    public Node<T> getNext()
    {
        return next;
    }
}


//An implementation of simple Vanguard client database.
class VanguardClients {
    private String name;
    private double initial_investment;
    private double pricePerStock;
    private double totalStockNumber;
    private double yearlyzReturnPercent =0;
    private boolean isReinvesting;
    private double totalBalance = initial_investment;
    private int timeInYear=0;

    public VanguardClients(String name, double initial_investment, double pricePerStock, boolean isReinvesting) {
        this.name = name;
        this.initial_investment = initial_investment;
        this.pricePerStock = pricePerStock;
        this.isReinvesting = isReinvesting;
        this.totalStockNumber = initial_investment/pricePerStock;
    }

    public String getName() {
        return name;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public double getCurrentPricePerStock() {
        return pricePerStock;
    }

    public double getTotalCurrentStockNumber() {
        return getTotalBalance()/pricePerStock;
    }
    public void updatePricePerStock(double newPricePerStock){
        this.pricePerStock = newPricePerStock;
    }

    public void updateYearlyReturnPercentAndIncrementTimeInYear(double newYearlyReturnPercent){
        timeInYear++;
        yearlyzReturnPercent = newYearlyReturnPercent;
        if(isReinvesting){
            totalBalance = totalBalance+ yearlyzReturnPercent *totalBalance;
            totalStockNumber = totalBalance/pricePerStock;
        }

    }
    public double getLastYearDividend(){
        return yearlyzReturnPercent *totalBalance;
    }

}
