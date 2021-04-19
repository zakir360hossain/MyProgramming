/*
 * Swarthmore College, CS 31
 * Copyright (c) 2019 Swarthmore College Computer Science Department,
 * Swarthmore PA, Professor Tia Newhall
 */

/*
 * A program that calls the sum function you will
 * implement in sum.s in IA32
 *
 */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


/* computes the sum of the values 1-n
 * n: an int value
 * returns: the sum of values from 1-n, or -1 if n is not positive
 */
int sum(int n);


int main() {

  int res, n;

  printf("This program computes the sum of 1-N\n");
  printf("Enter an value for n: ");
  scanf("%d", &n);
  res = sum(n);
  if(res == -1) {
    printf("ERROR: sum passed a non-negative value %d\n", n);
    printf("try running again and pass a positive value\n");
  } else { 
    printf("The sum of 1 to %d is %d\n", n, res);
  }

  return 0;
}
