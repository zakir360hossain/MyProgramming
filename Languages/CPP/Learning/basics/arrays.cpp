#include <iostream>
using namespace std;

int main(){

     int arr[10];
     int arr2[10][12]; //2x2
     int arr3[2][2][2]; // 3x3

     float arr4[2] = {3, 5};
     int arr5[2][2] = {{4, 5}, {5, 6}};
     double arr6[2][2][2] = {{{4, 2},{5, 6}}, {{34,56}, {678, 56}}};

     cout << arr4[0] << endl;
     cout << arr5[0][0] << endl;
     cout << arr6[0][0][0] << endl;
    return 0;

}
