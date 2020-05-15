/*
In simple words, we can define polymorphism as the ability of a message to be displayed in more
than one form. A person at the same time can have different characteristic. Like a man at the same
time is a father, a husband, an employee. So the same person posses different behaviour
in different situations. This is called polymorphism.
Polymorphism allows us to perform a single action in different ways.

Polymorphism is often achieved through overriding and overloading

In Java polymorphism is mainly divided into two types:
Compile time Polymorphism
Runtime Polymorphism
 */

//Compile time Polymorphism
class TypeOverload {

    //Overloading the multiply method
    // will use this when int parameters are passed
    static int multiply(int a, int b)
    {
        return a * b;
    }

    // will use this when int parameters are passed
    static double  multiply(double a, double b)
    {
        return a * b;
    }
}

//Runtime Polymorphism
class Planet {
    void print()
    {
        System.out.println("I am a planet");
    }
}
class Mercury extends Planet {
    // Overriding the print method
    void print()
    {
        System.out.println("I am the Mercury Planet");
    }
}
class Earth extends Planet {
    void print()
    {
        System.out.println("I am the Earth planet");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println(TypeOverload.multiply(3, 4));
        System.out.println(TypeOverload.multiply(2.3, 5.6));

        Planet p1 = new Planet();
        Planet p2 = new Mercury();
        Planet p3 = new Earth();
        p1.print();
        p2.print();
        p3.print();


    }
}
