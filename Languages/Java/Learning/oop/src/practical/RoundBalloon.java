package practical;

public class RoundBalloon extends Balloon {

    private double radius;

    public RoundBalloon(){
        // default constructors
    }

    public RoundBalloon(String color, double price, int radius) {
        super(color, price);
        this.radius = radius;
    }

    @Override
    public double heliumAmount() {
        return 4.0/3.0*Math.PI*Math.pow(radius, 3);
    }

    // An example of polymorphism
    public String toString(){
        return super.toString()+ "\nRadius: "+radius;
    }
}
