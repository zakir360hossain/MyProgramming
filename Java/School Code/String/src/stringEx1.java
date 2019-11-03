import java.util.*;

public class stringEx1 {

    public static void main(String[] args) {
        String word1 = "Tiger";
        String word2 = "tiger";
        String word3 = "HENDERSON";
        String word4 = word3;
        String word5 = "Henderson";
        String word6 = "tiger";

        // The use of the equals method with string
        // equals returns a boolean

        boolean TF = word1.equals(word2);  //  => False

        // How == works with string
        // == Always does not give the correct result;
        boolean equalTF = (word1 == word2); // => False

        // Use substring method with Strings

        String sub = word3.substring(5);
        System.out.println(sub);

        sub = word3.substring(5, 8);
        sub = word3.substring(5, word3.length());

        // IndexOf
        int index = word6.indexOf('g');
        System.out.println(index);

        index = word6.indexOf("ger");

        String word7 = "Henderson High School";
        index = word7.indexOf("o");
        System.out.println(index);

        String subWord7 = word7.substring(index);
        System.out.println(subWord7);

        // Use compareTo = Tells which word is alphabetically lower or higher than the other word
        // compareTo always returns an integer.
        // Word.compareTo(other word) returns 0 if both are the same.
        // Return - number if word comes before other and vice versa.

        String s1 = "Henderson";
        String s2 = "henderson";
        String s3 = "Owl";
        String s4 = "owl";
        int diff = s1.compareTo(s2);
        System.out.println("Diff " + diff);
        diff = s2.compareTo(s1);
        System.out.println("Diff " + diff);

        String inputS;
        int inputInt;
        Scanner input = new Scanner(System.in);
        System.out.println("Word");
        inputS = input.nextLine();
        System.out.println("Number");

        // To clear the enter keystroke from the buffer create a temporary variable
        inputInt = input.nextInt();
        System.out.println(inputS + " " + inputInt);



    }
}
