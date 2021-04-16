//
// Created by Zakir Hossain on 2/9/21.
//
#include <stdio.h>

int factorial(int n);

int main(){
    return 0;
    int a;
    a = factorial(9);
    printf("%d\n", a);
}


int factorial(int n){
    if (n==0 | n==1) return 1;
    return n*factorial(n-1);
}

