/*
 * Swarthmore College, CS 31
 * Copyright (c) 2019 Swarthmore College Computer Science Department,
 * Swarthmore PA, Professor Tia Newhall
 */

// TODO: Add your top-level coment here
//
#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <unistd.h>
#include <sys/types.h> 
#include <sys/wait.h>
#include "parsecmd.h"

#define MAXHIST 10   // max number of commands in the history


// used to store history information about past commands
struct history_t {
  char command[MAXLINE];  // the command line from a past command
  // TODO: you are welcome to add more fields to this struct type
};

/* global variables: add only globals for history list state
 *                   all other variables should be allocated on the stack
 * static: means these variables are only in scope in this .c file 
 *
 * history: a circular list of the most recent command input strings.  
 *          Note: there are MAXHIST elements, each element is a
 *          history_t struct, whose definition you can change (by
 *          adding more fields).  It currently has one filed to store
 *          the command line string (a statically declared char array 
 *          of size MAXLINE)
 *          Remember: the strcpy function to copy one string to another
 */
static struct history_t history[MAXHIST]; 
static int history_next=0;
static int history_size=0;
// TODO: you may add some more global variables for the history list
//       (and these should be the only globals in your program)


// TODO: add your function prototypes here 
//       (your solution should have some helper functions)


/******************************************************************/
int main( ){ 

  char cmdline[MAXLINE];
  char *argv[MAXARGS];
  int bg;

  // TODO: add a call to signal to register your signal handler on 
  //       SIGCHLD here

  while(1) {
    // (1) print the shell prompt (in a cool color!)
    printf("\e[1;36mcs31shell> \e[0m");
    fflush(stdout);

    // (2) read in the next command entered by the user
    if ((fgets(cmdline, MAXLINE, stdin) == NULL) && ferror(stdin)) {
      perror("fgets error");
    }
    if (feof(stdin)) { /* End of file (ctrl-d) */
      fflush(stdout);
      exit(0);
    }

    // You can uncomment this to see what the command line is 
    // NOTE: remove or comment out all debug output from submitted version
    // printf("DEBUG: %s\n", cmdline);

    // TODO: complete top-level steps
    // (3) make a call to parse_cmd function to parse it into its
    //     argv format
      
    // (4) determine how to execute it, and then execute it
    //
    
  }
  return 0;
}
/******************************************************************/
