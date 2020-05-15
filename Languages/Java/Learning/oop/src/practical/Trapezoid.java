package practical;

/**
 * @author Zakir Hossain
 * Feb 18, 2020
 * practical.Trapezoid extends the abstract practical.Quadrilateral class. With some private data, it
 * implements the abstract methods that are in the practical.Quadrilateral class.
 */
public class Trapezoid extends Quadrilateral {
    private double a; //Smaller front side
    private double b; //Bigger back side
    private double c; //Left side
    private double d; //Right side
    public Trapezoid(String type, double a, double b, double c, double d) {
        super(type);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getArea() {
        // Pythagorean theorem to get the height.
        // practical.Trapezoid area = ((a+b)/2)*h
        double h = Math.sqrt(Math.pow(c, 2) - Math.pow(b-a, 2));
        return ((a+b)/2)*h;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }

    @Override
     // The ratio of area to the perimeter
    public double getRatio() {
        return getArea()/getPerimeter();
    }

    @Override
    public boolean equals(Quadrilateral other) {
         return this.getArea() == other.getArea() && this.getPerimeter() == other.getPerimeter();
    }

    @Override
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
      return "Type: "+super.getType()+ "\nSide a: "+a+"\nSide b: "+b+"\nSide c: "+c+"\nSide d: "+d+
                "\nPerimeter: "+getPerimeter() + "\nArea: "+getArea();
    }
}
