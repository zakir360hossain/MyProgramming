package practical;

/**
 * @author Zakir Hossain
 * Feb 11, 2020
 * This practical.BirthdayBalloon is a child class of the practical.SquareBalloon class, which itself is a child class of the parent class
 * practical.Balloon. It simply constructs a parameterized constructor; some of the parameters are than parameterized to the
 * generic parameters that the superclass practical.Balloon tkake, through the use of super(). And it contains a toString that
 * itself has been concatinated to the generic toString method from the parent class.
 */
public class BirthdayBalloon extends SquareBalloon {
    /**
     * This balloon is a square balloon with a message on the side.
     */
    private int age;

    public BirthdayBalloon(String color, double price, int SideLength, int age) {
        super(color, price, SideLength);
        this.age = age;
    }
    public String toString(){
        return super.toString() + "\nHappy "+age+" Birthday!";
    }
}
