#include <iostream>
#include <string>
#include <vector>
using namespace std;
#include "Animal.h"

int main() {
    // Instantiating Animal instances.
    Animal cat ("Tiger", 56, 5687);
    Animal cat2 ("Puma", 67, 456);
    cat.toString();
    cout <<"\n";
    cat2.toString();
    return 0;
}
