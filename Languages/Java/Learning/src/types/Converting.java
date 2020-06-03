package types;

public class Converting {
    public static void main(String[] args) {

        //String to Integer conversion
        String numString = "1000";
        int num = Integer.parseInt(numString);
        int num2 = Integer.valueOf(numString); // Both are same
        System.out.println(num+"\n"+ num2);
    }
}
