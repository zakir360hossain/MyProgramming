package generics;

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
