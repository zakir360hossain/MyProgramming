package string;

import java.util.*;

/**
 * @author Zakir Hossain
 * October 15, 2019
 * This program does some manipulations with string by utilizing different functions and methods that Java
 * have for string
 */

public class StringManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a.
        String phrase1 = "Manipulation";
        System.out.println("The length of 'phrase1' is " + phrase1.length());

        // b.
        System.out.println("1st char in 'phrase1: " + phrase1.charAt(0));
        System.out.println("last char in 'phrase1: " + phrase1.charAt(phrase1.length() - 1));

        if (phrase1.length() % 2 == 0) {
            System.out.println("mid char in 'phrase1: " + phrase1.charAt((phrase1.length() - 1) - (phrase1.length() / 2)));

        } else {
            System.out.println("mid char in 'phrase1: " + phrase1.charAt(((phrase1.length() - 1) / 2)));
        }

        // c.
        System.out.println("Enter the integer: ");
        int charIndex = input.nextInt();

        while (charIndex>=phrase1.length()){
            System.out.println("The integer is higher or equal to the string's length. Try entering a number small: ");
            charIndex  = input.nextInt();
        }
        System.out.println("The char with your specified index in 'phrase1' : " +phrase1.charAt(charIndex));

        // d.
        String phrase2 = "Henderson is the best school ever";
        System.out.println("New phrase: " + phrase2.replace("best", "BEST"));

        // e.
        String phrase3 = "Computer Programming in Java gives us a JOLT";
        System.out.println("'Phrase3' in lower case: " + phrase3.toLowerCase());
        System.out.println("'Phrase3' in upper case: " + phrase3.toUpperCase());

        // f.
        String phrase4 = "Mathematics is the best class ever and my math teacher is the best teacher";
        String s1 = "math";
        String s2 = "Teacher";
        System.out.println("Spot where math occurs in 'phrase4': " + phrase4.indexOf(s1));
        System.out.println("Spot where Teacher occurs in 'phrase4': " + phrase4.indexOf(s2));

        // g.
        String subj1 = "Physics";
        String subj2 = "Chemistry";
        String subj3 = "Biology";
        String subj4 = "Calculus";
        String subj5 = "Statistics";
        String schoolName = "Henderson";

        System.out.println("Enter a word: ");
        String inputWord = input.next();

        if(inputWord.equalsIgnoreCase(subj1)){
            System.out.println("Mr. Nagy and Mr. DeLone are great physics teachers.");
        }

        else if(inputWord.equalsIgnoreCase(subj2)){
            System.out.println("Be careful of all the chemicals in the lab.");
        }
        else if(inputWord.equalsIgnoreCase(subj3)){
            System.out.println("Do I have to dissect a frog? Yuck");
        }
        else if(inputWord.equalsIgnoreCase(subj4)){
            System.out.println("Best math ever");
        }
        else if(inputWord.equalsIgnoreCase(subj5)){
            System.out.println("What the survey say for results? ");
        }
        else if(inputWord.equalsIgnoreCase(schoolName)){
            System.out.println("Go Warriors");
        }
        else {
            System.out.println("Not an option");
        }










    }
}
