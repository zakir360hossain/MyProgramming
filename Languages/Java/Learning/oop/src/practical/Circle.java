package practical;

public class Circle {
    //represents a circle in the first quadrant of a coordinate plane

    //private variables
    private double h;    //x coordinate of the center
    private double k;    //y coordinate of the center
    private double radius;    //radius of the circle

    //default constructor
    public Circle() {
        h = -1;
        k = -1;
        radius = -1;
    }

    //parameterized constructor
    public Circle(double x, double y, double r) {
        h = x;
        k = y;
        radius = r;
    }

    //accessor methods
    public double getH() {
        return h;
    }

    public double getK() {
        return k;
    }

    public double getRadius() {
        return radius;
    }

    //modifier methods
    public void setH(double x) {
        h = x;
    }

    public void setK(double y) {
        k = y;
    }

    public void setRadius(double r) {
        radius = r;
    }

    //precondition: practical.Circle has been initialized
    //postcondition: area of the practical.Circle object is calculated
    //			and returned
    public double Area() {
        return (Math.PI * Math.pow(radius, 2));

    }

    //precondition: practical.Circle has been initialized
    //postcondition: circumference of the practical.Circle object is calculated
    //		and returned
    public double Circumference() {
        return (2 * Math.PI * radius);

    }

    //precondition: practical.Circle has been initialized
    //postcondition: a new practical.Circle object is created based on
    //		the original circle and the input data and returned
    //NOTE: the original circle is NOT changed
    public Circle translation(double xmove, double ymove) {
        double newH = h + xmove;
        double newK = k + ymove;
        Circle movedCircle = new Circle(newH, newK, this.radius);
        return movedCircle;


    }

    //precondition: practical.Circle object is created properly
    //postcondition: original circle doesn't change
    //		true/false indicates if the point is on the circle
    public boolean onCircle(double x, double y) {
        double leftside = Math.pow((x - h), 2) + Math.pow((y - k), 2);
        double rightside = Math.pow(radius, 2);
        if (leftside == rightside) {
            return true;
        } else {
            return false;
        }


    }

    //precondition: practical.Circle has been properly instantiated
    //postcondition: original circle stays the same
    //determines if a point is in the circle (returns 1), on the circle
    //(returns 0), or outside the circle (returns 2)
    public int inOutCircle(double x, double y) {
        if (onCircle(x, y)) {
            return 0;
        } else {
            double leftside = Math.pow((x - h), 2) + Math.pow((y - k), 2);
            double rightside = Math.pow(radius, 2);
            if (leftside < rightside) {
                return 1;
            } else {
                return 2;
            }
        }

    }

    //precondition: original circle is created correctly
    //postcondition: neither circle is changed, but t/f is
    //		returned if the other circle is inside the original circle
    public boolean insideCircle(Circle other) {
        boolean tOrF = false;
        double dis = Math.sqrt(Math.pow((other.h - h), 2) + Math.pow((other.k - k), 2));

        if (dis + other.radius <= radius) {
            return tOrF = true;
        } else {
            return tOrF = false;

        }


    }

    public int inOutSquare(double x_cor, double y_cor) {
        int key = 0;
        double top = k + radius;
        double bottom = k - radius;
        double left = h - radius;
        double right = h + radius;

        // Inside
        if (x_cor < right && x_cor > left) {
            if (y_cor < top && y_cor > bottom) {
                key = 1;
            }
        }

        // On
        else if (x_cor == right || x_cor == left) {
            if (y_cor < top && y_cor > bottom) {
                key = 0;
            }
        }

        // On
        else if (y_cor == top || y_cor == bottom) {
            if (x_cor < right && x_cor > left) {
                key = 0;
            }
        }

        // Outside
        else {
            key = 2;
        }

        return key;
    }

    public String toString() {
        return "(x-" + h + ")^2 + (y-" + k + ")^2 = " + (Math.pow(radius, 2));
    }
}


