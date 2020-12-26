package arraylist;

/**
 * @author Zakir Hossain
 * Jan 25, 2020
 * This is the Walker class. It has default and parameterized constructors.
 * Setters and Getters, ans some other methods.
 */
public class Walker {

		
	private String name; // Walkers name
	private int currentAmount; // Walked miles of previous week
	private int highestMiles; // Highest miles in any week
	private int totalMiles; // The cumulative miles of all walked distance
	private int weeksMiles;	//current weeks miles (to date)
	
	public Walker()
	{
		currentAmount = 0;
		highestMiles = 0;
		totalMiles = 0;
	}
	public Walker(String name, int currentAmount)
	{
	this.name = name;
	this.currentAmount = currentAmount;

	}
	// miles => miles walked in a given day
	public void updateMiles(int miles, boolean d)
	{
		this.totalMiles=totalMiles+miles;
		weeksMiles  = weeksMiles + miles;

		if (d){
			if(weeksMiles > highestMiles)
				highestMiles = weeksMiles;
			currentAmount = weeksMiles;
			weeksMiles  =0;
		}
		else {
			this.totalMiles += miles;
		}

	}
	public String getName()
	{
		return name;
	}
	public int getTotalMiles()
	{
		return totalMiles;
	}
	public int getHighestMiles()
	{
		return highestMiles;
	}
	public int getMiles()
	{
		return currentAmount;
	}
	// Returns true if the name and the total amount walked are the same, false otherwise.
	public boolean equals(Walker W)
	{
		if(name.equals(W.name) && totalMiles == W.getTotalMiles())
			return true;
		else
			return false;
	}
	//returns 0 if the Walkers have the same cumulative miles walked
	//returns a negative if the cumulative miles of this Walker is less than Walker other
	//returns a positive if the cumulative miles of this Walker is more than Walker other
	public int compareTo(Walker W)
	{
		if (this.totalMiles ==W.totalMiles){
			return 0;
		}
		else if(this.totalMiles>W.totalMiles) {
			return 1;
		}
		else{
			return -1;
		}

	}
	public String toString()
	{
		return "\nName: "+name+ "\nTotal Miles: "+totalMiles+ "\nCurrent Miles: "+currentAmount+ "\nHighest Miles: "+highestMiles;
	}
}
