package generics;

import java.util.ArrayList;

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
    public void ALDemo(ArrayList<? extends T> obj) {
    }

    // Syntax when the type of T is to be a sub_type of '?'
    public void ALDemo2(ArrayList<? super T> obj) {
    }
}
