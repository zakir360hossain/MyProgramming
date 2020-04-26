#include <iostream> //header file, this header file helps for input and output, and more. Like Scanner
using namespace std;

int main() {
        std::cout << "Hello world!" << std::endl; // endl goes to the next line
        std::cout << "Hello"; // valid
        // just 'cout' will also work because "using namespace std" is included. cout is a standard function from iostream
        cout << "Hello without std" << endl;

        // cout or c output

        int sum = 8;
        cout << sum << endl;

        return 0; // Successful termination of the program by sending 0 to the machine
}
