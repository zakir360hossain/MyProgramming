package loop;

import java.util.*;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double speed, time, distance;

        do {
            System.out.println("How fast is your vehicle traveling in MPH?");
            speed = input.nextDouble();
        } while (speed < 0);
        do {
            System.out.println("How many hours has it traveled:");
            time = input.nextDouble();

        } while (time < 0);

        System.out.println("Hours:\t\tDistance Traveled (miles)");

        for (int counter = 1; counter <= time; counter++) {
            System.out.println(counter + "\t\t\t" + counter*speed);
        }

    }
}
