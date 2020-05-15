package practical;

/**
 * @author Zakir Hossain
 * November 22, 2019
 * 			This class construct the design to calculate a statistics about a golf
 * 		play
 *
 */
public class Golfer {
    private int bestScore, worstScore, numGames;
    private double averageScore;

    // Default constructor
    public Golfer() {
        bestScore = 0;
        worstScore = 0;
        numGames = 0;
        averageScore = 0;
    }

    // Parameterized constructor
    public Golfer(int best_score, int wors_score, int games, double average_score) {
        bestScore = best_score;
        worstScore = wors_score;
        numGames = games;
        averageScore = average_score;
    }

    // Getters
    public int getBestScore() {
        return bestScore;
    }

    public int getWorstScore() {
        return worstScore;
    }

    public int getNumGames() {
        return numGames;
    }

    public double getAverageScore() {
        return averageScore;
    }

    // Setters
    public void setBestScore(int bestScore) {
        this.bestScore = bestScore;
    }

    public void setWorstScore(int worstScore) {
        this.worstScore = worstScore;
    }

    public void setNumGames(int numGames) {
        this.numGames = numGames;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public double newGame(int new_Score) {
        if (new_Score < bestScore) {
            bestScore = new_Score;
        }
        if (new_Score > worstScore) {
            worstScore = new_Score;
        }
        averageScore = (averageScore * numGames + new_Score) / (numGames + 1);
        numGames += 1;

        return averageScore;
    }

    public String withoutWorstScore() {
        double average;
        average = (averageScore * numGames - worstScore) / (numGames - 1);
        return "The new average score after eliminating worst score: " +average;
    }

    public String toString() {
        return ("Number of games: " + numGames + "\n" + "Best Score: " + bestScore + "\n" + "Worst Score: " + worstScore + "\n"
                + "Average Score: " + averageScore);
    }

    public int compareTo(Golfer other) {
        int key = 0;
        //If the input object has the same average as the reference object, then the method should return 0, if the
        // input object has a lower average than the reference object, then the method should return a positive integer,
        // if the input object has a higher average than the reference object, then the method should return a negative
        // integer.)
        if (other.averageScore == this.averageScore) {
            key=0;
        }
        if (other.averageScore > this.averageScore) {
           key = -1;
        }
        if (other.averageScore < this.averageScore) {
            key =1;
        }
        return key;
    }
}
