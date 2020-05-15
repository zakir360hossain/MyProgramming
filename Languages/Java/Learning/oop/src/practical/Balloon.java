package practical;

public abstract class Balloon {
	private String color;
	private double cost;
	
	public Balloon()
	{
		color = "BLUE";
		cost = 0;
	}
	public Balloon(String color, double price)
	{
		this.color = color;
		cost = price;
	}
	public String getColor()
	{
		return color;
	}
	public double getCost()
	{
		return cost;
	}
	public abstract double heliumAmount();
	
	public String toString()
	{
		return "Color: " + color + "\nCost: " + cost;
	}

}
