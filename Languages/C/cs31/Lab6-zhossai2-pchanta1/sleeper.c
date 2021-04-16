/*
 * Swarthmore College, CS 31
 * Copyright (c) 2019 Swarthmore College Computer Science Department,
 * Swarthmore PA, Professor Tia Newhall
 */

//  a long running program for testing the CS31 shell program
//  can run with or without a command line argument that specifies
//  how many times the program should sleep for 2 seconds  before 
//  exiting.  With no command line argument it does this 5 times.
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(int argc, char *argv[]) {

   int i, num = 5;
   if(argc == 2) {
      num = atoi(argv[1]);
   }
   for(i=0; i < num; i++) {
      sleep(2);     
   }
   return 0;
}
