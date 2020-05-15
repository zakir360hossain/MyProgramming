package practical;

/**
 * @author Zakir Hossain
 * Feb 18, 2020
 *
 */
public class Bird extends Animal implements AnimalAction {

boolean songBird;  // true if sings, false otherwise

public Bird(String n, String t, double w, int a, boolean b) {
								super(n, t, w, a);
								songBird = b;
}

/* (non-Javadoc)
 * @see practical.AnimalAction#move(int)
 */
@Override
public int move(int x) {
								// x > 5, bird flies 20 feet
								// else the bird flies 1 foot
								if (x > 5)
								{
																return 20;
								}
								else
								{
																return 1;
								}
}

/* (non-Javadoc)
 * @see practical.AnimalAction#eat(int)
 */
@Override
public void eat(int x) {
								// x > 10, the bird is eating
								// else not eating
								if (x > 10)
																System.out.println(this.getName() + " is eating food!");
								else
																System.out.println(this.getName() + " is not eating!");

}

/* (non-Javadoc)
 * @see practical.AnimalAction#sleep(int)
 */
@Override
public void sleep(int x) {
								// x > 2, the bird is sleeping
								// else not sleeping
								if (x > 2)
																System.out.println(getName() + " is sleeping!");
								else
																System.out.println(getName() + " is not sleeping!");

}

/* (non-Javadoc)
 * @see practical.AnimalAction#play()
 */
@Override
// The bird be playing if songBird is true for singing
// play = singing
public void play() {
								if(songBird) {
																System.out.println(getName() + " is playin!");
								}
								else{
																System.out.println(getName()+ "Is not playing!");
								}

}

/* (non-Javadoc)
 * @see practical.AnimalAction#speak()
 */
@Override
public String speak() {
								// always speaks because birds do that
								return "Toot";
}

}
