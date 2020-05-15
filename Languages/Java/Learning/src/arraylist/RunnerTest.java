package arraylist;

import java.util.*;

/**
 * @author 22chhedae
 * January 23rd, 2019
 */
public class RunnerTest {

	public static void main(String[] args) {

		Runner Tino = new Runner("Slowpoke", 102.34);
		Runner CoachKelly = new Runner("Kevin", 14.34);
		Runner Sam = new Runner("Awesome", 34.56);
		Runner Bill = new Runner ("Bill", 23.12);
		Runner George = new Runner("George", 13.26);
		Runner Michael = new Runner("Michael", 25.41);

		CoachKelly.addTime(15.67);
		CoachKelly.addTime(12.98);
		System.out.println(CoachKelly);

		ArrayList<Runner> team = new ArrayList<Runner>();
		team.add(Sam);
		team.add(CoachKelly);
		team.add(Tino);

		System.out.println(team);

		Runner another;
		another  = team.remove(0);
        System.out.println(team);

        team.add(1, George);
		System.out.println(team);

		team.set(2, Bill); // Set places, add moves everything one down.

        System.out.println(team);

		System.out.println(team.size());

		for (int i = 0; i<team.size(); i++){
            System.out.println(((Runner)(team.get(i))).getName());
        }
	}
}