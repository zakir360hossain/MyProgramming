#include <stdio.h>
#include<stdlib.h>

//Local files inclusions
#include "functions.h"
#include "types_and_format_specifiers.h";

int main() {
    printf("Hello, World!\n");

    // data types and format specifiers
    types_and_specifiers();

    //Reading inputs
    int age;
    double gpa;
    printf("\nEnter your age: ");
    scanf("%d, ", &age);
    printf("Enter your GPA: ");
    scanf("%lf ", &gpa);
    printf("\nYour age is %d and your GPA is %f ", age, gpa);

    printf("\n%d", max(3, 4, 5));
    return 0;       
}
