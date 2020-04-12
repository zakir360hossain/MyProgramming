#include <iostream>
#include <vector>
#include <cstdlib>
using namespace std;

int main() {

    vector<int> col {1, 2, 3, 4, 5, 6, 7, 7};
    
    // Counts the even integers
    int c = count_if(col.begin(), col.end(), [](int x ){return !(x%2);});
    cout << c << endl;

    return 0;
}