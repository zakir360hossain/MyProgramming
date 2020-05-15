package practical;

public class Flag {
    /** State/attribute
     *
     */

    private int shape;
    private String type;
    private String name;
    private double height;
    private double width;

    // Behaviors things that the object can "do"
    // Things that the object can access or modify.

    // Constructors =>
    public Flag (){
        // Default constructor - sets the attributes to default values.
        shape = 0;
        type = "none";
        name = "unknown";
        height = 0;
        width = 0;
    }

    // Parameterized constructors
    public Flag(int s, String t, String n, double h, double w)
    {
        shape = s;
        type = t;
        name = n;
        height = h;
        width = w;
    }
    public Flag(int s, String t)
    {
        shape = s;
        type = t;
        name = "unknown";
        height = 0;
        width = 0;
    }
    // Accessor methods
    public int getShape()
    {

        return shape;
    }
    public String getType(){

        return type;
    }
    public String getName()
    {
        return name;
    }
    public double getHeight(){

        return height;
    }
    public double getWidth (){

        return width;
    }

    // modifier or mutator or setter methods

    public void setShape(int s) {
        shape = s;
    }

    public void setType(String t) {
        type = t;
    }

    public void setName(String n) {
        name = n;
    }

    public void setHeight(double h) {
        height = h;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double calcArea(){
        double area = height*width;
        if (shape==1){
            area = area/2;
        }
        return area;
    }

    // Helper methods
    public boolean equals(Flag other){
        boolean TorF;
        if(this.shape == other.shape && this.type.equals(other.type) && this.height == other.height
                && this.width == other.width){
            TorF = true;
        }
        else {
            TorF = false;
        }
        return TorF;
    }

    public String toString(){
        // concatenates the private data together so that it can be printed in an easy fashion.
        // It is concatenated together into a string variable

        String x = "";
        x = "\nType: " +type+ "\nShape: "+ shape + "\nName: "+ name+ "\nHeight: "+height+ "\nWidth :"+width;

        return x;
    }
}
