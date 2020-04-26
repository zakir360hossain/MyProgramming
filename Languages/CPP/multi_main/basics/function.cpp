#include <iostream>
#include <vector>
#include <cstdlib>
using namespace std;

// function example
int indexOf(int arr[], int len, int target)
{
        for (int i = 0; i < len; i++)
        {
                if (arr[i] == target)
                {
                        return i;
                }
        }
        return -1;
};


int main()
{
        // indexOf function
        int arr[5] = {45, 2, 45, 56, 67};
        int index = indexOf(arr, 5, 67);
        cout <<index<< endl;


        return 0;
}
