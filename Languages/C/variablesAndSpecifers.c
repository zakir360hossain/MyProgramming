//
// Created by Zakir Hossain on 8/18/20.
//


#include <stdio.h>

int main(){
    //Data types
    int a = 58;
    const int A = 67;
    double d = 34.5;
    float f = 34.5f;
    char c = 'A';
    char s[] = "I love you";
    char *s2 = "dsjhf sdhjf sdhg f";

    printf("This is a integer: %d", a);
    printf("\nThis is a constant%d", A);
    printf("\nThis is a double%g", d);
    printf("\nThis is a float%f", f);
    printf("\nThis is a char%c", c) ;
    printf("\nThis is a string%s", s);
    
    return 0;
}

