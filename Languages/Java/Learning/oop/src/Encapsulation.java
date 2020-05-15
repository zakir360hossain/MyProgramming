/*
Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that
binds together code and the data it manipulates. Other way to think about encapsulation is, it is a
protective shield that prevents the data from being accessed by the code outside this shield.

The basic of encapsulation is simply a combination of data-hiding and abstraction.
Hide the complexities away from the user. Restrict direct access
 */

class Student{
    // Making the data private, rather than making it accessible to everywhere, this is encapsulation
    private String name;
    private int age;

    // Not giving access to data directly is encapsulation
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Not giving direct access to modify data is encapsulation
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Student john = new Student();
    }
}
