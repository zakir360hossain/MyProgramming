/*
 * Swarthmore College, CS 31
 * Copyright (c) 2021 Swarthmore College Computer Science Department,
 * Swarthmore PA, Professor Tia Newhall and Andrew Danner
 */

/*
 * This program consists of two tasks, each working with multiple functions.
 * One task is to generate a set of random number between 0 and a specified maximum and compute the average of these
 * numbers.
 *
 * The other task is to draw a pyramid-shaped picture consisting of asterisks (*) and the size of this drawing (namely
 * the number of rows in the console) is specified by the user.
 */

/* C libraries are included here */
#include <stdio.h>      // the C standard I/O library
#include <stdlib.h>     // the C standard library
#include <time.h>       // time library, used to seed random num generator

/* define constant values here */
#define MAX  30        // the max size of the picture

/* function prototypes go here */
int   read_int(char *msg);  /* these are defined for you */
float compute_average(int num, int high);
int get_in_range(int lo, int hi);
void draw_picture(int size);


/***********************************************************/
int main (int argc, char *argv[]) {

    /* declare all local variables at the top of the function body */
    int num;
    int high;

    /* seed random number generator using the current time */
    srand(time(0));


    printf("This program computes the average of a set of pseudo-randomly generated numbers within the "
           "range of 0 and some specified peak number my user. This program also draws a mountain "
           "like picture with * based On some specified size\n");

    num = read_int("Enter the # of random number to be generated");
    high = read_int("Now, please enter the largest random number to be generated");

    float average = compute_average(num, high);
    printf("The average of %d random values in the range [0,%d] is %f\n", num, high, average);

    int size = get_in_range(3, MAX);
    draw_picture(size);
    int decider;
    do{
        decider = read_int("\nWould you like to draw more picture? Enter 0 for no and 1 for yes");
        if(decider==0){
            printf("Hope you had fun drawing some 'Asterian' mountains! Good bye!");
            break;
        }
        else if(decider==1){
            size = get_in_range(3, MAX);
            draw_picture(size);
        }
        else{
            printf("Try again: %d is not 0 or 1", decider);
        }
    }while(1);




    /* main returns an int value, 0 means it completed successfully */
    return 0;
}

/******************************************
 * compute_average: generate a set of random number between 0 and a specified maximum and compute the average of these
 * numbers.
 *  num: the number of values to average over
 *  hi: the highest number that can occur in the set of the randomly generated numbers
 *  return: the average of the set of random numbers
 */
float compute_average(int num, int hi){
    float total;

    for (int i = 0; i<num; i++){
        int val = rand()%(hi+1);
        total+=val;
    }
    return total/num;
}
/******************************************
 * get_in_range: obtains size value for thr picture that is validated to be between lo and hi
 *  lo: the lowest size the user can enter, inclusive. Indicated to be 3
 *  hi: the highest size the user can enter, inclusive. Defined to be 30 (see line 22)
 *  return: the size of picture as int after validation.
 */
int get_in_range(int lo, int hi){
    int size;
    do{
        printf("\n\nTo draw the picture, please enter a size between %d and %d", lo, hi);
        size = read_int("\nEnter the value");
        if(!(size >=lo && size <= hi)){
            printf("%d is not between %d and %d, please enter again\n", size, lo, hi);
        }
    }while(!(size >=lo && size <= hi));
    return size;

}

/******************************************
 * draw_picture: draws a pyramid-shaped picture consisting of asterisks (*) and the size of this drawing (namely
 * the number of rows in the console) is specified by the user.
 *  size: the specified size of the picture to be drawn in the console.
 *  return: Void
 */
void draw_picture(int size){
    for (int i = 1; i<=size; i++){
        for (int j = 1; j<=2*size-1; j++){
            if(j >= size-(i-1) && j <= size+(i-1)){
                printf("*");
            }
            else {
                printf(" ");
            }
        }
        printf("\n");
    }
}


/* THIS FUNCTION IS PROVIDED FOR YOU: DO NOT MODIFY! */
/******************************************
 * read_int: prompts the user to enter an integer value,
 *           and returns to the entered value to the caller
 *  msg: the prompt msg to print
 *       (char * is the type for C strings, don't worry about understanding
 *        the char * type now, we will talk about it later)
 *  returns: int value entered by user
 *
 * NOTE: this function is NOT robust to bad user input
 */

int read_int(char *msg) {

    int val;

    printf("%s", msg);
    scanf("%d", &val);
    return val;
}
