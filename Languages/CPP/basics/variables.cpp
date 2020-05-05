#include <iostream>
using namespace std;


int num = 90;
int main() {
        cout << "Variables" << endl;
        const double PI = 3.1415926535;

        char myGrade = 'A'; // take up one bit. If more than one char, it takes the last one.
        bool isHappy = true;
        int myAge = 39;

        float favNum = 0.1415926535;
        cout << favNum << endl;

        // To find bit size of var
        cout << "The size of float " << sizeof(favNum) << endl;
        cout << "The size of double " << sizeof(PI) << endl;
        cout << "The size of char " << sizeof(myGrade) << endl;
        /*
           Other types of variable
           short int  : at least 16 bits
           long int : at least 32 bits
           long long int : at least 64 bits;
           unsigned int : Same size as signed version
           long double : not less then double
         */

        int num = 1;
        // Accessing global variable
        cout << "Accessing global number instead of local number " << :: num << endl;

        return 0;
}
