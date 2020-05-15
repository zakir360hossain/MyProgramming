package practical;

/**
 * @author Zakir Hossain Feb 18, 2020
 *
 */
public abstract class Animal {

	private String name;
	private String type;
	private double weight;
	private int age;

	public Animal(String name, String type, double weight, int age) {
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.age = age;
	}

	// Getters
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public double getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

}
