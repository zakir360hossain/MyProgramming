package practical;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Zakir Hossain
 * Feb 26, 2020
 * This is the practical.Team class. It is not extended to anything else, but it does use
 * a type of practical.StudentAthlete for creating a list of athletic students.
 */
public class Team {
    private String teamName;	//identifies the school sport nickname
    private String sportName; //the specific sport name, i.e Football
private ArrayList<StudentAthlete> teamMembers;//member names

    public Team(String teamName, String sportName){
        int number;
        Scanner input = new Scanner(System.in);
        this.teamName = teamName;
        this.sportName = sportName;
        teamMembers = new ArrayList<StudentAthlete>();
        System.out.println("How many members");
        number = input.nextInt();

        for (int i = 0; i<number; i++){
            String name = "";
            int courseNum = 0;
            System.out.println("Member "+(i+1)+" name: ");
            name = input.next();
            System.out.println("How many courses are "+name+" taking?");
            courseNum = input.nextInt();
            teamMembers.add(i, new StudentAthlete(name, courseNum, sportName));
        }

    }
    public String toString() {
        return "practical.Team{" +
                "teamName='" + teamName + '\'' +
                ", teamMembers= " + teamMembers +
                '}';
    }
}
