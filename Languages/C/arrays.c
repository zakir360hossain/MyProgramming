//
// Created by Zakir Hossain on 2/9/21.
//

#include <string.h>
#include <stdio.h>
#include <stdlib.h>

// a C constant definition: COLS is defined to be the value 100
#define COLS  (20)
#define ROWS  (20)

void init_matrix(int m[][COLS]);
void init_matrix_with_pointer(int *matrix);

int main(){

    //Single Dimensional array: statistically allocated

    // declare arrays specifying their type and total capacity
    float averages[30];   // array of float, 30 elements
    char  name[20];       // array of char, 20 elements
    int i;

    // access array elements
    for (i = 0; i < 10; i++)
    {
        averages[i] = 0.0 + i;
        name[i] = 'a' + i;
    }
    name[10] = '\0';    // name is being used for storing a C-style string

    // prints: 3 d abcdefghij
    printf("%g %c %s\n", averages[3], name[3], name);

    strcpy(name, "Hello");
    printf("%s\n", name);  // prints: Hello


    //Single Dimensional array: dynamically allocated

    // declare a pointer variable to point to allocated heap space
    int    *p_array;
    double *d_array;

    // call malloc to allocate that appropriate number of bytes for the array

    p_array = malloc(sizeof(int) * 50);      // allocate 50 ints
    d_array = malloc(sizeof(double) * 100);  // allocate 100 doubles

    // always CHECK RETURN VALUE of functions and HANDLE ERROR return values
    if ( (p_array == NULL) || (d_array == NULL) )
    {
        printf("ERROR: malloc failed!\n");
        exit(1);
    }

    // use [] notation to access array elements
    for (i = 0; i < 50; i++)
    {
        p_array[i] = 2 * i;
        d_array[i] = 0.45 * i;
    }

    // free heap space when done using it
    free(p_array);
    p_array = NULL;

    free(d_array);
    d_array = NULL;

    //Array Memory Layout
    // array [0]:  base address
    // array [1]:  next address
    // array [2]:  next address
    //   ...            ...
    // array [99]: last address


    //Two Dimensional Arrays: statistically allocated
	int matrix[ROWS][COLS];
    int val1, val2;
    int *ptr1;
    
    init_matrix(matrix);
    ptr1 = &matrix;
    val1 = matrix[3][7];  // get int value in row 3, column 7 of matrix
    val2 = *ptr1;
    printf("%d %d\n", val1, val2);
    free(ptr1);
    ptr1 = NULL;


    //Two Dimensional Arrays: dynamically allocated
    int *matrix3;
    int *ptr2; //Address of element at row 2 and col 3
    matrix3 = malloc(sizeof(int) * (COLS*ROWS));
    init_matrix_with_pointer(matrix3);
    ptr2 = &matrix3[2*COLS+3];
    val1 = matrix[1*COLS+4]; // The element at row 1 and col 4
    val2 = *ptr2;
    printf("%d %d\n", val1, val2);
    return 0;
}


/*
 * init_matrix: initializes the passed matrix elements to th product of their index values
 * COLS is needed for the compiler to set the offset
 * matrix: a 2D array (the column dimension must be 100)
 * rows: the number of rows in the matrix
 * return: does not return a value
 * 
 * 
 */
void init_matrix(int m[][COLS]) {
    int i, j;
    for (i = 0; i < ROWS; i++) {
        for (j = 0; j < COLS; j++) {
            m[i][j] = i*j;
        }
    }
}
/* 
 * This method initialize a 2D matrix to the given memory address
 * m: the base addres which contains the contiguos chunk of memory to store the matrix
 * rows: numbers of rows
 * cols: number of cols:
 * 
 * formula for each element: [i*COLS+j]
 */
void init_matrix_with_pointer(int *matrix){

    for (int i = 0; i < ROWS; i++)
    {
        for (int j = 0; j < COLS; j++)
        {
            matrix[i*COLS+j] = 1;
        }  
    }
    
}
