package practical;

public class ShapeBalloon extends Balloon {
    private int height;
    private int length;
    String shape;

    public ShapeBalloon(String color, double price, int height, int length, String shape) {
        super(color, price);
        this.height = height;
        this.length = length;
        this.shape = shape;
    }

    @Override
    public double heliumAmount() {
        // Returns the volume of the shape. The base of the shape is a square.
        return Math.pow(length, 2) * height;
    }

    public String toString() {
        return super.toString() + "\nHeight: " + height + "\nLength: " + length + "\nShape: " + shape;
    }
}
