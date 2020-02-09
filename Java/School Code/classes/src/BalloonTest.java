
public class BalloonTest {
    public static void main(String[] args) {
        //Create rndBalloon objects
        RoundBalloon balloon1 = new RoundBalloon("Red", 0.99, 3);
        Balloon balloon2 = new RoundBalloon("Green", 1.99, 5);
        Balloon balloon3 = new RoundBalloon("Teal", 12.67, 12);

        System.out.println(balloon1.heliumAmount());
        System.out.println(balloon2);
        System.out.println(balloon3);

        // Create sqBalloon objects

        Balloon sb1 = new SquareBalloon("Red", 1, 12);
        SquareBalloon sb2 = new SquareBalloon("Yellow", 2, 12);




    }
}
