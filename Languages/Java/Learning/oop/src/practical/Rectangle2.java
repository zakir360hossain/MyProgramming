package practical;

/**
 * @author Zakir Hossain
 * October 6, 2019
 * 			This class create a rectangle, translates the rectangle and verify if the rectangle is valid
 *
 */
public class Rectangle2 {
    private int top;
    private int bottom;
    private int left;
    private int right;

    // Constructors
    public Rectangle2(){
        // Default
        top = -1;
        bottom = -1;
        left = -1;
        right = -1;

    }
    public Rectangle2(int y_top, int y_bottom, int x_left, int x_right){
        // Parameterized
        top = y_top;
        bottom = y_bottom;
        left = x_left;
        right = x_right;
    }
    // Accessor
    public int getTop(){
        return top;
    }
    public int getBottom(){
        return bottom;
    }
    public int getLeft(){
        return left;
    }
    public int getRight(){
        return right;
    }

    // Mutator
    public int setTop(int altTop){
        this.top = altTop;
        return top;
    }
    public int setBottom(int altBottom){
        this.bottom = altBottom;
        return bottom;
    }
    public int setLeft(int altLeft){
        this.left = altLeft;
        return left;
    }
    public int setRight(int altRight){
        this.right = altRight;
        return right;
    }

    public int calcWidth(){
        return top-bottom;

    }
    public int calcLength(){
        return right - left;
    }

    public int calcArea(){
        return calcWidth() * calcLength();
    }

    public boolean isValidRectangle(){
        if(top>bottom && right>left){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean onRectangle(int x_cor, int y_cor){

        if((x_cor>= left && x_cor<=right) && (y_cor>=bottom && y_cor<=top)){
            return true;
        }
        else {
            return false;
        }
    }

    public double diagonalLength(){
        return Math.sqrt(Math.pow(calcWidth(), 2) + Math.pow(calcLength(), 2));
    }

    public Rectangle2 moveRectangle(int rightUnits, int upUnits){
        bottom = bottom+upUnits;
        top = top+upUnits;
        left = left+rightUnits;
        right = right+rightUnits;
        int newTop = top;
        int newBottom  = bottom;
        int newLeft = left;
        int newRight = right;
        Rectangle2 totherRectangle2 = new Rectangle2(newTop, newBottom, newLeft, newRight);
        return totherRectangle2;
    }

    public Rectangle2 rotateNinety(){
       int temp1 = calcWidth();
       int temp2 = calcLength();
        top = temp2+bottom;
        left = right;
        right = left+temp1;

        int newTop = top;
        int newLeft = left;
        int newRight = right;
        Rectangle2 rotatedRectangle2 = new Rectangle2(newTop, bottom, newLeft, newRight);
        return rotatedRectangle2;


    }

    public String toString(){
        String data = "\nWidth: "+  calcWidth() + "\nlength: "+ calcLength() +"\nArea: "+calcArea() + "\nIs valid " +
                "rectangle?: "+isValidRectangle() +"\nDiagonal Length: "+ diagonalLength();
        return data;
    }

}


