package practical;

public class TestRectangle {
    public static void main(String[] args) {
       Rectangle2 bigRectangle2 = new Rectangle2(8, 2, 3, 12);
       Rectangle2 smallRectangle2 = new Rectangle2(12, 7, 1, 9);
       Rectangle2 otherRectangle2 = new Rectangle2(4, 5, 7, 10);



       bigRectangle2.calcArea();
       bigRectangle2.diagonalLength();

       smallRectangle2.calcArea();
       smallRectangle2.diagonalLength();

       System.out.println("Big practical.Rectangle: "+ bigRectangle2);
        boolean tof = bigRectangle2.onRectangle(6, 6);
        if(tof){
            System.out.println("The points you checked are on the rectangle (bigRectangle)");

        }
        else {
            System.out.println("The points are not on the rectangle.");
        }
       System.out.println("\nSmall practical.Rectangle: "+ smallRectangle2);

       otherRectangle2.isValidRectangle();
        System.out.println("\nOther rectangle: "+ otherRectangle2);

        otherRectangle2.setTop(20);
        otherRectangle2.setBottom(1);
        otherRectangle2.setLeft(2);
        otherRectangle2.setRight(30);
        System.out.println("\nOther practical.Rectangle again, after modification: "+ otherRectangle2);

        otherRectangle2.moveRectangle(2, 3);
        System.out.println("\nOther practical.Rectangle again, after translation: "+ otherRectangle2);



        smallRectangle2.rotateNinety();
        System.out.println("\nRotated practical.Rectangle");
        System.out.println(smallRectangle2);




    }
}
