import java.util.ArrayList;

public class Stats {
    private ArrayList<ScoreInfo> scoreList;

    // a.
    public boolean record(int score){
        for (int i = 0; i<scoreList.size(); i++){
            if (scoreList.get(i).getScore()==score){
                scoreList.get(i).increment();
                return false;
            }
            else {
                score = scoreList.get(i).getScore();
                if (score>scoreList.get(i+1).getScore()){
                    scoreList.add(i+1, new ScoreInfo(score));
                     return true;
                }
            }
        }
        return false;

    }

    // b.
    public void recordScores(int [] studScores){
        for (int studScore : studScores) {
            record(studScore);
        }
    }
}
