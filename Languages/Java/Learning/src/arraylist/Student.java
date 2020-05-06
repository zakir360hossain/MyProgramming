package arraylist;

import java.util.*;

/**
 * @author Zakir Hossain
 * Feb 2, 2020
 * This is the Student class that is associated to the Elective class. It has private data and they are being
 * manipulated with different methods and the data are being obtained with getter methods.
 */
public class Student {
	
	//the student's name
	private String name;					
	//the list of electives that the student has enrolled in
	private ArrayList<Elective> electives = new ArrayList<Elective>();	
	
	//creates an object of type Student
	public Student(String n){
		this.name  = n;
	}
	
	//returns the name of the Student object
	public String getName(){
		return name;
	}
	
	//registers the student for the input Elective, if able
	//returns true if the Student was able to register for Elective e
	//returns false if the Student cannot register
	public boolean registerElective(Elective e){
		if (e.getClassSize()<e.getMaxClassSize()){
			electives.add(e);
			return true;
		}
		else {
			return false;
		}
	}
	
	//returns the ArrayList of Electives that the student is
	//	registered for
	public ArrayList<Elective> getElectives(){
		return electives;
	}
	
	//returns a String to be printed to the screen
	public String toString(){
		return "Name: "+name+"  \n Elective:"+electives;
	}
	
	

}
