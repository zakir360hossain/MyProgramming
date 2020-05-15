package practical;

/**
 * @author Zakir Hossain
 * March 2, 2020
 * This is the abstract practical.Airplane class to implement abstraction. It is a mini generic frame of plane with some generic
 * data. It has a method that did not need to be declared abstract because the method will not change when it will be
 * implemented in the child classes. It has some private data and some setters and getters to access the data.
 * It also has a toString method to print out the data.
 */
public abstract class Airplane {
private int age;                //represents age of airplane
private double value;            //represents current $$ value of airplane
private double MPG;            //represents current mileage on the airplane
private double newValue;        //represents the value of the airplane when new
private double overallMiles;        //represents the overall miles of the airplane

// Initially, when the object is initialized, the value and the newValue will be the same, but the value will be
// changed when the airplane method is called (the update to the value will depend on the age of the plane.

public Airplane() {
        age = 0;
        value = 0;
        MPG = 0;
        newValue = 0;
        overallMiles = 0;
}

//Getters
public int getAge() {
        return age;
}

public double getValue() {
        return value;
}

public double getMPG() {
        return MPG;
}

public double getNewValue() {
        return newValue;
}

public double getOverallMiles() {
        return overallMiles;
}

//Setters
public void setAge(int age) {
        this.age = age;
}

public void setValue(double value) {
        this.value = value;
}

public void setMPG(double MPG) {
        this.MPG = MPG;
}

public void setNewValue(double newValue) {
        this.newValue = newValue;
}

public void setOverallMiles(double overallMiles) {
        this.overallMiles = overallMiles;
}

//    This method updates the value of the airplane based on the age and the overall mileage.
//
//    Update formulas:
//     1. Deduction of price of 2.5% for every year old.
//     2.	0-24,999 miles – deduct 5%
//     3.	25,000-49,999 – deduct 10%
//     4.	50,000-74,999 – deduct 15%
//     5.	75,000-99,999 – deduct 20%
//     6.	100,000+ - deduct 25%
//
//     The value should not be increased under normal circumstances

public Airplane(int age, double value, double MPG, double newValue, double overallMiles) {
        this.age = age;
        this.value = value;
        this.MPG = MPG;
        this.newValue = newValue;
        this.overallMiles = overallMiles;
}

public void airplaneValue(){
        double deduction_with_age = (0.025 * age) * value;
        double deduction_with_mileage = 0;

        if (overallMiles >= 0 && overallMiles <= 24999) {
                deduction_with_mileage = 0.05 * value;
        } else if (overallMiles >= 25000 && overallMiles <= 49999) {
                deduction_with_mileage = 0.1 * value;
        } else if (overallMiles >= 50000 && overallMiles <= 74999) {
                deduction_with_mileage = 0.15 * value;
        } else if (overallMiles > 75000 && overallMiles <= 99999) {
                deduction_with_mileage = 0.2 * value;
        } else {
                deduction_with_mileage = 0.25 * value;
        }
        value = value - deduction_with_age - deduction_with_mileage;
}

public String toString() {
        return
                "age: " + age +
                "\nvalue: " + value +
                "\nMPG: " + MPG +
                "\nnewValue: " + newValue +
                "\noverallMiles: " + overallMiles;
}
}
