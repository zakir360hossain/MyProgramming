package generics;
// generic is a way to take types as parameter.
// This was introduced in 2004 and it was to make the language more type_safe.
// Type can only be of classes (Integer, Double, String, etc.)
// int, float, etc., do not work

import java.util.ArrayList;


public class Main {
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
        // Generic.Container<Student> st = new Generic.Container<Student>(); This is possible, if a Student class existed.

        // Even though Number is extended to Generic.Container, it can still declare T to be Number
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
        // *Generic.Container<Student> st = new Generic.Container<Student>();

        //'?' becomes Number, which can be a super type of Float.
        E.ALDemo2(new ArrayList<Number>());

        // In fact, for '?' this will also work. A class can become super type of itself.
        // However, any class that extends Float (if there is any) will not work.
        E.ALDemo2(new ArrayList<Float>());
    }
}


