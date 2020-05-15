package practical;

/**
 * @author Zakir Hossain
 * March 2, 2020
 * This is the practical.PrivatePlane class, a child class of practical.Airplane. It also implements the method from the practical.Flying interface
 */
public class PrivatePlane extends Airplane implements Flying {
    private String make;    //represents the model of the practical.CommercialJet (Boeing, Airbus, etc.)
    private double tankSize;    //represents the size of the fuel tank
    private double tripMiles;    //represents the miles on the current tank of fuel
    private double fuelUsed;    //represents the current fuel used on this fill-up
    private int passNum;  // represents the passenger limit of the practical.PrivatePlane.

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
    //Overriding interface method
    public double calcMileage(double miles, double gallons) {
        // Updates the MPG of the airplane based on the miles it covered with the fueled it burned
        this.setMPG(miles / gallons);
        tripMiles = +miles;
        fuelUsed = +gallons;
        return miles / gallons;
    }

    @Override
    //Overriding interface method
     // Overriding interface method, this can be generic since there are no changes will be occurring in the child classes
    public double updateOverallMileage(double miles, double gallons) {
        double newMileage = (getOverallMiles() + miles) / (gallons + (getOverallMiles() / getMPG()));
        this.setOverallMiles(newMileage);
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
       return super.toString()+
                "make: " + make +
                "\ntankSize: " + tankSize +
                "\ntripMiles: " + tripMiles +
                "\nfuelUsed: " + fuelUsed+
                "\nMaximum occupancy: "+passNum;
    }
}
