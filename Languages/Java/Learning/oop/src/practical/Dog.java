package practical;

/**
 * @author Zakir Hossain Feb 18, 2020
 */
public class Dog extends Animal implements AnimalAction {

	String dogType;

	public Dog(String n, String t, double w, int a, String dT) {
		super(n, t, w, a);
		dogType = dT;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see practical.AnimalAction#move(int)
	 */
	@Override
	public int move(int x) {
		if (x > 10)
			return 50;
		else
			return 2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see practical.AnimalAction#eat(int)
	 */
	@Override
	public void eat(int x) {
		if (x > 5)
			System.out.println(this.getName() + " is eating some food!");
		else
			System.out.println(getName() + " is not hungry!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see practical.AnimalAction#sleep(int)
	 */
	@Override
	public void sleep(int x) {
		if (x > 8)
			System.out.println(super.getName() + " is sleeping, shhhhh!");
		else
			System.out.println(super.getName() + " is awake and playing!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see practical.AnimalAction#play()
	 * 
	 */
	@Override
	public void play() {
		System.out.println(super.getName() + " is playing catch!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see practical.AnimalAction#speak()
	 */
	@Override
	public String speak() {
		if (this.getWeight() > 100)
			return "BARK BARK BARK";
		else
			return "bark";
	}

}
