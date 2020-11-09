#include <iostream>
using namespace std;

int main()
{
        int num1, num2;
        cout<< "Enter the value of num1: \n"; // '<<' is called insertion operator
        cin>>num1; // '>>' is called extraction operator
        cout<<"Enter the value of num2: \n";
        cin>>num2;

        cout << "The sum is " <<num1+num2<< endl;

        return 0;
}
