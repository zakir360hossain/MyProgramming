package arraylist;

import java.util.*;

/**
 * @author Zakir Hossain
 * Feb 2, 2020
 * This is the Electtive class, associated with the Student class. It has several private data, constructors,
 * and getter methods. It has a method to add students to electives and has a toString method,
 */
public class Elective {
	
	private String name;		//contains the name of the elective course
	private int maxInClass;		//contains the maximum number of students that can enroll in the course
	private int classSize;		//contains the currently enrolled number of students in the course
	private ArrayList<Student> enrollees = new ArrayList<>();
	
	//constructs an object of type Elective
	public Elective(String name, int maxInClass, int classSize){
		this.name = name;
		this.maxInClass = maxInClass;
		this.classSize = classSize;
	}
	
	//returns the name of the elective
	public String getName(){
		return name;
	}
	
	//returns the maximum number to be enrolled in the course
	public int getMaxClassSize(){
		return maxInClass;
	}
	
	//returns the current enrollment in the course
	public int getClassSize(){
		return classSize;
	}

	//adds Student s to this elective
	//returns true if successfully added
	//returns false if unable to add the student
	public boolean addStudent(Student s){
		if (classSize<maxInClass){
			enrollees.add(s);
			classSize++;
			return true;
		}
		else {
			return false;
		}
	}
	
	//returns the ArrayList of Students in the course
	public ArrayList<Student> getStudents(){
		return enrollees;
	}
	
	//returns a String to be printed to the screen
	//	with information about the current elective
	public String toString(){
		return "\nName: "+name+ "\nCurrent class size: "+classSize+"\nMaximum Capacity: "+maxInClass;
	}
	

}
