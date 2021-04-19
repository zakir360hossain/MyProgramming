/*
 * Swarthmore College, CS 31
 * Copyright (c) 2021 Swarthmore College Computer Science Department,
 * Swarthmore PA, Professors Tia Newhall and Andy Danner
 */

/*
 * TODO: add your top-level comment here
 *
 */

#include <stdio.h>      // the C standard I/O library
#include <stdlib.h>     // the C standard library
#include <string.h>     // the C string library
#include "readfile.h"   // my file reading routines

/* #define constant values here: */
#define MAXFILENAME  128
#define ARRAYSIZE    1000

/* function prototypes: */
void get_filename_from_commandline(char filename[], int argc, char *argv[]);
void print_array_contents(float arr[], int array_size);
void sort(float arr[], int array_size);
void swap(float arr[], int index1, int index2);
int check(float arr[], int array_size);

/********************************************************************/
int main (int argc, char *argv[]) {

  int ret;                    /* for storing function return values */
  char filename[MAXFILENAME]; /* the input filename  */
  float values[ARRAYSIZE];    /* stores values read in from file */
  int array_size;
  float min_float, max_float;
  /* TODO: declare all additional variables here: */

  /* initialize filename string from the command line arguments */
  get_filename_from_commandline(filename, argc, argv);

  /* try to open file */
  ret = open_file(filename);
  if(ret == -1) {
    printf("ERROR: can't open %s\n", filename);
    /* exit quits the program immediately. Some errors are not 
     * recoverable. Exit with an error message to handle these cases.
     */
     exit(1);
  }
  ret = read_int(&array_size);
  if (ret == -1) {
    printf("ERROR: can't read value\n");
    exit(1);
  }
  ret = read_float(&min_float);
  if (ret == -1) {
    printf("ERROR: can't read value\n");
    exit(1);
  }
  ret = read_float(&max_float);
  if (ret == -1) {
    printf("ERROR: can't read value\n");
    exit(1);
  }
  printf("Reading file named %s\n", filename);
  printf("The file contains %d floating point numbers, ranging from %.2f to %.2f\n", array_size, min_float, max_float);
  printf("The unsorted values are: ");

  for (int i=0; i < array_size; i++) {
    ret = read_float(&values[i]);
  }
  print_array_contents(values, array_size);
  sort(values, array_size);
  printf("The sorted values are: ");
  print_array_contents(values, array_size);
  close_file();  /* close file */
  return 0;
}
/***********************************************************/
// TODO: ADD YOUR FUNCTION DEFINITONS HERE:


/***********************************************************/
/* THE FOLLOWING FUNCTION IS PROVIDED FOR YOU
 * DO NOT MODIFY, OR DO SO AT YOUR OWN RISK!
 *
 * This function gets the filename passed in as a command line option
 * and copies it into the filename parameter. It exits with an error
 * message if the command line is badly formed.
 *
 *   filename: the string to fill with the passed filename
 *   argc, argv: the command line parameters from main
 *               (number and strings array)
 */
void get_filename_from_commandline(char filename[], int argc, char *argv[]) {

  if(argc != 2) {
    printf("Usage: ./exp integer_file\n");
    exit(1);
  }
  if(strlen(argv[1]) >= MAXFILENAME) {
    printf("Filename, %s, is too long, cp to shorter name and try again\n",
        filename);
    exit(1);
  }
  strcpy(filename, argv[1]);
}

/* This function prints every float in an array to two decimal places 
 * on a single line. It does not return anything.
 *
 * arr[]: array of floats to be printed
 * array_size: size of arr[]
*/
void print_array_contents(float arr[], int array_size) {
  for (int i=0; i < array_size; i++) {
    printf("%.2f ", arr[i]);
  }
  printf("\n");
}

/* This function sorts an array of floats in place using bubble sort.
 * It does not return anything.
 *
 * arr[]: array of floats to be sorted
 * array_size: size of arr[]
*/
void sort(float arr[], int array_size) {
    for (int i=0; i < array_size-1; i++) {
      if (check(arr, array_size)) {
        return;
      }
      for (int j=0; j < array_size-i-1; j++) {
        if (arr[j] > arr[j+1]) {
          swap(arr, j, j+1);
        }
      }
    }
}

/* This function swaps two given indices of an array in place. It is
 * one of the helper functions used by sort().
 *
 * arr[]: array of floats with indices to be swapped
 * index1, index2: both indices within array to be swapped
*/
void swap(float arr[], int index1, int index2) {
  float temp  = arr[index1];
  arr[index1] = arr[index2];
  arr[index2] = temp;
}

/* This functions checks to see whether an array of floats is
 * sorted. It returns 0 if the program is unsorted, and 1 if it is.
 * arr[]: array of floats to check for sorted/unsorted
 * array_size: size of arr[]
*/
int check(float arr[], int array_size) {
  for (int i=0; i < array_size-1; i++) {
    if (arr[i] >  arr[i+1]) {
      return 0;
    }
  }
  return 1;
}
