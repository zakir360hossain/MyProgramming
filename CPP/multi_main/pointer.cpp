#include <iostream>
#include <vector>
#include <cstdlib>
using namespace std;

// Changing variable directly through the memory address with pointer
void AssignAge(int* ageLoc){
        *ageLoc = 22;
}

int main() {
        // A pointer returns the memory address of an stored data.
        int age = 56;
        //location of age. The type of this data is int with *.
        int* ageLoc = &age; // '&' is the reference operator.
        cout << age<< endl;
        cout << ageLoc<< endl;

        // Getting the value with the address
        cout << *ageLoc << endl; // This is the dereference operator

        int arr[] = {3, 34, 65, 12, 78};
        int* arrLoc = arr; // For array, reference operator is not needed, simply * is enough.

        cout << *arrLoc << endl;
        arrLoc++; // pointer can also be incremented;
        cout << *arrLoc << endl;

        int age2 = 45;
        AssignAge(&age2);
        cout << age2 << endl; // 22, not 45

        return 0;
}
