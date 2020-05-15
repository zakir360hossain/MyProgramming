package practical;

/**
 * @author Zakir Hossain
 * Feb 18, 2020
 *
 *
 * interfaces list methods that classes could / should use
 *  * a class would use these methods if they implement this interface
 *  *
 *  * the methods in an (any) interface have no body (directions)
 *  * they only have the header (definition)
 *
 */
public interface AnimalAction {
	
	int move (int x);
	// the move method tells how much the animal has moved
	
	void eat (int x);
	// the eat method describes how the animal consumes food
	
	void sleep (int x);
	// the sleep method takes in how long the animal is at rest
	
	void play();
	// the play method will print a description of the animal at play
	
	String speak();
	// the speak method returns the "words" of the animal

}
