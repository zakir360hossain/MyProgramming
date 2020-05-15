package practical;

/**
 * @author Zakir Hossain
 * Feb 11, 2020
 * This practical.CelebrateBalloon is a child class of the practical.ShapeBalloon class, which itself is a child class of the parent class
 * practical.Balloon. It simply constructs a parameterized constructor; some of the parameters are than parameterized to the
 * generic parameters that the superclass practical.Balloon take, through the use of super(). And it contains a toString that
 * itself has been concatinated to the generic toString method from the parent class.
 */

public class CelebrateBalloon extends ShapeBalloon {
    private String saying;
    public CelebrateBalloon(String color, double price, int height, int length, String shape, String saying) {
        super(color, price, height, length, shape);
        this.saying = saying;
    }

    public String toString(){
        return super.toString() + "\nSaying: "+ saying;
    }
}
