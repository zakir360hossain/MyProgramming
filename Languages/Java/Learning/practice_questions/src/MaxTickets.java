
import java.util.*;

public class MaxTickets {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){{
            add(8);
            add(7);
            add(4);
            add(3);
            add(5);
            add(8);
        }};

        System.out.println(maxTickets(list));
    }

    // Complete the maxTickets function below.
    static int maxTickets(List<Integer> tickets) {
        List<ArrayList<Integer>> subsequences = new ArrayList<ArrayList<Integer>>();
        List<Integer> maxTicketsSub = new ArrayList<>();
        for (int i = 0; i<tickets.size(); i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j<tickets.size(); j++){
                temp.add(tickets.get(j));
                int diff = Math.abs(tickets.get(j+1) - tickets.get(i));
                if(diff==0 || diff==1){
                   temp.add(tickets.get(j));
                }
            }
            subsequences.add(temp);
            temp.forEach(tickets::remove);
            temp.clear();
        }
        int maxSubIndex = 0;
        for(ArrayList<Integer> list :  subsequences){
            if(list.size() > maxSubIndex){
                maxSubIndex = list.size();
            }
        }
        return maxSubIndex;
    }
}
