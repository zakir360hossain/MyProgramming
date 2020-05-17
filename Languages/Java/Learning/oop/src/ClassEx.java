import java.util.ArrayList;

/*
A class is a type that a individual construct to represent a unique entity (object)
A class can only extend to one other class because Java does not support multiple inheritance.
Unlike an abstract class, a normal class cannot have abstract methods.

 */
class BluePrint {
    // Instance variables
    public int x; // can be accessed from anywhere
    private int y; // Unless getters are supplied, this can only be accessed inside BluePrint class
    protected int z; // Can be accessed within the same package and from BluePrint's subclasses.
    public static String className;

    // Default Constructor
    public BluePrint(){
        x = 0;
        y = 1;
        z = 2;
    }
    // Parameterized Constructor
    // These three are local variables
    public BluePrint(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Instance methods
    public void doubleZ(){
        z = 2*z;
    }
    public int xySum(){
        return x+y;
    }
    public String toString() {
        return "x = "+x + "  y = "+y + "  z = "+z;
    }

    // Static methods; method that can be called without creating an object.
    public static void initName(String nm){
        className = nm;
    }

}


public class ClassEx{
    public static void main(String[] args) {

        BluePrint bp = new BluePrint(12, 34, 45);
        System.out.println(bp.x); //only x and z can be accessed

        BluePrint.initName("A BluePrint");
        System.out.println(BluePrint.className);
    }

}