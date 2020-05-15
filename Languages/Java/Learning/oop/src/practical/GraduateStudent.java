package practical;

/**
 * @author Zakir Hossain
 * Feb 24, 2020
 * This is the child class of practical.Student. It has one extra feature, which is degree.
 */
public class GraduateStudent extends Student {
    private String degree; // indicates what degree the student is working toward
    public GraduateStudent() {
    }

    public GraduateStudent(String studentName, int courses, String degree) {
        super(studentName, courses);
        this.degree = degree;
    }
     // True if other graduate student is pursuing the same degree, otherwise, false.
    public boolean areSameDegree(GraduateStudent other){
        return this.degree.equalsIgnoreCase(other.degree);
    }

    @Override
    public String toString() {
        return super.toString()+ "\nDegree: "+degree;
    }

}
