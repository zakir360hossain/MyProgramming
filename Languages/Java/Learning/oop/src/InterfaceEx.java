/*
Interface works as an independent plate from which every class can access content.

-The methods in an interface are by default abstract, so they cannot have body.
-The methods are by default public.
-Its fields are by default final. The methods are also static and final
-An interface can be extended to multiple other interfaces.
-It is compulsory to implements all the methods of an interface. If does not want to implement all the methods
 then the unimplemented methods can be re-declared as abstract in the class which implements the particular
 interface, which in turn forces that class to be abstract because only an abstract class can have abstract methods.
-A class can implements multiple interfaces
-Since an interface is not a class, it will need a class that implements it to instantiate objects.

There are many interfaces in Java libraries, avoid using unless the API is well understood
 */
public interface InterfaceEx {
    int NUMBER = 5; //this field is by default a final constant.
    // public is not needed
    public int add(int a, int b);

    int prod(int a, int b);
    int quo(int a, int b);
}
