import java.util.Vector;

/*
A vector is a class type of list in Java, it implements List interface. Very similar to ArrayList, dynamic.

Just like array list, the default capacity of a vector is 10.

The methods of in Vector is very similar to ArrayList
 */
public class VectorJ {
    public static void main(String[] args) {
        // vector without generic
        Vector a = new Vector();
        a.add(12);
        a.add("Susan");
        
        // with generic and capacity
        Vector<Integer> b = new Vector<>(30);

    }
}
