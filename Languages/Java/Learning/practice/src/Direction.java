public class Direction {
}

class Route {
    private Address addressFrom;
    private Address addressTo;
    private double distance=0;
    private boolean rerouted=false;
    private boolean unexpectedTurn=false;

    public Route(Address addressFrom, Address addressTo) {
        this.addressFrom = addressFrom;
        this.addressTo = addressTo;
    }

    public double distance(){
        if (addressFrom.isMyLoc()) return addressFrom.calcDistance(addressTo);
        return Address.calcDistance(addressFrom, addressTo);
    }
    public Address getAddressFrom() {
        return addressFrom;
    }

    public Address getAddressTo() {
        return addressTo;
    }

    public double getDistance() {
        return distance;
    }

    public boolean isReroute() {
        return rerouted;
    }

    public void reroute(){
        if(unexpectedTurn) rerouted=true;
    }
    public void unexpectedTurn(){
        unexpectedTurn=true;
    }
}


class Address {
    private final int streetNumber;
    private final String streetName;
    private final String city;
    private final String state;
    private final int zipCode;
    boolean isMyLoc =false;


    public Address(int streetNumber, String streetName, String city, String state, int zipCode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }


    /**
     * If in the same state and has the same zip code, then the estimated time is 10 miles.
     * If in the same state and different zip code, then the estimated time is 50 miles.
     * If in the different state, then the estimated time is 100 miles.
     */
    public double calcDistance(Address addressTo){
        double distanceBetween;
        boolean sameZip=this.getZipCode()==addressTo.getZipCode();
        boolean sameState= this.getState().equals(addressTo.getState());
       if(sameZip && sameState) distanceBetween = 10;
       else if(sameState) distanceBetween = 50;
       else distanceBetween =100;

       return distanceBetween;
    }
    public static double calcDistance(Address addressFrom, Address addressTo){
        double distanceBetween;
        boolean sameZip=addressFrom.getZipCode()==addressTo.getZipCode();
        boolean sameState= addressFrom.getState().equals(addressTo.getState());
        if(sameZip && sameState) distanceBetween = 10;
        else if(sameState) distanceBetween = 50;
        else distanceBetween =100;

        return distanceBetween;
    }

    public boolean isMyLoc(){
        isMyLoc = true;
        return isMyLoc;
    }


    @Override
    public String toString() {
        return "Address{" +
                "streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

}