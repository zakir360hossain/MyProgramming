package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;


public class GoScore {
    public static void main(String[] args) {
        Random rn = new Random();

        Collection<Integer> scoreBoard = new ArrayList<>(40);

        for (int i = 0; i<20; i++){
            scoreBoard.add(rn.nextInt((50-5)+1) + 5); // nextInt((max-min)+1)+min; 1 is to include max.
        }
        System.out.println(scoreBoard.toString());

        for (int score:scoreBoard){
            if (score<3 || score>44){
                scoreBoard.remove(score); // again, solely Collection itself does not provide indexing.
            }
        }
    }
}
