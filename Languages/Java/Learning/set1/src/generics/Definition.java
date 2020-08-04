package generics;

import java.util.ArrayList;

/* Generic is the concept of treating types as parameter. An instance or a field can have an abstract
 data type (just a parameter) at the beginning and once a type is passed, it becomes the value of the parameter.
*/

// Way to declare generic. T (could be any other name) is an identifier for type
class Container<T> {
    T value;     // value is of type T

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

    // Syntax when the type of ArrayList (?) is to be a sub_type of T.
// If T is Number, than obj could be Integer, Double; thus the '?'
    public void ALDemo(ArrayList<? extends T> obj) {
    }

    // Syntax when the type of T is to be a sub_type of '?'
    public void ALDemo2(ArrayList<? super T> obj) {
    }
}

public class Definition {
    public static void main(String[] args) {

        // T is Double
        Container<Double> A = new Container<>();
        A.value = 34.5;
        A.show();
        A.setValue(12.01); // No other class type can be passed because T is already defined to be Double.

        // T is Integer
        Container<Integer> B = new Container<>();
        B.setValue(101); // No other type then Integer.
        B.show();

        //Now, C can be any time under Number
        Container<Number> C = new Container<>();
        C.setValue(23.34);
        C.setValue(34.56f);

        // T is Number
        Container2<Number> D = new Container2<>();
        D.setValue(200); // T becomes Integer
        D.show();
        D.setValue(25.25); // T becomes Double
        D.show();

        // '?' becomes Integer, which can obviously be a sub_type of T, given
        // that T is Number.
        D.ALDemo(new ArrayList<Integer>());

        // T is Float
        Container2<Float> E = new Container2<>();
        E.value = 23.3f;
        E.show();

        //'?' becomes Number, which can be a super type of Float.
        E.ALDemo2(new ArrayList<Number>());

        // In fact, for '?' this will also work. A class can become super type of itself.
        // However, any class that extends Float (if there is any) will not work.
        E.ALDemo2(new ArrayList<Float>());
    }
}
