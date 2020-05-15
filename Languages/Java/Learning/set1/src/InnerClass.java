/*
Java provides the feature of inner class
 */

class A{
    int x = 10;
    class B{
        int y = 19;
    }

    // Static inner class
    static class C{
        int z = 19;
    }
}

public class InnerClass {
    public static void main(String[] args) {

        // Object of A will not know anything about class B in this way
        A a = new A();
        System.out.println(a.x);

        // Way to instantiate non-static inner class
        A.B b = a.new B(); // Note: Object a is type of A, this is the way to create an object of type B.
        System.out.println(b.y);

        // Way to instantiate static inner class
        A.C c = new A.C(); // Here an object of type A is not required to create object of C, because C is static.



    }
}
