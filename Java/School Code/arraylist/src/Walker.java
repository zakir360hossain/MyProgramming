
public class Walker {

		
	private String name;
	private int currentAmount;
	private int highestMiles;
	private int totalMiles;
	
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
	public void updateMiles(int miles, boolean d)
	{
		this.totalMiles += miles;
		if (d){
			currentAmount+=miles;
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
	public boolean equals(Walker W)
	{
		if(totalMiles == W.getTotalMiles())
			return true;
		else
			return false;
	}
	//returns 0 if the Walkers have the same cumulative miles walked
	//returns a negative if the cumulative miles of this Walker is less than Walker other
	//returns a positive if the cumulative miles of this Walker is more than Walker other
//	public int compareTo(Walker W)
//	{
//		if (this.totalMiles ==W.totalMiles){
//			return 0;
//		}
//		else if(this.totalMiles>W.totalMiles) {
//			return -1;
//		}
//
//	}
	public String toString()
	{
		return "\nWalker's Name: "+name+"\nWalker's highest Miles: "+highestMiles;
	}
}
