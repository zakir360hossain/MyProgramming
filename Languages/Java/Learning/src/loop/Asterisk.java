package loop;

import java.util.*;

/**
 * Requirement
 */

/**
 * @author Zakir Hossain
 * November 18, 2019
 *   This program draws certain types of figure using asterisks and nested loops with concept of pattern design.
 */
public class Asterisk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables
        String figType = "";
        int number, height, width;

        System.out.println("What is the figure type you are trying to draw?");
        figType = input.nextLine();


        // Note:
        // only fig S and B iterates to draw multiple figures
        // The rest of the figures only draw one.
        if (figType.equalsIgnoreCase("S") || figType.equalsIgnoreCase("H") ||
                figType.equalsIgnoreCase("L") || figType.equalsIgnoreCase("T")) {

            System.out.println("Enter the height please");
            height = input.nextInt();
            System.out.println("Enter the number of figures to be repeated");
            number = input.nextInt();

            // Done
            if (figType.equalsIgnoreCase("S")) {

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height*number-(number-1); j++) {
                            System.out.print(" *");
                        }
                        System.out.println(" ");
                    }
            }


            if (figType.equalsIgnoreCase("H")){
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= height*number-(number-1); j++) {
                        if(i>j){
                            System.out.print("  ");
                        }
                        else{
                            System.out.print(" *");
                        }
                        

                    }
                    System.out.println(" ");
                }

            }


            if (figType.equalsIgnoreCase("L")){
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= height*number-(number-1); j++) {
                        if (j>i){
                            System.out.print("  ");

                        }
                        else {
                            System.out.print(" *");
                        }
                    }
                    System.out.println(" ");
                }
            }
            if (figType.equalsIgnoreCase("T")){
                for (int i = 1;  i<=3*height - 2; i++ ){
                    if (i<height){
                        for (int j=1; j<=7; j++){
                            if (j<=2){
                                System.out.print("  ");
                            }
                            else if (j>2 && j<=5){
                                System.out.print(" *");
                            }
                        }
                    }
                    if (i==height){
                        for (int j=1; j<=7; j++){
                            System.out.print(" *");
                        }
                    }
                    if(i>height && i<2*height-1){
                        for (int j=1; j<=7; j++){
                            if (j<=2){
                                System.out.print("  ");
                            }
                            else if (j>2 && j<=5){
                                System.out.print(" *");
                            }
                        }
                    }
                   if (i==2*height-1){
                        for (int j=1; j<=7; j++){
                            System.out.print(" *");
                        }
                    }
                   if (i>2*height-1){
                        for (int j=1; j<=7; j++){
                            if (j<=2){
                                System.out.print("  ");
                            }
                            else if (j>2 && j<=5){
                                System.out.print(" *");
                            }
                        }

                    }



                    System.out.println(" ");
                }
            }


        }
        // Done
        else if (figType.equalsIgnoreCase("B")) {
            System.out.println("Enter the length please");
            int length = input.nextInt();
            System.out.println("Enter the width");
            width = input.nextInt();
            System.out.println("Enter the number");
            number = input.nextInt();
            for (int i=1; i<=width; i++){
                for (int j = 1; j<=length*number-(number-1); j++){
                    System.out.print(" *");
                }
                System.out.println(" ");
            }
        }
    }
}
