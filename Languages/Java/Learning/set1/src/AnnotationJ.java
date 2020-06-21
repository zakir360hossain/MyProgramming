/*
Annotations make code coherent and clear to understand.
It also helps to identify some runtime errors in compile time, such as typo.

Every annotation becomes a sub-type of the Annotation interface.

Marker Annotation: annotation that does not have variable or method
.
Single Value Annotation: With one variable or method.
Multi-Value Annotation: With more than one variable or method
 */

import java.lang.annotation.*;

//Indicate an interface is functional, with one method. Putting more than one method will give error now.
@FunctionalInterface
interface Measure{
    void weight();
}

class FruitData {
    public void showCalciumAmount(){}
}

class BananaData extends FruitData{

    @Override // Including "override", which is not required, is annotation.
    public void showCalciumAmount() {
        super.showCalciumAmount();
    }

    @Deprecated // Annotation to tell that a method is obsolete.
    public void show(){}
}




public class AnnotationJ {

    @SuppressWarnings("uncheck") // This is another annotation to suppress warning
    public static void main(String[] args) {

        BananaData bd1 = new BananaData();
        bd1.show();

        NokiaASeries device1 = new NokiaASeries("Fire", 10);
        System.out.println(device1.model);

        //Using the Reflection API to fetch property of an Annotation
        Class c = device1.getClass();
        Annotation an = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone)an;
        System.out.println(s.os());
    }
}



//User_defined Annotation
//A multi-value annotation

//Meta annotations for self_defined annotation
@Documented //annotation to be documented after the software is complete
@Inherited //If class uses this annotation, the annotation will be available for its subclass as well.
@Target(ElementType.TYPE) //Indicating that it will be used for class. Other options can be applied at the same time
// such as .FIELD, .CONSTRUCTOR, .METHOD
@Retention(RetentionPolicy.RUNTIME) //To be available at runtime. Other options: .SOURCE, .CLASS
@interface SmartPhone {
    String os() default "Symbian";
    double version() default 1.0;
}

@SmartPhone() // This will have the default values
class NokiaASeries{
    String model;
    int screen_size;

    public NokiaASeries(String model, int screen_size) {
        this.model = model;
        this.screen_size = screen_size;
    }
}

@SmartPhone(os = "Android", version = 1.1)
class NokiaBSeries{

}
