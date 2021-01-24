#include <bits/stdc++.h>

using namespace std;


/*
 * Complete the 'maximumOccurringCharacter' function below.
 *
 * The function is expected to return a CHARACTER.
 * The function accepts STRING text as parameter.
 */

 int main()
 {
     ofstream fout(getenv("OUTPUT_PATH"));

     string text = "Hello Barr"

     char result = maximumOccurringCharacter(text);

     fout << result << "\n";

     fout.close();

     return 0;
 }
char maximumOccurringCharacter(string text) {
//array that will contain the frequency of each character of text. Size=10^4
    int count[10000] = {0};
    int maxIndex = 0;
    char result; //To be returned

    for (int i = 0; i < text.length(); i++){
        count[text[i]]++;
        if (maxIndex < count[text[i]]){
        maxIndex = count[text[i]];
        result = text[i];
        }
    }
    return result;
}
