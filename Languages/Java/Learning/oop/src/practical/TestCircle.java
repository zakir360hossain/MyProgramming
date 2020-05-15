package practical;

import java.util.*;
/**
 * @author Zakir Hossain
 * October 16, 2019
 * 			This main program tests the practical.Circle practical.Circle object of the class practical.Circle. Specifically, it tests
 * 		toString, accessor, mutator, and other methods of the object.
 *
 */
public class TestCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Circle circle1 = new Circle(3, 5, 4);
        Circle circle2 = new Circle(2.5, 3.75, 9);

        // Testing toString method
        System.out.println("practical.Circle 1:");
        System.out.println(circle1 +"\n");
        System.out.println("practical.Circle 2:");
        System.out.println(circle2+"\n");

        // Testing Accessor method
        System.out.println("practical.Circle 1 Center: ("+ circle1.getH()+ ", "+ circle1.getK() +")");
        System.out.println("practical.Circle 1 Center: ("+ circle2.getH()+ ", "+ circle2.getK() +")");

        // Testing Mutator methods
        circle1.setH(6);
        circle1.setK(8);
        circle1.setRadius(16);
        System.out.println("practical.Circle 1 equation (after modified): ");
        System.out.println(circle1 +"\n");

        // Testing area and circumference methods
        System.out.println("Area of circle 1: " +circle1.Area());
        System.out.println("Circumference of circle 1: " +circle1.Circumference() +"\n");


        // Testing Translation (moveCircle) method
       Circle circle3 =  circle2.translation(2, 4);
        System.out.println("practical.Circle (translated circle2): " +circle3);
        System.out.println("Original circle (circle2) : " +circle2+ "\n");

        // Testing inOutCircle method
        // 0 => on
        // 1 => inside
        // 2 => Outside
        System.out.println(circle2.inOutCircle(5.5, 7));
        System.out.println(circle2.inOutCircle(15, 20));
        System.out.println(circle2.inOutCircle(11.5, 3.75));

        // Testing insideCircle method (bonus)
        // if the new circle is inside =>true
        // If not => false
        Circle circle4 = new Circle(2.5, 3.75, 8);
        System.out.println( circle2.insideCircle(circle4));

        // Testing inOutSquare
        // 0 => on
        // 1 => inside
        // 2 => Outside
        System.out.println(circle2.inOutSquare(2, 4));
        System.out.println(circle2.inOutSquare(3, 84.75 ));
        System.out.println(circle2.inOutSquare(20, 80));



    }
}
