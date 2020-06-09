import java.util.*;


/**
 * @author 20hossainz December 28. 2018
 * This program is for high school students to use
 * in their class to practice mathematical problems and the topics for that are: Quadratic equations
 * dot products of vectors and other components, system of equations
 * <p>
 * The program also has some benefits for the teachers, they can use this program to find average students'
 * grade, if the grades are grouped (i.e.  20 students have a grade between 80-89, 9 students have a between
 * 90-100,...  )
 * When the teachers enter the data (grades and student frequency) the program will approximate the mean,
 * or the standard deviation, from the data.
 */

public class Tutor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        Random r = new Random();

        // define variables
        int problem, answerCorrect = 0, a, b, c, counter = 1;
        double answer, percent;// Answer and Grade percentage
        String word;

        // Greeting to the Students
        System.out.println("Welcome!\n");
        System.out.println(
                "The availability for students: \nStudents will complete a certain number of math problems. The problems will be \n"
                        + "based on solving quadratic equations, system of equations, finding dot products of vector, etc.\n ");
        System.out.println(
                "Use for teachers:\n teachers will use this to find the standard deviations from a grouped data, such as the mean.\nThe data "
                        + "will be about student grades on that specific frequency.  \n The program does not contains a database, "
                        + "so the data  will be entered by the teachers." + "\n");
        System.out.println("Are you a teacher(T) or a student(S)?");
        System.out.println("Welcome!");
        word = input.nextLine();
        if (word.equalsIgnoreCase("s")) {
            while (1 == 1) {

                System.out.println("Here are the available choice that you can choose:");
                System.out.println("\n-Quadratic Equation(QE)\n-Dot Product(DP)\n-System of Equations(SE)" + "\n");
                System.out.println("Which one do you want to practice. Type the abbreviation or the words.");
                word = input.nextLine();

                // Addition-finding the sum of two numbers
                if (word.equalsIgnoreCase("Quadratic Equation") || word.equalsIgnoreCase("QE")) {

                    System.out.println("Enter the nunber of problems: ");
                    problem = input.nextInt();
                    System.out.println("You have selected " + problem + ", each problem worth 1 points. \n");
                    System.out.println(
                            "Answer each quesiton. Your answer should be in the form of as it asked,, otherwise, the answer will be count"
                                    + " as incorrect\n");

                    while (counter <= problem) {
                        double x1 = 0, x2 = 0, ansx1 = 0, ansx2 = 0;
                        a = r.nextInt(100 + 1 + 100) - 100;
                        b = r.nextInt(100 + 1 + 100) - 100;
                        c = r.nextInt(100 + 1 + 100) - 100;
                        double discriminant = ((Math.pow(b, 2) - 4 * a * c));
                        // real roots
                        if (discriminant >= 0) {
                            x1 = (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a);
                            x2 = (-b - Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a);
                            x1 = Math.round(x1 * 1000.0) / 1000.0;
                            x2 = Math.round(x2 * 1000.0) / 1000.0;
                        }
//						System.out.println(discriminant);
//						System.out.println(x1 + " " + x2);
                        System.out.println(
                                "Are the roots of the quadratic equation real (R) or imaginary(I), if real then find them(round to thousandth place, if imgaginary,"
                                        + "then type I");
                        if (b >= 0 && c >= 0) {
                            System.out.println(counter + ")   " + a + "X� + " + b + "X  + " + c + "= 0");
                        }
                        if (b < 0 && c >= 0) {
                            System.out.println(counter + ")   " + a + "X� " + b + "X  + " + c + "= 0");
                        }
                        if (b >= 0 && c < 0) {
                            System.out.println(counter + ")   " + a + "X� +" + b + "X " + c + "= 0");
                        }
                        if (b < 0 && c < 0) {
                            System.out.println(counter + ")   " + a + "X� " + b + "X " + c + "= 0");// Avoiding
                            // two
                            // operators
                            // (e.g
                            // a+-b
                            // or
                            // b-+a)
                        }
                        String temp = input.nextLine();
                        word = input.nextLine();

                        if (word.equalsIgnoreCase("R") && discriminant >= 0) {
                            System.out.println("X1:");
                            ansx1 = input.nextDouble();
                            System.out.println("X2:");
                            ansx2 = input.nextDouble();
                            if (ansx1 == x1 && ansx2 == x2) {
                                System.out.println("Correct.");
                                answerCorrect++;

                            }
                            if (ansx1 != x1 && ansx2 != x2) {
                                System.out
                                        .println("Incorrect, the answers are: " + "X1 = " + x1 + " X2 = " + x2 + "\n");

                                // clears the reader buffer
                                // String temp2 = input.nextLine();
                                // word = input.nextLine();
                            }

                            // else }

                        } else if (word.equalsIgnoreCase("r") && discriminant < 0) {
                            System.out.println(
                                    "No, the roots are not imginary, because the square root of a negative number is not possible");
                        }

                        if (word.equalsIgnoreCase("I") && discriminant < 0) {

                            System.out.println("Imaginary is correct.");
                            answerCorrect++;

                        } else if (word.equalsIgnoreCase("i") && discriminant >= 0) {
                            System.out.println("No, the roots are real");
                        }

                        counter = counter + 1;

                    }

                    // Grade percentage for practicing addition problems
                    percent = (double) (answerCorrect) / (double) (problem) * 100;
                    percent = Math.round(percent * 100.0) / 100.0;
                    if (94 <= percent && percent <= 100) {
                        System.out.println(answerCorrect + "/" + problem);
                        System.out.println("Excellent ! \n your Grades: " + percent + " %");
                    }
                    if (80 <= percent && percent <= 93) {
                        System.out.println(answerCorrect + "/" + problem);
                        System.out.println("Good! \n your Grades: " + percent + " %");
                    }
                    if (10 <= percent && percent <= 79) {
                        System.out.println(answerCorrect + "/" + problem);
                        System.out.println("Practice more! \n your Grades: " + percent + " %");
                    }
                    if (percent == 0) {
                        System.out.println(answerCorrect + "/" + problem);
                        System.out.println(
                                "You did not answer any question correctly! \n your Grades: " + percent + " %");
                    }

                    break;

                }
                if (word.equalsIgnoreCase("Dot Product") || word.equalsIgnoreCase("DP")) {
                    System.out.println("Enter the nunber of problems: ");
                    problem = input.nextInt();
                    System.out.println("You have selected " + problem);
                    System.out.println(
                            "Answer each quesiton, all answer should be rounded to hundredth place Each problems worth 3 pts. Your answer should be in the form of as it asked,, otherwise, the answer will be count "
                                    + "as incorrect");
                    double answerCorrect_pd = 0;
                    while (counter <= problem) {
                        int a1, a2, a3, b1, b2, b3;
                        a1 = r.nextInt(100 + 1 + 100) - 100;
                        a2 = r.nextInt(100 + 1 + 100) - 100;
                        a3 = r.nextInt(100 + 1 + 100) - 100;
                        b1 = r.nextInt(100 + 1 + 100) - 100;
                        b2 = r.nextInt(100 + 1 + 100) - 100;
                        b3 = r.nextInt(100 + 1 + 100) - 100;
                        double dp = (a1 * b1) + (a2 * b2) + (a3 * b3);// Multiplying
                        // the
                        // two
                        // vectors
                        double Magnitude_of_vector1 = Math.sqrt(Math.pow(a1, 2) + Math.pow(a2, 2) + Math.pow(a3, 2));
                        double Magnitude_of_vector2 = Math.sqrt(Math.pow(b1, 2) + Math.pow(b2, 2) + Math.pow(b3, 2));
                        double MagAns1, MagAns2;// Variables to enter the answer
                        // for the magnitudes
                        Magnitude_of_vector1 = Math.round(Magnitude_of_vector1 * 100.0) / 100.0;
                        Magnitude_of_vector2 = Math.round(Magnitude_of_vector2 * 100.0) / 100.0;

                        // The angle between the two vectors. It is arccos of
                        // the dot product divide by the product of the two
                        // magnitude
                        double angle = Math
                                .toDegrees(Math.acos((dp) / ((Magnitude_of_vector1) * (Magnitude_of_vector2))));

                        angle = Math.round(angle * 100.0) / 100.0;
                        // answerCorrect = 0;
                        System.out.println("Question " + counter);
                        System.out.println(
                                "Find the dot product and the angle betweeen these two vectors. Also find the magnitude of each vector.");
                        System.out.println("a = " + "<" + a1 + "," + a2 + "," + a3 + ">" + "             " + "b = "
                                + "<" + b1 + "," + b2 + "," + b3 + ">");
                        // System.out.print("Test:" + dp + "+" + angle + "+" +
                        // Magnitude_of_vector1 + "+"
                        // + Magnitude_of_vector2 + "\n");

//						System.out.println(dp);
//						System.out.println(angle);
//						System.out.println(Magnitude_of_vector1);
//						System.out.println(Magnitude_of_vector2);

                        System.out.println(dp);
                        System.out.println(angle);
                        System.out.println(Magnitude_of_vector1);
                        System.out.println(Magnitude_of_vector2);

                        System.out.println("What is the Dot Product of the two vectors:");
                        answer = input.nextDouble();
                        System.out.println("What is the angle between the two vectors : ");
                        double angle_answer = input.nextDouble();
                        System.out.println(
                                "What is the magnitude of the vector (A)" + "<" + a1 + "," + a2 + "," + a3 + ">");
                        MagAns1 = input.nextDouble();
                        System.out.println(
                                "What is the magnitude of the vector (B) " + "<" + b1 + "," + b2 + "," + b3 + ">");
                        MagAns2 = input.nextDouble();

                        if (answer == dp && angle_answer == angle && MagAns1 == Magnitude_of_vector1
                                && MagAns2 == Magnitude_of_vector2) {
                            System.out.println("All Correct!");
                            answerCorrect_pd += 3;
                        }
                        if (answer == dp && angle_answer == angle && MagAns1 == Magnitude_of_vector1
                                && MagAns2 != Magnitude_of_vector2) {
                            System.out.println(
                                    "Dot Product: Correct \n Angle: Correct \n Magnitude(A): Correct \n Magnitude (B): Incorrect");
                            answerCorrect_pd += 2.5;
                        }
                        if (answer == dp && angle_answer == angle && MagAns1 != Magnitude_of_vector1
                                && MagAns2 != Magnitude_of_vector2) {
                            System.out.println(
                                    "Dot Product: Correct \n Angle: Correct \n Magnitude(A): Incorrect \n Magnitude (B): Incorrect");
                            answerCorrect_pd += 2;
                        }
                        if (answer == dp && angle_answer != angle && MagAns1 != Magnitude_of_vector1
                                && MagAns2 != Magnitude_of_vector2) {
                            System.out.println(
                                    "Dot Product: Correct \n Angle: Incorrect \n Magnitude(A): Incorrect \n Magnitude (B): Incorrect");
                            answerCorrect_pd += .5;
                        } else if (answer != dp && angle_answer != angle && MagAns1 != Magnitude_of_vector1
                                && MagAns2 != Magnitude_of_vector2) {
                            System.out.println(
                                    "Dot Product: Incorrect \n Angle: Incorrect \n Magnitude(A): Incorrect \n Magnitude (B): Incorrect");
                        }

                        counter = counter + 1;

                    }

                    // Grade percentage for practicing addition problems
                    percent = (double) (answerCorrect_pd) / (double) (problem * 3) * (100);
                    percent = Math.round(percent * 100.0) / 100.0;
                    if (percent >= 94 && percent <= 100) {
                        System.out.println(answerCorrect_pd + "/" + problem * 3);
                        System.out.println("Excellent ! \n your Grades: " + percent + " %");
                    }
                    if (percent >= 80 && percent <= 93) {
                        System.out.println(answerCorrect_pd + "/" + problem * 3);
                        System.out.println("Good! \n your Grades: " + percent + " %");
                    }
                    if (percent >= 10 && percent <= 79) {
                        System.out.println(answerCorrect_pd + "/" + problem * 3);
                        System.out.println("Practice more! \n your Grades: " + percent + " %");
                    } else if (percent == 0) {
                        System.out.println(answerCorrect_pd + "/" + problem * 3);
                        System.out.println(
                                "You did not answer any question correctly! \n your Grades: " + percent + " %");
                    }
                    break;
                }

                // Creating system of equations by generating random
                // coefficients
                if (word.equalsIgnoreCase("System of Equations") || word.equalsIgnoreCase("se")) {
                    // The four coefficients for the two equations
                    int a1, a2, b1, b2;
                    int c2 = 0, c1 = 0;
                    double ansx = 0, ansy = 0;
                    // These capital x and y represent the answer to the
                    // variables
                    // of
                    // the system of equations
                    double X = 0, Y = 0;
                    System.out.println("Enter the nunber of problems: ");
                    problem = input.nextInt();
                    System.out.println("You have selected " + problem);
                    System.out.println(
                            "Answer each quesiton, Each problems worth 1 pts. Your answer should be in the form of as it asked,, otherwise, the answer will be count"
                                    + " as incorrect");
                    while (counter <= problem) {

                        a1 = r.nextInt(100 + 1 + 100) - 100;
                        a2 = r.nextInt(100 + 1 + 100) - 100;
                        b1 = r.nextInt(100 + 1 + 100) - 100;
                        b2 = r.nextInt(100 + 1 + 100) - 100;
                        c1 = r.nextInt(100 + 1 + 100) - 100;
                        c2 = r.nextInt(100 + 1 + 100) - 100;

                        double D = (a1 * b2) - (a2 * b1);
                        double Dx = (c1 * b2) - (b1 * c2);
                        double Dy = (a1 * c2) - (c1 * a2);

                        ansx = (Dx / D);
                        ansy = (Dy / D);

                        if ((a1 * b2) - (a2 * b1) != 0) {

                            // Cramer's Rule for system of equations

                            ansx = Math.round(ansx * 100.0) / 100.0;
                            ansy = Math.round(ansy * 100.0) / 100.0;

//							System.out.println(ansx + " " + ansy);

                            System.out.println(
                                    "Find the value of X and Y that satisfy the system of equations. Round to the nearest hundreth if necessary."
                                            + "\n");
                            if (a2 < 0 && b2 < 0) {
                                System.out.println(a1 + "X " + b1 + "Y = " + c1);
                                System.out.println(a2 + "X " + b2 + "Y = " + c2 + "\n");
                            } else if (a2 >= 0 && b2 < 0) {
                                System.out.println(a1 + "X " + "+" + b1 + "Y = " + c1);
                                System.out.println(a2 + "X " + b2 + "Y = " + c2 + "\n");
                            } else if (a2 < 0 && b2 >= 0) {
                                System.out.println(a1 + "X " + b1 + "Y = " + c1);
                                System.out.println(a2 + "X " + "+" + b2 + "Y = " + c2 + "\n");
                            } else if (a2 >= 0 && b2 >= 0) {
                                System.out.println(a1 + "X " + " + " + b1 + "Y = " + c1);
                                System.out.println(a2 + "X " + " + " + b2 + "Y = " + c2 + "\n");
                            }
                            System.out.println("X:" + "\n");
                            X = input.nextDouble();
                            System.out.println("Y:" + "\n");
                            Y = input.nextDouble();

                            if (X == ansx && Y == ansy) {
                                System.out.println("Correct");
                                answerCorrect++;
                            }
                            if (X != ansx && Y != ansy) {
                                System.out.println("Incorrect!");
                                System.out.println("The answers are: X= " + ansx + "\t" + "Y= " + ansy + "\n");

                            }
                        }
                        counter = counter + 1;
                    }
                    // Grade Percentage for practicing system of equations
                    percent = (double) (answerCorrect) / (double) (problem) * 100;
                    percent = Math.round(percent * 100.0) / 100.0;
                    if (94 <= percent && percent <= 100) {
                        System.out.println(answerCorrect + "/" + problem);
                        System.out.println("Excellent ! \n your Grades: " + percent + " %");
                    }
                    if (80 <= percent && percent <= 93) {
                        System.out.println(answerCorrect + "/" + problem);
                        System.out.println("Good! \n your Grades: " + percent + " %");
                    }
                    if (10 <= percent && percent <= 79) {
                        System.out.println(answerCorrect + "/" + problem);
                        System.out.println("Practice more! \n your Grades: " + percent + " %");
                    }
                    if (percent == 0) {
                        System.out.println(answerCorrect + "/" + problem);
                        System.out.println(
                                "You did not answer any question correctly! \n your Grades: " + percent + " %");
                    }
                    break;
                } else {
                    System.out.println("'" + word + "'" + " is an invalid option. Please try again!");

                }
            }
        }
        if (word.equalsIgnoreCase("t")) {

            System.out.println("Calculation for students grades if the grades are in a particular range (i.e 13 "
                    + "students got a grade between 80-90)\n\n Enter the subject of the test that the students took");
            word = input.nextLine();
            // System.out.println("Enter the date")
            System.out.println(
                    "\nSubject: " + word + "\nEnter the number of students whose grades lie in each grade interval."
                            + "If none then type zero");
            // Print all the results
            int[] SF = new int[6];// (Students Frequency), the
            // number of students that
            // got a grade in at a
            // certain range of grade
            // (e.g 20 students' grades
            // are between 80-89.)

            double[] sfm = new double[6];// Student frequency multiply by the
            // midpoint of the interval
            int[] LowerBound = {0, 50, 60, 70, 80, 90};// Lower Boundary for
            // students' data
            int[] UpperBound = {49, 59, 69, 79, 89, 100};// Upper boundary for
            // students' data
            double[] midpointList = new double[6];// The midpoint between the 2
            // boundaries, lower and
            // upper
            double totalSum = 0, totalSum2, studentSum = 0;
            double Students_Average_Grade = 0, sum2 = 0;
            ArrayList<Integer> Total_Number_Of_Students = new ArrayList<Integer>();
            ArrayList<Double> sum1 = new ArrayList<Double>();

            // Sum1 is the sum of all the products of student frequency times
            // the
            // midpoint. Sum2 is the the sum of all the students frequencies

            for (int i = 0; i < midpointList.length; i++) {

                System.out.println(
                        "How many students had a grade in the interval " + LowerBound[i] + "--" + UpperBound[i] + " ?");
                SF[i] = input.nextInt();
                Total_Number_Of_Students.add(SF[i]);
                studentSum += Total_Number_Of_Students.get(i);

                midpointList[i] = (UpperBound[i] + LowerBound[i]) / 2;
                // sum1.add(midpointList[i]);
                // totalSum=totalSum+sum1.get(i);

                sfm[i] = SF[i] * midpointList[i];
                sum1.add(sfm[i]);
                sum2 += sum1.get(i);
                Students_Average_Grade = sum2 / studentSum;

                Students_Average_Grade = Math.round(Students_Average_Grade * 100.0) / 100.0;
            }
            System.out.println("Data:");
            System.out.println("Grade Range  Student:");

            for (int i2 = 0; i2 < midpointList.length; i2++) {
                System.out.println(LowerBound[i2] + "-" + UpperBound[i2] + "\t\t" + SF[i2]);
            }
            System.out.println("---------------------\nTotal students: " + studentSum);
            System.out.println("Average students grades in this test: " + Students_Average_Grade + "%.");

        }
    }

}
