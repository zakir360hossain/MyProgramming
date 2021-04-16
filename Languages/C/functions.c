//
// Created by Zakir Hossain on 8/17/20.
//
#include <stdio.h>


int max(int a, int b, int c);

int main(){
    printf("\nHi");

    return 0;
}
int max(int a, int b, int c){
    if (a>b && b>c){
        return a;
    }
    else if(b>a && a>c){
        return b;
    } else{
        return c;
    }
}


