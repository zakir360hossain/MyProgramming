package doublescriptedarray;

import java.util.*;

/**
 * @author Zakir Hossain
 * Jan 5, 2020
 *          In this program, user will enter grades for 3 courses for each student. The arrays of of the students
 *          and their corresponding grades are being gathered through double-scripted array. Certain
 *          manipulation and computerization are being done with the data, including, populating a parralel array of
 *          GPA for each student based on their average grade from the 3 courses. At the end, all the data are being
 *          printed in the format of a table.
 */
public class Grade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] studentGrade = new double[5][3];
        // Five students' names and the three defined courses:
        String[] studentName = {"Ethan Chedda", "Christ Mandel", "Roger Sherman", "Ben Franklin", "Alexandro Hamel"};
        String[] courses = {"Calculus AP/BC", "AP Statistic", "AP Physics"};
        Double[] GPA = new Double[5];

        System.out.println("Please enter grade for each of the students for the following courses\n");
        for (int student = 0; student < studentName.length; student++) {
            for (int col = 0; col < courses.length; col++) {
                System.out.println("Please enter " + studentName[student] + "'s grade for " + courses[col]);
                studentGrade[student][col] = input.nextDouble();

//                 Input validation for grade. Valid range: 45<=grade<=100
                while (studentGrade[student][col] < 45 || studentGrade[student][col] > 100) {
                    System.out.println("Student's grade cannot be below 45 or above 100. \n Please re-enter " +
                            studentName[student] + "'s grade for " + courses[col]);
                    studentGrade[student][col] = input.nextDouble();
                }
            }
        }


        // Populating GPA for the five students
        // Printing output
        System.out.println("\n\n");
        System.out.println("Student\t\t\t\t Calculus BC Grade\t    AP Stat Grade\t   AP Physics Grade\t    GPA");
        for (int name = 0; name < studentName.length; ) {
            System.out.print(studentName[name]);
            double totalGPA = 0;
            for (int grade = 0; grade < studentGrade[0].length; grade++) {
                if (studentGrade[name][grade] >= 90 && studentGrade[name][grade] <= 100) {
                    totalGPA+=4.0;
                } else if (studentGrade[name][grade] >= 80 && studentGrade[name][grade] <= 89) {
                    totalGPA+=3.0;
                } else if (studentGrade[name][grade] >= 70 && studentGrade[name][grade] <= 79) {
                    totalGPA+=2.0;
                } else {
                    totalGPA+= 0.0;
                }
                System.out.print("\t\t\t\t" + studentGrade[name][grade]);
            }
            GPA[name] = Math.round(totalGPA/3*100.00)/100.00;
            System.out.print("\t\t\t" + GPA[name]);
            name++;
            System.out.println("\n");
        }


    }

}
