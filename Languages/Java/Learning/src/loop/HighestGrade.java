package loop;

import java.util.*;

/**
 * @author Zakir Hossain
 *  November 9, 2019
 * 	Finding the hihgest, lowest, total, average, and the number of grades from a user-entered grade list
 *
 */

public class HighestGrade {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     // Variables
     int grades = 0, total = 0;
     double average;
     int highest_grade = Integer.MIN_VALUE;
     int lowest_grade = Integer.MAX_VALUE;

     // While loop
     int count = 1;
     while (grades !=-1){

         System.out.println("Enter your grade #"+count +" (-1 to quit): ");
         grades = input.nextInt();

         if (grades>=45 && grades<=100){
             total = total+grades;
             count+=1;
             if (grades > highest_grade){
                 highest_grade = grades;
             }
             if (grades<lowest_grade && grades!=-1){
                 lowest_grade = grades;
             }
         }
         // Input validation
         else if ((grades<45 || grades>100) && grades !=-1 ) {
             System.out.println("The grade you entered is invalid, it cannot be less than 45 or greater than 100, " +
                     "so it's disregarded. Continue entering the next grade.\n");
         }


     }
     count = count -1;
        average = total / count;
        System.out.println("Number of grades entered: " + count);
        System.out.println("Average grade: " +average);

     System.out.println("The highest grade entered is: "+ highest_grade);
     System.out.println("The Lowest grade entered is: "+ lowest_grade);




    }
}
