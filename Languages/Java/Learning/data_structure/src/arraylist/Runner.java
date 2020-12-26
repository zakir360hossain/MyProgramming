package arraylist;

import java.util.*;

public class Runner {
	private String name; // Runner's name
	private double time; //Runner's best time
	private ArrayList<Double> allTimes;

	public Runner()
	{
		name = "blank";
		time = 0;
		allTimes = new ArrayList<Double>();
	}
	public Runner(String n, double t)
	{
		name = n;
		time = t;
		allTimes = new ArrayList<Double>();
		allTimes.add(t);

	}
	public void addTime(double t)
	{
		allTimes.add(t);
		if(t<time){
			time = t;
		}

	}
	public String getName()
	{
		return name;

	}
	public double getBestTime()
	{
		return time;

	}
	public boolean equals(Runner R)
	{
		if(this.time == R.getBestTime()){
			return true;
		}
		else{
			return false;
		}

	}
	//returns 0 if the Runners are equal
	//returns a negative if the best time of this Runner is faster than Runner R
	//returns a positive if the best time of this Runner is slower than Runner R
	public int compareTo(Runner R)
	{
		return (int) (this.time - R.getBestTime());
		// this.time is same as this.getBestTime()
		// R.getBestTime() is same as R.time
	}
	public String toString()
	{
		String s = "\nName: " + name;
		s += "\nBest Time: " + time;
		s += "\nAll Times: " + allTimes;
		return s;
	}

}


