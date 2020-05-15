
//In C++, struct and class are very much same.
// In struct, members are by default public. In class, they are by default private.
// In other languages, they may be different, i.e. in C# structs are value type
// and classes are reference type.
// struct are often used to store Plain-Old Data (POD), often not methods.

#include <iostream>
using namespace std;


struct User
{
        string first_name;
        string last_name;
        // Method is not really the usual usage of struct.
        string getStatus(){
                return status;
        }

private:
        string status = "Gold";

};

int main() {

        User user1;
        user1.first_name = "William";
        user1.last_name = "McMullen";

        // Members are accessible, unless declared private or protected.
        cout << user1.first_name<< endl;
        cout << user1.getStatus() << endl;

        return 0;

}
