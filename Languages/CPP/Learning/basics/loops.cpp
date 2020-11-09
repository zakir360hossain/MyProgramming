#include <iostream>
#include <cstdlib>
#include <vector>

using namespace std;

int main()
{

        int num[5] = {45, 56, 67, 78};
        int len = sizeof(num) / sizeof(num[0]);

        cout << " Usual for_loop " << endl;
        for (int i = 0; i < len; i++)
        {
                cout << num[i] << endl;
        }

        cout << " Abbreviated For loop " << endl;
        for(auto n:num) cout << " " <<n;


        int num2[20];

        cout << " With random number " << endl;
        for (int i = 0; i < sizeof(num2)/sizeof(num2[0]); i++)
        {
                int randNum = rand() % 6; // Number between 1 and 6, 6 exclusive
                num2[i] = randNum;
                cout << num2[i] << endl;
        }

        int matrix[10][10];
        for (int row = 0; row < 10; row++)
        {
                for (int col = 0; col < 10; col++)
                {
                        matrix[row][col] = rand() %12; // 12 is exclusive
                        cout << " " << matrix[row][col];
                }
                cout<<endl;
        }

        cout << " While loop" << endl;
        int driveMile = 0;
        while (driveMile < 24)
        {
                driveMile++;
        }
        cout << driveMile << endl;


        // With vectors
        vector<int> vector1{1, 2, 3, 4, 5};
        for (int i = 0; i < vector1.size(); i++) {
                cout << vector1[i] << endl;
        }

        return 0;
}
