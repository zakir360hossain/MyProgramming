public class MaxOccurence {
    public static void main(String[] args) {

    }

    char maximumOccurringCharacter(String text) {
        //array that will contain the frequency of each character of text. Size=10^4
        int frequencies[] = new int[10000];
        int maxIndex = 0;
        char result = '0'; //To be returned

        for (int i = 0; i < text.length(); i++) {
            frequencies[text.charAt(i)]++;
            if (maxIndex < frequencies[text.charAt(i)]) {
                maxIndex = frequencies[text.charAt(i)];
                result = text.charAt(i);
            }
        }
        return result;
    }
}
