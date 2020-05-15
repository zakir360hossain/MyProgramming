package practical;

/**
 * @author Zakir Hossain
 *
 * Feb 24, 2020
 *
 * This is the student class. It is not abstract, but it does not contain any
 * particular methods besides getters/setters and to string.
 */

public class Student {
	
	private String name;
	private int numCourses;
	
	public Student ()
	{
		name = "";
		numCourses = 0;
	}
	public Student (String studentName, int courses)
	{
		name = studentName;
		numCourses = courses;
	}
	
	public String getName()
	{
		return name;
	}
	public int getNumCourses()
	{
		return numCourses;
	}

	@Override
	public String toString() {
		return "\nName: "+name+"\nNumber of courses: "+numCourses;
	}
}
