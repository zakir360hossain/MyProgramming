/*
 * Swarthmore College, CS 31
 * Copyright (c) 2019 Swarthmore College Computer Science Department,
 * Swarthmore PA, Professor Tia Newhall
 */

/* 
 *  03/21/2021
 *  Authors: Zakir Hossain, Arina Kazakova
 *
 * This program calculates a set of statistical statistical results for a list of floats from a
 * text file  and prints out the results. The program would work for a data set of any size. 
 * To run the program on a particular text file, the filename should be specified as a command line argument.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include "readfile.h"

/* 
 * N: strart size for first dynamically allocated array of values
 * MAXFILENAME: max length of input file name string + 1 (includes '\0')
 */
#define N             20
#define MAXFILENAME   256

/* function prototypes */
float *get_values(int *size, int *capacity, char *filename);
void sort(float arr[], int array_size);
void swap(float arr[], int index1, int index2);
int check(float arr[], int array_size);
float calcMedian(float arr[], int array_size);
double calcStd_dev(float arr[], int array_size);
float calcMean(float arr[], int array_size);
void printStats(int size, float min, float max, float mean, 
                float median, double std_dev, int unused_cap);
/**********************************************************************/
int main(int argc, char *argv[]) {

  char filename[MAXFILENAME];
  float *vals=NULL;
  int size, capacity;
  float min, max, median, mean;
  double std_dev;
  int unused_cap;

  /*  checks the command line args to make sure program was run
      with a filename argument.  If not, calls exit to quit the program */
  if(argc != 2) {
    printf ("usage: ./stats filename\n");
    exit(1);
  }
  /* copy the filename command line argument into the string variable filename */
  strncpy(filename, argv[1], MAXFILENAME-1);

  vals = get_values(&size, &capacity, filename);    // read the values from the file
  sort(vals, size);

  /* calculate the statitics */
  min = vals[0];
  max = vals[size-1];
  median = calcMedian(vals, size);
  mean = calcMean(vals, size);
  std_dev = calcStd_dev(vals, size);
  unused_cap = capacity - size; 
  /* print out the calculated statistics in a pretty format */
  printStats(size, min, max, mean, median, std_dev, unused_cap);

  //Freeing the vals pointer
  free(vals);
  vals = NULL;
  return 0;
}


/**********************************************************************/
/*
 * This function reads in values from the input file into a dynamically
 * allocated array of floats that it returns.  It uses a doubling 
 * algorithm to increase the size of the array as it needs more space
 * for the values read in from the file.
 * 
 *   size: set to the number of data values read in from the file
 *   capacity: set to the total number of buckets in the returned array
 *   filename: the name of the file to open
 *
 *   returns: the base address of the array of values read in 
 *            or NULL on error
 */
float *get_values(int *size, int *capacity, char *filename){

  int ret;
  float *values = NULL;
  float *new_values = NULL;
  int i;
  float tempElHolder;

  if(size != NULL && capacity !=NULL){ 
    /* Initializing the initial capacity to 20 */
     *capacity = 20;
    /*allocating space for the array */
    values = malloc(sizeof(float) * (*capacity));
  }
  else{
    printf("The size is null");
    return NULL;
  }

  ret = open_file(filename);
  if(ret == -1) {
    printf("ERROR: can't open %s\n", filename);
    return NULL; /* return  NULL if the file cannot be open */
 
  }
  ret = read_float(&tempElHolder);
  values[0] = tempElHolder;
  *size = 1;
  while(ret != -1){
    
    ret = read_float(&tempElHolder);
    if(*size == *capacity){
      *capacity = 2 * (*capacity);
       new_values = malloc(sizeof(float) * (*capacity));
       for(i = 0; i < *size; i++){
         new_values[i]= values[i];
       }
       free(values);
       values = NULL;
       values = new_values;
    }
    if(ret != -1){
      values[*size] = tempElHolder;
      *size +=1;
    }
  }
  close_file();

   return values;
}



/************************************************************************/
/*
 * This function calculates the median of a given float array.
 * arr[]: the float array
 * array_size: the size of of arr[]
 * return : the calculated median
 */

float calcMedian(float *arr, int array_size){
  float median;
  if(array_size % 2 == 0){
    median = arr[array_size / 2];
  }
  else{
    median = arr[(array_size / 2)];
  }
  return median;
}
/*
 * This function calculates the mean of a given float array.
 * arr[]: the float array
 * array_size: the size of of arr[]
 * return : the calculated mean
 */
float calcMean(float *arr, int array_size){
  float sum;
  float mean;
  int i;
  sum = 0;
  for (i = 0; i < array_size; i++)
  {
    sum +=arr[i];
  }
  mean = sum/array_size;
  return mean;
}
/*
 * This function calculates the standard deviation from a given 
 * array of floats
 * arr[]: an  array of floats
 * array_size: the size of of arr[]
 * return : the calculated standard deviation
 */
double calcStd_dev(float *arr, int array_size){
  double std_dev;
  int i;
  float mean;

  std_dev = 0;
  mean = calcMean(arr, array_size);
   
  for (i = 0; i < array_size; i++)
  {
    std_dev += (arr[i]-mean)*(arr[i]-mean);
  }
  std_dev = sqrt(std_dev/(array_size-1));
  return std_dev;
}


/*
 * This function sorts an array of floats in place using bubble sort.
 * arr[]: array of floats to be sorted
 * array_size: size of arr[]
 * returns: void function,does not return anything.
*/
void sort(float arr[], int array_size) {
  int i,j;

    for (i=0; i < array_size-1; i++) {
      if (check(arr, array_size)) {
        return;
      }
      for (j=0; j < array_size-i-1; j++) {
        if (arr[j] > arr[j+1]) {
          swap(arr, j, j+1);
        }
      }
    }
}

/* This function swaps two given indices of an array in place. It is
 * one of the helper functions used by sort().
 * arr[]: array of floats with indices to be swapped
 * index1, index2: both indices within array to be swapped
*/
void swap(float arr[], int index1, int index2) {
  float temp;
  temp  = arr[index1];
  arr[index1] = arr[index2];
  arr[index2] = temp;
}

/* This functions checks to see whether an array of floats is
 * sorted. It returns 0 if the program is unsorted, and 1 if it is.
 * arr[]: array of floats to check for sorted/unsorted
 * array_size: size of arr[]
*/
int check(float arr[], int array_size) {
  int i;
  for (i=0; i < array_size-1; i++) {
    if (arr[i] >  arr[i+1]) {
      return 0;
    }
  }
  return 1;
}
/*
 * This function prints the values of the given arguments.
 * size, min, max, mean, median, double, int: values to be printed
 * return: void function, does not return anything
 */
void printStats(int size, float min, float max, float mean,
                float median, double std_dev, int unused_cap){
  printf("Results:\n------\n");
  printf("num values:\t%d\n", size);
  printf("min:\t%.3f\n", min);
  printf("max:\t%.3f\n", max);
  printf("mean:\t%.3f\n", mean);
  printf("median:\t%.3f\n", median);
  printf("std dev:\t%.3g\n", std_dev);
  printf("unused array capacity:\t%d\n", unused_cap);
}
