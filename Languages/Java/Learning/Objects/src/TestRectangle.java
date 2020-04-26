public class TestRectangle {
    public static void main(String[] args) {
       Rectangle bigRectangle = new Rectangle(8, 2, 3, 12);
       Rectangle smallRectangle = new Rectangle(12, 7, 1, 9);
       Rectangle otherRectangle = new Rectangle(4, 5, 7, 10);



       bigRectangle.calcArea();
       bigRectangle.diagonalLength();

       smallRectangle.calcArea();
       smallRectangle.diagonalLength();

       System.out.println("Big Rectangle: "+bigRectangle);
        boolean tof = bigRectangle.onRectangle(6, 6);
        if(tof == true){
            System.out.println("The points you checked are on the rectangle (bigRectangle)");

        }
        else {
            System.out.println("The points are not on the rectangle.");
        }
       System.out.println("\nSmall Rectangle: "+smallRectangle);

       otherRectangle.isValidRectangle();
        System.out.println("\nOther rectangle: "+otherRectangle);

        otherRectangle.setTop(20);
        otherRectangle.setBottom(1);
        otherRectangle.setLeft(2);
        otherRectangle.setRight(30);
        System.out.println("\nOther Rectangle again, after modification: "+otherRectangle);

        otherRectangle.moveRectangle(2, 3);
        System.out.println("\nOther Rectangle again, after translation: "+otherRectangle);



        smallRectangle.rotateNinety();
        System.out.println("\nRotated Rectangle");
        System.out.println(smallRectangle);




    }
}
