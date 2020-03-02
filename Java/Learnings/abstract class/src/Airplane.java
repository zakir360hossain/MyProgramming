public abstract class Airplane {
    private int age;            //represents age of airplane
    private double value;        //represents current $$ value of airplane
    private double MPG;        //represents current mileage on the airplane
    private double newValue;    //represents the value of the airplane when new
    private double overallMiles;    //represents the overall miles of the airplane

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

    /*
                           This method updates the value of the airplane based on the age and the overall mileage.

                            Update formulas:
                             1.  Deduction of price of 2.5% for every year old.
                             2.	 0-24,999 miles – deduct 5%
                             3.	25,000-49,999 – deduct 10%
                             4.	50,000-74,999 – deduct 15%
                             5.	75,000-99,999 – deduct 20%
                             6.	100,000+ - deduct 25%

                             The value should not be increased under normal circumstances
                         */
    public Airplane(int age, double value, double MPG, double newValue, double overallMiles) {
        this.age = age;
        this.value = value;
        this.MPG = MPG;
        this.newValue = newValue;
        this.overallMiles = overallMiles;
    }

    public abstract void airplaneValue();

    public String toString() {
        return "Airplane{" +
                "age = " + age +
                ", value = " + value +
                ", MPG = " + MPG +
                ", newValue = " + newValue +
                ", overallMiles = " + overallMiles +
                '}';
    }
}
