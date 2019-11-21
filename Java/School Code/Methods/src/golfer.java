public class golfer {
    private int bestScore, worstScore, numGames;
    private double averageScore;

    // Default constructor
    public golfer(){
        bestScore = 0;
        worstScore = 0;
        numGames = 0;
        averageScore=  0;
    }
    // Parameterized constructor
    public golfer(int best_score, int wors_score, int games, double average_score){
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

    public double newGame(int new_Score){
        if (new_Score<bestScore){
            bestScore = new_Score;
        }
        else {
            worstScore = new_Score;
        }
        numGames+=1;

        return new_Score;
    }
    public double withoutWorstScore(){
        double average_score = bestScore;

        return average_score;
    }
    public compareTo

}
