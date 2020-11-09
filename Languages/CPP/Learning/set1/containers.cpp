#include <iostream>
#include <cstdlib>
#include <string>

#include <vector>
#include <deque>
#include <list>
#include <forward_list>
#include <map>
#include <set>
//there are more : multimap, multiset, unordered_set, etc.

using namespace std;

// Unlike array, vectors' size is dynamic, just like arrayList.

int main() {

        vector<int> number(2); // size of 2

        number[0]= 12;
        number[1] = 14; // max space at this point
        number.push_back(30); // Too add 30 to the end.

        for (int i = 0; i < number.size(); i++)
        {
                cout <<" "<<number[i];
        };

        deque<int> d1 = {2, 3, 5};
        cout << d1.size() << endl;
        list<double> l1 = {2.3, 5.6, 6};
        cout << l1.size()<< endl;
        forward_list<char> fl1 = {"A", "B"};
        set<int> s2 = {1, 2, 4};
        map<int, string> m1 = {
                {1,"One"}, {2,"Two"}, {3, "Threes"}
                }

        return 0;
}
