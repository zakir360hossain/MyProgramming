package array;

import java.util.*;

public class Baseball {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        String [] playerName = new String[9];
        String [] playerName = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};

        Double [] average = new Double[9];
        Double [] home_runs = new Double[9];

        for (int i = 0; i<playerName.length; i++){
            System.out.println("Enter "+playerName[i] + "'s average and HR");
            average[i] = input.nextDouble();
            home_runs[i] = input.nextDouble();
        }

        System.out.println(playerName[0] + " has "+ home_runs[0] +" HR");
        System.out.println(playerName[1] + " has "+ home_runs[1] +" HR");

        System.out.println("Player Name\tAverage\tHome Runs");
        for (int j=0; j<playerName.length; j++){
            System.out.println(playerName[j] + "\t" +average[j] + "\t" + home_runs[j]);
        }




    }

}
