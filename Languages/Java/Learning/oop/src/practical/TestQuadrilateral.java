package practical;

/**
 * @author Zakir Hossain
 * Feb 18, 2020
 * This is the main method for the abstract parent practical.Quadrilateral class.
 * It creates instances for every child classes that are extended to the practical.Quadrilateral.
 */
public class TestQuadrilateral {

    public static void main(String[] args) {
        // Objects for practical.Parallelogram
        Parallelogram para1 = new Parallelogram("practical.Parallelogram", 8, 15, 12);
        Parallelogram para2 = new Parallelogram("practical.Parallelogram", 20, 30, 24);
        System.out.println("===========Parallelograms============");
        System.out.println(para1);
        System.out.println("Ratio of area to perimeter: "+para1.getRatio() + "\n");

        System.out.println(para2);
        System.out.println("Ratio of area to perimeter: "+para2.getRatio() + "\n");

        System.out.println("Are the two parallelograms equal?   "+para1.equals(para2)+"\n");

        //Determining which one is bigger.
        System.out.println("Which one is bigger?");
        if (para1.compareTo(para2) ==1){
            System.out.println("The following practical.Parallelogram is the bigger out of the two: "+para1+ "\n");
        }
        else if(para1.compareTo(para2)==-1){
             System.out.println("The following practical.Parallelogram is the bigger out of the two:"+para2+"\n");

        }
        else {
            System.out.println("The two parallelograms are same in terms of area.\n");
        }


        // Objects for practical.Trapezoid
        Trapezoid trap1 = new Trapezoid("practical.Trapezoid", 6, 14, 12, 10);
        Trapezoid trap2 = new Trapezoid("practical.Trapezoid", 20, 23, 25, 22);
        System.out.println("\n\n===========Trapezoids============");
        System.out.println(trap1);
        System.out.println("Ratio of area to perimeter: "+trap1.getRatio()+"\n");
        System.out.println(trap2);
         System.out.println("Ratio of area to perimeter: "+trap2.getRatio()+ "\n");


        System.out.println("Are the two trapezoids equal?   "+trap1.equals(trap2)+"\n");

        //Determining which one is bigger.
          System.out.println("Which one is bigger?");
        if (trap1.compareTo(trap2) ==1){
            System.out.println("The following trapezoid is the bigger out of the two: "+trap1+ "\n");
        }
        else if(trap1.compareTo(trap2)==-1){
             System.out.println("The following trapezoid is the bigger out of the two:"+trap2+"\n");
        }
        else {
            System.out.println("The two trapezoids are same in terms of area.\n\n");
        }


        // Objects for practical.Rectangle
        // The height is 0 in here
        Rectangle rectangle = new Rectangle("Square", 10, 10, 0);
        System.out.println("\n\n===========Rectangles============");
        System.out.println(rectangle +"\n");

        System.out.println("Is this rectangle a square?    " + rectangle.isRectangleSquare());

        //Calculating the area of a circle that could be inscribed in the above square.
        // A square is symmetric, so the diagonal has to pass through the center of the square,
        // thus through the center of the inscribed circle. 1/2 of its base or height is the radius of the
        // inscribed circle.
        double area = Math.PI*Math.pow(0.5*rectangle.getBase(), 2);
        System.out.println("The area of the circle that can be inscribed in the above " +
                "square: "+area);

    }
}
