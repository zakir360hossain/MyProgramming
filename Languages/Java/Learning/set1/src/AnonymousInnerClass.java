/*
Java provides anonymous, also called anonymous inner, class.

Implementation often precede object.
When implementation is done before the object creation, it is called Invention
But that's not always the case, sometimes object precedes implementation. Dinosaur existed long ago, but study on them
is being done now. This is exactly what Anonymous Inner class is for in Java

Anonymous inner classes are often used to provide implementation of interface.
 */

class Phone{

    public void display(){
        System.out.println("Calling!");
    }
}

interface Operation{
    int sum(int [] array);
}
public class AnonymousInnerClass {
    public static void main(String[] args) {

        Phone pn = new Phone();
        pn.display();

        // How to represent a Smartphone? Which is a subset of phone
        // Instead of writing a subclass as Smartphone to override display()
        // Anonymous inner class will suffice this.
        Phone pn2 = new Phone()
        // This is the anonymous inner class, "inner" because it is inside the main class.
        {
            @Override
            public void display() {
                System.out.println("A Smartphone is calling");
            }
        };
        pn2.display();

        // Using anonymous inner class to implement interface
        Operation summing = new Operation() {
            @Override
            public int sum(int[] array) {
                int sum=0;
                for (int elem : array){
                    sum+=elem;
                }
                return sum;
            }
        };

        //Using anonymous inner class and lambda expression to implement interface
        Operation summing2 = array -> {
            int sum=0;
            for (int elem : array){
                sum+=elem;
            }
            return sum;
        };
        System.out.println(summing.sum(new int[]{2, 3, 4, 6, 6}));
        System.out.println(summing2.sum(new int[]{2, 3, 4, 6, 6}));
    }
}

