public class PrivatePlane extends Airplane implements Flying {
    private String make;    //represents the model of the CommercialJet (Boeing, Airbus, etc.)
    private double tankSize;    //represents the size of the fuel tank
    private double tripMiles;    //represents the miles on the current tank of fuel
    private double fuelUsed;    //represents the current fuel used on this fill-up
    private int passNum;  // represents the passenger limit of the PrivatePlane.

    public PrivatePlane() {
    }

    public PrivatePlane(int age, double value, double MPG, double newValue, double overallMiles, String make,
                        double tankSize, double tripMiles, double fuelUsed, int passNum) {
        super(age, value, MPG, newValue, overallMiles);
         this.make = make;
        this.tankSize = tankSize;
        this.tripMiles = tripMiles;
        this.fuelUsed = fuelUsed;
        this.passNum = passNum;
    }

    @Override
    public void airplaneValue() {
        double deduction_with_age = (0.025 * getAge()) * getValue();
        double deduction_with_mileage = 0;

        if (getOverallMiles() >= 0 && getOverallMiles() <= 24999) {
            deduction_with_mileage = 0.05 * getValue();
        } else if (getOverallMiles() >= 25000 && getOverallMiles() <= 49999) {
            deduction_with_mileage = 0.1 * getValue();
        } else if (getOverallMiles() >= 50000 && getOverallMiles() <= 74999) {
            deduction_with_mileage = 0.15 * getValue();
        } else if (getOverallMiles() > 75000 && getOverallMiles() <= 99999) {
            deduction_with_mileage = 0.2 * getValue();
        } else {
            deduction_with_mileage = 0.25 * getValue();
        }
        setValue(getValue() - deduction_with_age - deduction_with_mileage);
    }

    @Override
    public double calcMileage(double miles, double gallons) {
        // Updates the MPG of the airplane based on the miles it covered with the fueled it burned
        this.setMPG(miles / gallons);
        tripMiles = +miles;
        fuelUsed = +gallons;
        return miles / gallons;
    }

    @Override
    public double updateOverallMileage(double miles, double gallons) {
        double newMileage = (getOverallMiles() + miles) / (gallons + (getOverallMiles() / getMPG()));
        this.setMPG(newMileage);
        this.setOverallMiles(getOverallMiles() + miles);
        return newMileage;
    }

    public int compareTo(PrivatePlane other) {
        if (passNum<other.passNum){
            return -1;
        }
        else if (passNum==other.passNum){
            return 0;
        }
        else {
            return 1;
        }
    }

    public boolean equals(PrivatePlane other) {
            return passNum==other.passNum;
        }

    @Override
    public String toString() {
        return "Generic Information: \n"+super.toString()+"\nSpecific Information: "+"PrivatePlane{" +
                "make='" + make + '\'' +
                ", tankSize=" + tankSize +
                ", tripMiles=" + tripMiles +
                ", fuelUsed=" + fuelUsed +
                ", passNum=" + passNum +
                '}';
    }
}
