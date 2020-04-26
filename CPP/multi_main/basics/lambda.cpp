#include <iostream>
#include <vector>
#include <cstdlib>
using namespace std;

int main() {

        vector<int> v1 {1, 2, 3, 4, 5, 6, 7, 7};

        // [] shows that I am doing lambda
        // Counts the even integers
        int c = count_if(v1.begin(), v1.end(), [](int x ){
                return !(x%2);
        });
        cout << c << endl;

        // Copies the odd numbers
        // Will store x to evenVec any time when the return condition is true
        vector<int> evenVec;
        copy_if(v1.begin(), v1.end(), back_inserter(evenVec), [](int x){
                return (x%2);
        });

        for(auto val: evenVec) {
                cout << val <<" ";
        }

        int sum = 0;
        // & is for reference
        for_each(v1.begin(), v1.end(), [&](int x){
                sum+=x;
        });
        std::cout <<"\n"<<sum << '\n';

        // Copy from vector that is divisible by divisor;
        int divisor = 3;
        vector<int> v2 {3, 4, 5, 9, 12, 78, 90, 27, 65, 346, 569, 657};
        vector<int> vecBy3;
        copy_if(v2.begin(), v2.end(), back_inserter(vecBy3), [divisor](int x){
                return (x%divisor) == 0;
        });

        for(auto val: vecBy3) {
                cout << val <<" ";
        }
        cout<<'\n';

        vector<int> doubled;
        for_each(v2.begin(), v2.end(), [&](int x){
                doubled.push_back(x*2);
        });

        for(auto val: doubled) {
                cout << val <<" ";
        }

        return 0;
}
