package practical;

/**
 * @author Zakir Hossain
 * Feb 18, 2020
 *
 */
public class TestAnimal {

	public static void main(String[] args) {
		// create some dog objects
		
		Dog dog1 = new Dog ("Bob", "Saint Bernard", 113.5, 4, "Working practical.Dog");
		Dog dog2 = new Dog ("Buster", "Golden Retriever", 85.3, 2, "Playful practical.Dog");
		
		System.out.println("Bob moved " + dog1.move(12) + " feet");
		dog1.sleep(2);
		dog1.eat(6);
		dog1.play();
		System.out.println("Bob says " + dog1.speak());
		
		System.out.println("Buster moved " + dog1.move(3) + " feet");
		dog2.sleep(10);
		dog2.eat(1);
		dog2.play();
		System.out.println("Buster says " + dog1.speak());
		
		Bird bibby = new Bird ("Bibby", "Mockingbird", 100, 2, true);
		bibby.eat(10);
		System.out.println("Bibby moved " + bibby.move(10) + " feet!");
		System.out.println("Bibby says " + bibby.speak());
		bibby.sleep(100);
		bibby.play();
		
	}
	
}
