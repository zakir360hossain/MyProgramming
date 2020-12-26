package arraylist;

/**
 * @author Zakir Hossain
 * Jan 27, 2020
 * This is the Swimmer class with a default and a parameterized constructors. It has private variables with getters and
 * a setter called changeTime(). It also has an equal() method to compare two objects based on the time. It also has
 * a to string method that prints out the data.
 */

public class Swimmer{
	//data is the name of the swimmer and the 50 free time
	private String name;
	private double time;

	// Default constructor
	public Swimmer(){
	    name = "";
	    time  =0;
    }
    // Parameterized constructor
	public Swimmer(String n, double t)
	{
		name = n;
		time = t;
	}

    public String getName() {
        return name;
    }

    public double getTime() {
        return time;
    }

    // Updates the current time to the new time.
    public void changeTime(double time) {
        this.time = time;
    }
    public String toString(){
	    return "\nName: "+name+"\n"+ "Time: "+time;
    }

    // Return true if the times of both swimmers are the same
    public boolean equals(Swimmer other){
	    if (this.time==other.time){
	        return true;
        }
	    else {
	        return false;
        }
    }
}

