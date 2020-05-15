/*
An abstract class is a general representation of a specific group of entity
An abstract class cannot be instantiated by itself, it needs a class that extends it.
 */

import java.util.ArrayList;

abstract class Continent{
    // All human have names and age.
    private final String name;
    private final int age;

    public Continent(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {return age;}
    public String getName(){return name;}

    // Different continents have different species
    abstract int uniqueAnimalCount();
}


class Antarctica extends Continent{
    private int ice_covered_Area;
    private int penguinCount;

    public Antarctica(String name, int age, int ice_covered_Area, int penguinCount){
        super(name, age);
        this.ice_covered_Area = ice_covered_Area;
        this.penguinCount = penguinCount;
    }

    public int getIce_covered_Area() {return ice_covered_Area;}

    public void setIce_covered_Area(int ice_covered_Area) {
        this.ice_covered_Area = ice_covered_Area;
    }

    @Override
    int uniqueAnimalCount() {
        return penguinCount;
    }
}



public class AbstractClassEx {
    public static void main(String[] args) {
        Continent con = new Antarctica("Antarctica", 56000, 20000, 3000);

        System.out.println(con instanceof Continent);
    }
}
