package practical;

/**
 * @author Zakir Hossain
 * Feb 18, 2020
 * practical.Parallelogram extends the abstract practical.Quadrilateral class. With some private data, it
 * implements the abstract methods that are in the practical.Quadrilateral class.
 */
public class Parallelogram extends Quadrilateral {
    private double base; // the base of the parallelogram
    private double height;  //the height of the parallelogram, not the side.
    private double length; // The side of the parallelogram (left or right) to calculate perimeter.

    public Parallelogram(String type, double base, double length, double height) {
        super(type);
        this.base = base;
        this.height = height;
        this.length = length;
    }

    public double getBase() {
        return base;
    }

    public double getLength() {
        return length;
    }
    // No getter is needed for height, because it will not have further needing.

    @Override
    public double getArea() {
        // If the height is 0, this is not a rectangle, return the area of the parallelogram.
        if (height!=0){
            return base * height;
        }
        // Otherwise, this is a rectangle.
        else {
            return base*length;
        }
    }

    @Override
    public double getPerimeter() {
        return 2 * (base + length );
    }

    @Override
    // The ratio of area to the perimeter
    public double getRatio() {
        return getArea() / getPerimeter();
    }

    @Override
    /*
    See the method equals in practical.Quadrilateral
     */
    public boolean equals(Quadrilateral other) {
        return this.getArea() == other.getArea() && this.getPerimeter() == other.getPerimeter();
    }

    @Override
    /*
    determines which of two quadrilaterals are bigger based on AREA
    returns 1 if this quadrilateral is bigger than other quadrilateral
	returns -1 if this quadrilateral is smaller than other quadrilateral
	returns 0 if the quadrilaterals are equal
     */
    public int compareTo(Quadrilateral other) {
        if (this.getArea()>other.getArea()){
            return 1;
        }
        else if(this.getArea()<other.getArea()){
            return -1;
        }
        else {
            return 0;

        }
    }

    @Override
    public String toString() {
        return "Type: "+super.getType()+ "\nBase: "+base+"\nHeight: "+height+ "\nLength: "+length+
                "\nPerimeter: "+getPerimeter() + "\nArea: "+getArea();
    }
}
