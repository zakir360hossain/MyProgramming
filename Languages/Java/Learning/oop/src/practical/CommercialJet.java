package practical;

/**
 * @author Zakir Hossain
 * March 2, 2020
 * This is the practical.CommercialJet class, a child class of practical.Airplane. It also implements the method from the practical.Flying interface
 */
public class CommercialJet extends Airplane implements Flying {
    private String make;    //represents the model of the practical.CommercialJet (Boeing, Airbus, etc.)
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
    // Overriding interface method
    // mileage means MPG
    public double calcMileage(double miles, double gallons) {
        // Updates the MPG of the airplane based on the miles it covered with the fueled it burned
        this.setMPG(miles / gallons);
        tripMiles +=miles;
        fuelUsed +=gallons;
        return miles / gallons;
    }

    @Override
    // Overriding interface method
    public double updateOverallMileage(double miles, double gallons) {
        double newMileage = (getOverallMiles() + miles) / (gallons + (getOverallMiles() / getMPG()));
        this.setOverallMiles(newMileage);
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
        return super.toString()+
                "make: " + make +
                "\ntankSize: " + tankSize +
                "\ntripMiles: " + tripMiles +
                "\nfuelUsed: " + fuelUsed;
    }
}
