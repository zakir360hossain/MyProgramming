public class CommercialJet extends Airplane implements Flying {
    private String make;    //represents the model of the CommercialJet (Boeing, Airbus, etc.)
    private double tankSize;    //represents the size of the fuel tank
    private double tripMiles;    //represents the miles on the current tank of fuel
    private double fuelUsed;    //represents the current fuel used on this fill-up

    public CommercialJet() {
    }

    public CommercialJet(int age, double value, double MPG, double newValue, double overallMiles, String make,
                         double tankSize, double tripMiles, double fuelUsed) {
        super(age, value, MPG, newValue, overallMiles);
        this.make = make;
        this.tankSize = tankSize;
        this.tripMiles = tripMiles;
        this.fuelUsed = fuelUsed;
    }

    //Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setTankSize(double tankSize) {
        this.tankSize = tankSize;
    }

    public double getTripMiles() {
        return tripMiles;
    }

    public void setFuelUsed(double fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    //Getters
    public String getMake() {
        return make;
    }

    public double getTankSize() {
        return tankSize;
    }

    public void setTripMiles(double tripMiles) {
        this.tripMiles = tripMiles;
    }

    public double getFuelUsed() {
        return fuelUsed;
    }

    @Override
    public void airplaneValue() {
        double deduction_with_age = (0.025 *getAge()) * getValue();
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

    public int compareTo(CommercialJet other) {
        if (this.getValue()<other.getValue()){
            return -1;
        }
        else if (this.getValue()==other.getValue()){
            return 0;
        }
        else {
            return 1;
        }
    }

    public boolean equals(CommercialJet other) {
        return this.getValue()==other.getValue();
    }

    @Override
    public String toString() {
        return "Generic Information: \n"+super.toString()+"\nSpecific Information: "+"\nCommercialJet{" +
                "make='" + make + '\'' +
                ", tankSize=" + tankSize +
                ", tripMiles=" + tripMiles +
                ", fuelUsed=" + fuelUsed +
                '}';
    }
}
