/**
 * @author Zakir Hossain Feb 11, 2020 This is the main program to instantiate
 *         objects for all child classes that are extended to the parent, or the
 *         abstract class Balloon.
 */
public class BalloonTest {
	public static void main(String[] args) {
//        Create rndBalloon objects
		RoundBalloon balloon1 = new RoundBalloon("Red", 0.99, 3);
		Balloon balloon2 = new RoundBalloon("Green", 1.99, 5);
		Balloon balloon3 = new RoundBalloon("Teal", 12.67, 12);

		System.out.println(balloon1.heliumAmount() + "\n");
		System.out.println(balloon2 + "\n");
		System.out.println(balloon3 + "\n");

		// Create SquareBalloon objects
		Balloon sb1 = new SquareBalloon("Red", 1, 12);
		SquareBalloon sb2 = new SquareBalloon("Yellow", 2, 12);
		System.out.println(sb1.heliumAmount() + '\n');
		System.out.println(sb2 + "\n");

		// BirthdayBalloon objects
		BirthdayBalloon A1 = new BirthdayBalloon("Brown", 0.99, 6, 4);
		System.out.println("Helium amount in A1: " + A1.heliumAmount() + "\n");
		System.out.println(A1 + "\n");

		// HappyBirthday objects
		HappyBirthday Maya = new HappyBirthday(10, "PINK", 11, "Balloons Celebration!");
		Balloon[] MayaBalloons = Maya.getPartyBalloons();
		for (int i = 0; i < MayaBalloons.length; i++) {
			System.out.println(i + 1 + ":\n" + MayaBalloons[i]);
			System.out.println("\n");
		}
		System.out.println("Helium in Maya[0]: " + MayaBalloons[0].heliumAmount() + "\n");
		// ShapeBalloon objects
		ShapeBalloon shapeB1 = new ShapeBalloon("PURPLE", 3.50, 3, 4, "Cake");
		System.out.println(shapeB1.toString() + "\n");
		System.out.println("Helium in the shape balloon: " + shapeB1.heliumAmount() + "\n");

		// CelebrateBalloon objects
		CelebrateBalloon celebrateBalloon1 = new CelebrateBalloon("RED", 0.99, 4, 5, "Football", "Go Team");
		System.out.println(celebrateBalloon1.toString() + '\n');
		System.out.println("Helium amount in Celebrate Balloon: " + celebrateBalloon1.heliumAmount());
	}
}
