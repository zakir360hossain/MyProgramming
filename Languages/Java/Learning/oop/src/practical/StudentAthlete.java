package practical;

/**
 * @author Zakir Hossain
 * Feb 24, 2020
 *
 * This is the child class of practical.Student. It has extra thing which is sport
 */
public class StudentAthlete extends Student {
    private String sport; //indicates which sport this student athlete plays

    public StudentAthlete() {
    }

    public StudentAthlete(String studentName, int courses, String sport) {
        super(studentName, courses);
        this.sport = sport;
    }

    // True if other player plays that same sport as this player.
    public boolean areSameSport(StudentAthlete other){
        return this.sport.equalsIgnoreCase(other.sport);
    }

    @Override
    public String toString() {
        return super.toString()+ "\nSport: "+sport;
    }
}
