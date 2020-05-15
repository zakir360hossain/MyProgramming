package array;

import java.util.Arrays;

/**
 * @author Zakir Hossain
 * December 10, 2019
 * This program initializes 3 lists, basketball players name, Free Throw Percentage (FTP), and average points
 * per game (APG). The program manipulates the 3 lists throw string manipulation, loops, and some qauntitative
 * calculation.
 */

public class Basketball {

    public static void main(String[] args) {
        String[] name = {"Joel Embiid", "Ben Simmons", "Tobias Harris", "Furkan Korkmaz", "Mike Scott"};
        double[] FTP = {6.2, 69.9, 7.3, 3.9, 5.1};
        double[] APG = {23.76, 18.99, 16.87, 8.99, 10.06};

        // a)
        double max = FTP[0];
        double min = FTP[0];
        String maxPlayerName = name[0], minPlayerName = name[0];
        double maxPlayerAPG = APG[0], minPlayerAPG = APG[0];

        double totalAPG = 0;
        for (int i = 0; i < FTP.length; i++) {
            if (FTP[i] > max) {
                max = FTP[i];
                maxPlayerName = name[i];
                maxPlayerAPG = APG[i];

            } else if (FTP[i] < min) {
                min = FTP[i];
                minPlayerName = name[i];
                minPlayerAPG = APG[i];
            }

            totalAPG += APG[i];
        }

        System.out.println("Player with maximum free throw % and average points per game");
        System.out.println(maxPlayerName);
        System.out.println(max);
        System.out.println(maxPlayerAPG);
        System.out.println("\n");
        System.out.println("Player with minimum free throw % and average points per game");
        System.out.println(minPlayerName);
        System.out.println(min);
        System.out.println(minPlayerAPG);
        System.out.println("\n");
        System.out.println("Average Point per game for the team: " + totalAPG / 5);
        System.out.println("\n");

        String[] firstName = new String[5];
        String[] lastName = new String[5];

        for (int i = 0; i < name.length; i++) {
            firstName[i] = name[i].substring(0, name[i].indexOf(" "));
            lastName[i] = name[i].substring(name[i].indexOf(" ") + 1);
        }

        System.out.println("Players' first names list: ");
        System.out.println(Arrays.toString(firstName));
        System.out.println("\n");
        System.out.println("Players' last names list");
        System.out.println(Arrays.toString(lastName));

        // Sorting the two, first and last names, arrays in alphabetically ascending order.
        for (int i = 0; i < firstName.length - 1; i++) {
            for (int j = i + 1; i < firstName.length; i++) {
                if (firstName[i].compareTo(firstName[j]) > 0) {
                    String temp = firstName[i];
                    firstName[i] = firstName[j];
                    firstName[j] = temp;
                }
            }
        }
        for (int i = 0; i < lastName.length - 1; i++) {
            for (int j = i + 1; i < lastName.length; i++) {
                if (lastName[i].compareTo(lastName[j]) > 0) {
                    String temp = lastName[i];
                    lastName[i] = lastName[j];
                    lastName[j] = temp;
                }

            }
        }
        System.out.println("\n");
        System.out.println("The player whose first name is alphabetically first: " + firstName[0]);
        System.out.println("The player whose last name is alphabetically first: " + lastName[0]);

    }
}
