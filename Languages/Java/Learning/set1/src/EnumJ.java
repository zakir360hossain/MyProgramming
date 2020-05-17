/*
1.What happens when a enum is created (ex: Particle in this case)?
-JVM creates a class with the name Particle.
-Inside the class, photon, electron, etc., are created as static final objects of Particle.

Will look like this:

    class Particle{
        static final Particle photon = new Particle();
        static final Particle gluon = new Particle();
        static final Particle electron = new Particle();
    }

2.Since an enum gets converted to a class, it can have variables and properties just like a class
However, in C family, it is not possible to create variables and methods for enum

3. Every enum in Java extends a class called Enum, which belongs to Java.lang package
The Enum class implements Comparable and Serializable. So, enum cannot extend to a class because it's already extended
to Enum. However, it can implements more methods.


Enum has a lots of methods:
1.clone()  Throws CloneNotSupportedException.
2.compareTo(E o) Compares this enum with the specified object for order.
3.equals(Object other)  Returns true if the specified object is equal to this enum constant.
4.finalize() enum classes cannot have finalize methods.
5.Class<E>  getDeclaringClass() Returns the Class object corresponding to this enum constant's enum type.
6.hashCode()  Returns a hash code for this enum constant.
7.name() Returns the name of this enum constant, exactly as declared in its enum declaration.
8.ordinal() Returns the order of this enumeration constant as an index.
9.toString() Returns the name of this enum constant, as contained in the declaration.
10.static <T extends Enum<T>> T	valueOf(Class<T> enumType, String name) Returns the enum constant of the specified
   enum type with the specified name.
 */

enum Particle{
    electron, gluon, // these two objects will have default value for mass (10)
    photon(5); // photon is passed a different mass through parameterized constructor

    int mass;

    // Default Constructor for enum
    Particle(){
        mass = 10;
    }
    // Parameterized
    Particle(int mass){
        this.mass =  mass;
    }
    public int getMass() {
        return mass;
    }

}


public class EnumJ {

    public static void main(String[] args) {

        //objects of Enum
        Particle p = Particle.electron;

        switch (p){
            case gluon:
                System.out.println("You are just glue'ish");
                break;
            case electron:
                System.out.println("Well, if this is the case, you are nothing but a damn electron bro!");
                break;

        }

        System.out.println(p.getMass());
        System.out.println(Particle.photon.getMass());
        System.out.println(p.ordinal());

        //Getting all the constants in Particle (all the particles)
        //This values() method is not in the Enum class, it is provided by the JVM compiler
        Particle list[] = Particle.values();
        for (Particle eachP:list){
            System.out.println(eachP);
        }
    }
}


