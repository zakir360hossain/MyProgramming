// Generics is a way to treat types as parameter.
// This was introduced in 2004 and it was to make the language more type_safe.
// Type can only be of classes (Integer, Double, String, etc.)
// int, float, etc., do not work

import java.util.ArrayList;

// Way to declare generic. T (could be any other name) is an identifier for type
class Container<T> {
    T value; // value is of type T

    public T getValue() {
        return value;
    }

    //
    public void setValue(T value) {
        this.value = value;
    }

    // Prints the type of value. At this point, it is not defined.
    public void show() {
        System.out.println(value.getClass().getName());
    }
}


// Number is a super class. All numeric classes fall under it.
// Extending to Number further narrows down the type options.
// Now T can only be numerical type. Object or self_defined type will not be supported.
class Container2<T extends Number> {

    T value;

    public T getValue() {
        return value;
    }

    //
    public void setValue(T value) {
        this.value = value;
    }

    // Prints the type of value. At this point, it is not defined.
    public void show() {
        System.out.println(value.getClass().getName());
    }

    // Syntax when the type of ArrayList ('?) is to be a sub_type of T.
    // If T is Number, than obj could be Integer, Double; thus the '?'
    public void ALDemo(ArrayList<? extends T> obj){}

    // Syntax when the type of T is to be a sub_type of '?'
    public void  ALDemo2(ArrayList<? super T>obj){}
}

public class GenericDemo {
    public static void main(String[] args) {

        // T is Double
        Container<Double> A = new Container<>();
        A.value = 34.5;
        A.show();
        A.setValue(12.01); // No other class type can be passed because T is already defined to be Double.

        // T is Integer
        Container<Integer> B = new Container<>();
        B.setValue(101); // No other class type then Integer.
        B.show();

        // T is type of student
        // Container<Student> st = new Container<Student>(); This is possible, if a Student class existed.

        // Even though Number is extended to Container, it can still declare T to be Number
        Container<Number> C = new Container<>();
        C.setValue(23.34);





        // T is Number
        Container2<Number> D = new Container2<>();
        D.setValue(200); // T becomes Integer
        D.show();
        D.setValue(25.25); // T becomes Double
        D.show();

        // '?' becomes Integer, which can obviously be a sub_type of T, given
        // that T is Number now.
        D.ALDemo(new ArrayList<Integer>());

        // T is Float
        Container2<Float> E = new Container2<>();
        E.value = 23.3f;
        E.show();

        //This is not possible. Type has to be numeric.
        // *Container<Student> st = new Container<Student>();

        //'?' becomes Number, which can be a super type of Float.
        E.ALDemo2(new ArrayList<Number>());

        // In fact, for '?' this will also work. A class can become super type of itself.
        // However, any class that extends Float (if there is any) will not work.
        E.ALDemo2(new ArrayList<Float>());


    }
}
