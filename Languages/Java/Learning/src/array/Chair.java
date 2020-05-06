package array;

/**
 * @author Zakir Hossain
 * December 9, 2019
 * This is the Chair object class. It designs a blueprint for chair object, including some feature data about
 * the chairs, some methods to modify and compute quantitative data and methods to obtain data. Also, method to
 * compare the instances of object and to print features of object.
 */

public class Chair {
    private double cost;
    private String type;
    private int age;

    // Default constructor
    public Chair() {
        cost = 0;
        type = " ";
        age = 0;
    }

    // Parameterized constructor
    public Chair(double cost, String type, int age) {
        this.cost = cost;
        this.type = type;
        this.age = age;

    }

    //getters
    public double getCost() {
        return cost;

    }

    //setters
    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String t) {
        this.type = t;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    //compareTo method
    /*
     * this compares chairs based on cost
     * 	returns 0 if the costs are equal
     * 	returns a negative number if this chair has lower cost than other chair
     * 	returns a positive number if this chair has higher cost than other chair
     */
    public int compareCost(Chair other) {
        if (other.cost == this.cost) {
            return 0;
        } else if (other.cost > this.cost) {
            return -1;
        } else {
            return 1;
        }

    }

    //every year the chair's value decreases (depreciates) by 10% based on the
    //	prior year's value, so the resale value is the cost of the chair
    //  multiplied by (1-.1)^age
    //the cost of the chair is not updated
    public double reSale() {
        double resaleVal = Math.round((this.cost * (Math.pow(.9, age))) * 100.0) / 100.0;
        return resaleVal;
    }

    //toString
    public String toString() {
        return "Chair type: " + type + "     Age: " + age + "    Cost: " + cost;

    }


}
