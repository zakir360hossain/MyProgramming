import java.util.ArrayList;
import java.util.Scanner;

public class Hiking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> hikingDistance = new ArrayList<Integer>();
        int dailyHikedDistance = 0;

        while(hikingDistance.size()<10){
            System.out.println("Enter the number of miles you have hiked:");
            dailyHikedDistance = scanner.nextInt();
            if (dailyHikedDistance<0){
                break;
            }
            hikingDistance.add(dailyHikedDistance);
        }

        System.out.println("Day      hiked (miles)");
        for(int i = 0; i<hikingDistance.size(); i++){
            System.out.println((i+1)+"         " + hikingDistance.get(i));
        }

        System.out.println("Total distance hiked (miles): "+sum(hikingDistance));
        System.out.println("Average distance hiked (miles): "+average(hikingDistance));
        System.out.println("At this rate, it would take "+daysNeeded(hikingDistance)+ " days to hike the entire 2190 " +
                "mile Appalachian Trail");

    }
    //Computes the average distance a hiker have hiked, given few number of daily hiking distances
    public static double average(ArrayList<Integer> hikingDistance){
        double sum =0;
        for (Integer elem : hikingDistance) {
            sum += elem;
        }
        return sum/hikingDistance.size();
    }

    //Tallies all the daily hiked distances
    public static int sum(ArrayList<Integer> hikingDistance){
        int sum = 0;
        for(Integer elem:hikingDistance){
            sum+=elem;
        }
        return sum;
    }

    //Returns the number of days that it would require the hiker to complete the hiking trail, given the average hiking
    //distance
    public static double daysNeeded(ArrayList<Integer> hikingDistance){
        return Math.round((2190/average(hikingDistance)*100)/100);
    }

}
