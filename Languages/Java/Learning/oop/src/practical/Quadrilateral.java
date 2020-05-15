package practical;

public abstract class Quadrilateral
{
	  private String type;

	  public Quadrilateral(String type)
	  {
	    this.type = type;
	  }
	  public String getType()
	  {
		  return type;
	  }
	  public void setType(String type)
	  {
		  this.type = type;
	  }
	  //calculates and returns the area of the quadrilateral
	  public abstract double getArea();

	  //calculates and returns the perimeter of the quadrilateral
	  public abstract double getPerimeter();

	  //calculates and returns the ratio of the quadrilateral area to perimeter
	  public abstract double getRatio();

	  //determines if two quadrilaterals are equal
	  //quadrilaterals are equal if their areas and perimeters are equal
	  public abstract boolean equals(Quadrilateral other);

	  //determines which of two quadrilaterals are bigger based on area
	  //returns 1 if this quadrilateral is bigger than other quadrilateral
	  //returns -1 if this quadrilateral is smaller than other quadrilateral
	  //returns 0 if the quadrilaterals are equal
	  public abstract int compareTo(Quadrilateral other);

	  //toString method
	  public abstract String toString();

}
