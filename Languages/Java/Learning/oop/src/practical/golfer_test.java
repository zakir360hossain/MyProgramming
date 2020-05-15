package practical;

/**
 * @author Zakir Hossain
 * November 22, 2019
 * 			This program tests the practical.Golfer class
 *
 */
public class golfer_test {
    public static void main(String[] args) {
        Golfer play1  = new Golfer(20, 34, 6, 25 );
        Golfer play2 = new Golfer(15, 45, 9, 29);

        System.out.println(play1.toString() + "\n");

        // Setters
        play1.setBestScore(12);
        play1.setWorstScore(28);
        play1.setNumGames(4);
        play1.setAverageScore(14);
        System.out.println("\n");

        //Getters
        System.out.println(play1.getAverageScore());
        System.out.println(play1.getBestScore());
        System.out.println(play1.getNumGames());
        System.out.println(play1.getWorstScore()+"\n");

        // New score
        play1.newGame(18);
        System.out.println("\n");
        System.out.println(play1);
        System.out.println("\n");

        // With out worst score
        System.out.println(play1.withoutWorstScore());;

        // Compare to
        System.out.println(play1.compareTo(play2));;

    }
}
