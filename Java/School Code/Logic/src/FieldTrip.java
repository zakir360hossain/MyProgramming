import java.util.*;

/**
 * One school bus => 60 students + chaperones.
 * One van => 12 students
 */

/**
 * @author Zakir Hossain
 * September 22, 2019
 * 			This program take an input of students going for a field trip. The program determines the number of
 * 		buses and vans will be required for the trip and it calculates the cost for the trip.
 *
 * 	cost per bus = $453
 * 	cost per van = $82
 */

public class FieldTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int bus_max_capacity=60, van_max_capacity = 12;
        int bus_cost, van_cost, total_cost, van_remainder, students_count;
        int bus_count, van_count, bus_remainder; // "bus_remainder=> the number of people will be left after the bus charters.

        System.out.println("How many students are going to the trip?");
        students_count = input.nextInt();

        if(students_count>0 && students_count<=40){
            System.out.println("Not enough capacity to charter bus.");

            van_count = students_count/van_max_capacity;
            van_remainder = students_count % van_max_capacity;


            if(van_remainder>=0 && van_remainder<=5){
                van_count=van_count;
            }
            // If the remainder happens to be greater than 5, than an additional van will be needed.
            else if(van_remainder>5) {
                van_count+=1;
            }
            total_cost = van_count*82;
            System.out.println("Number of vans required: " + van_count);
            System.out.println("Total cost for the field trip: $"+  total_cost);
        }

        else if(students_count>=40 && students_count<=60){
            System.out.println("No vans will be needed, the number fall under maximum capacity to charter bus.");
            bus_count = 1;
            total_cost = 453;
            System.out.println("Number of bus required: " + bus_count);
            System.out.println("Total cost for the field trip: $"+  total_cost);
        }
        else if(students_count>60){

                bus_remainder = students_count % 60;
                students_count = students_count - bus_remainder;
                bus_count = students_count / 60;

                // Fill an additional bus if the remainder students are more than or equal to 40
                // because the bus will reserved if it can fill up 2/3 of its capacity.
                if(bus_remainder>=40){
                    bus_remainder= bus_remainder-40;
                    bus_count=bus_count+1;
                }

            van_count = bus_remainder / 12;
            van_remainder = bus_remainder%12;

            if(van_remainder>=0 && van_remainder<=5){
                van_count=van_count;
            }

            // If the remainder happens to be greater than 5, than an additional van will be needed.
            else if(van_remainder>5) {
                van_count+=1;
            }
            total_cost =bus_count*453 + van_count*82 ;

            System.out.println("Number of buses required: "+ bus_count);
            System.out.println("Students remained for the van: "+ bus_remainder);
            System.out.println("Number of vans required: "+ van_count);
            System.out.println("Total trip cost: $"+ total_cost);
        }
        else if(students_count==0){
            System.out.println("You cannot have a 0 for the number of students");
        }
        else {
            System.out.println("Negative number is invalid in this case");
        }





        

    }
}
