public class ScoreInfo {
    private int score;
    private int numStudents;

    public ScoreInfo(int score){
        this.score = score;
        numStudents = 1;
    }

    public void increment(){
        numStudents++;
    }

    public int getScore() {
        return score;
    }

    public int getFrequency() {
        return numStudents;
    }
}
