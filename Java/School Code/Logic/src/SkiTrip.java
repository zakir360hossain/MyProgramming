import java.util.*;

/**
 */

/**
 * @author Zakir Hossain
 * September 24, 2019
 * 			This program ask the user for the number of students in a club
 * 		and ask how many of those students go to a ski trip
 */
public class SkiTrip {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        double lift_ticket_cost = 35, rent_skis = 40;
        int club_students, trip_students=0;
        double bus_price_per_person=22.50;
        double price_without_skis=0, price_with_skis=0;


        System.out.println("How many students are in the ski club");
        club_students = input.nextInt();

        // Input validation for club members
        if(club_students<0){
            System.out.println("Invalid number, there cannot be negative number in the club.");
        }

        // This will make to not ask any further questions because the club itself has less than 10 students, so
        //  trip is not possible because the trip required 10 people at least
        else if(club_students>=0 && club_students<10){
            System.out.println("Cannot begin the trip, at least 10 people are needed." +" There are only "+club_students);

        }

        else {
            System.out.println("How many of those students are going for the ski trip");
            trip_students = input.nextInt();

            if(trip_students<10){
                System.out.println("Not enough students. The trip is cancelled!");

            }

            else if(trip_students>club_students){
                System.out.println("The students for the trip cannot be greater, only club members can go.");
            }

            else {
                while(trip_students>=10){

                    if(trip_students>=10 && trip_students<=30){
                        price_without_skis = lift_ticket_cost+bus_price_per_person;
                        price_with_skis = lift_ticket_cost+bus_price_per_person+rent_skis;
                    }
                    else if(trip_students>30 && trip_students<=40){
                        lift_ticket_cost = lift_ticket_cost*0.58;
                        price_without_skis = lift_ticket_cost+bus_price_per_person;
                        price_with_skis = lift_ticket_cost+bus_price_per_person+rent_skis;
                    }
                    else if(trip_students>40){
                        lift_ticket_cost = lift_ticket_cost*0.58;
                        bus_price_per_person = bus_price_per_person*0.78;
                        price_without_skis = lift_ticket_cost+bus_price_per_person;
                        price_with_skis = lift_ticket_cost+bus_price_per_person+rent_skis;
                    }

                    lift_ticket_cost = Math.round(lift_ticket_cost*1000.000)/1000.000;
                    bus_price_per_person = Math.round(bus_price_per_person*1000.000)/1000.000;
                    price_without_skis = Math.round(price_without_skis*1000.000)/1000.000;
                    price_with_skis = Math.round(price_with_skis*1000.000)/1000.000;


                    System.out.println("How many students are in ski club?        " +club_students );
                    System.out.println("How many are coming to ski trip?          " + trip_students);
                    System.out.println("The lift ticket price per person:        $" +  lift_ticket_cost);
                    System.out.println("The skis price:                          $" +rent_skis );
                    System.out.println("The price of the bus:                    $" + bus_price_per_person);
                    System.out.println("Total price without the skis:            $" + price_without_skis);
                    System.out.println("Total price with the skis:               $" + price_with_skis);

                    break;
                }

            }
        }
    }
}
