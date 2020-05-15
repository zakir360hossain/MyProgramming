package practical;

/**
 * This is also an example of polymorphism
 * Every balloon will have colors and price, but some will have different shapes, for which it requires different
 * subclasses to implement different methods for calculating volumes of different shape.
 */

public class SquareBalloon extends Balloon {
    private int SideLength;
    public SquareBalloon() {
    }

    public SquareBalloon(String color, double price, int SideLength) {
        super(color, price);
        this.SideLength = SideLength;
    }

    @Override
    public double heliumAmount() {
        // Returns the volume of the square
        return Math.pow(SideLength, 3);
    }
    public String toString(){
        return super.toString() + "\nSide : " +SideLength;
    }
}
