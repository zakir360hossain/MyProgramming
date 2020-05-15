/*
It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.
Important terminology:

Super Class: The class whose features are inherited is known as super class(or a base class or
a parent class).
Sub Class: The class that inherits the other class is known as sub class(or a derived class,
extended class, or child class). The subclass can add its own fields and methods in addition
to the superclass fields and methods.

Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a
new class and there is already a class that includes some of the code that we want, we can derive
our new class from the existing class. By doing this, we are reusing the fields and methods of the
existing class.

The keyword used for inheritance is extends.
 */


// parent class
class Bicycle {
    // the Bicycle class has two fields
    public int gear;
    public int speed;

    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
    // the Bicycle class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
    public void speedUp(int increment)
    {
        speed += increment;
    }

    public String toString() {
        return "Bicycle{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}

// child class
class MountainBike extends Bicycle {
    // the MountainBike subclass adds one more field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int gear,int speed,
                        int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }
    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override
    public String toString()
    {
        return (super.toString()+
                "\nseat height is "+seatHeight);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Bicycle bc1 = new Bicycle(34, 45);
        Bicycle bc2 = new MountainBike(41, 46, 11);
        MountainBike bc3 = new MountainBike(56, 58, 12);


    }
}
