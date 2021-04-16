//
// Created by Zakir Hossain on 2/9/21.
//

//Pointer is a special variable that is capable of storing some address
//It points to a memory location where the first byte us stored (base address)
#include <stdio.h>

int main(){
    int age = 90;
    int *ageAd = &age; // *ageAd points to an int value
    printf("%d", *ageAd);

    int *ptr1;
    *ptr1 = 1; // This is dangerous, ptr1 is not initialized to any address (Segmentation Fault)

    return 0;
}
//Find max and min
void minMax(int a[], int len, int *min, int *max){
    *min = *max = a[0];
    for (int i = 0; i < len; i++){
        if (a[i] > *max) *max  = a[i];
        if (a[i] < *min) *min = a[i];
    }
}
