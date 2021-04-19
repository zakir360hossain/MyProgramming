/*
 * Swarthmore College, CS 31
 * Copyright (c) 2019 Swarthmore College Computer Science Department,
 * Swarthmore PA, Professor Tia Newhall
 */

//  tester program for CS31 parsecmd library
//
// TODO: a your top-level comment here
//
// note: the call to parse_cmd_dynamic is commented out here
//
#include<stdlib.h>
#include<string.h>
#include<stdio.h>
#include<unistd.h>
#include <sys/types.h>
#include <readline/readline.h>
#include <readline/history.h>
#include"parsecmd.h"

// static: means these functions cannot be called from outside this file
static void print_cmd_args(char *cmdline, char **argv);
static void print_bg(int bg);

/******************************************************************/
int main(){

  int bg, ret;
  char *cmdline;   // store string read in from readline
  char *argv[MAXARGS];  // argv array for parse_cmd
  char **argv_dyn;      // stores return value of parse_cmd_dynamic

  cmdline = NULL;
  argv_dyn = NULL;
  argv[0] = NULL;

  printf("Enter quit to stop\n");
  while(1) {
    cmdline = readline("enter a cmd line> ");
    if(cmdline == NULL) {
      printf("Error readline failed!\n");
      exit(1);
    }

    ret = parse_cmd(cmdline, argv, &bg);
    if (ret == -1) {
      printf("empty command line\n");
    } 
    else if((argv[0] != NULL) && (strcmp(argv[0], "quit") == 0) ){
        break;  // quit: break out of while loop
    } 
    else {  // this is a non-empty and non-quit command line
      print_cmd_args(cmdline, argv);
      print_bg(bg);

      bg = 0;
      argv_dyn = NULL;
      // TODO: uncomment this call to test parse_cmd_dynamic
      // argv_dyn = parse_cmd_dynamic(cmdline, &bg);
      if(argv_dyn) {
        print_cmd_args(cmdline, argv_dyn);
        print_bg(bg);
        // TODO: add code to free all malloc'ed state associated
        //       with the call to parse_cmd_dynamic
      } 
    }
    if(cmdline) {
      free(cmdline);   // free string retuned from readline
      cmdline = NULL;
    }
  }
  
  // make sure we have free'ed string returned from readline
  if(cmdline) {
    free(cmdline);   
    cmdline = NULL;
  }
  return 0;
}
/*******************************************************************/
// This function prints out a message based on the value of bg
// indicating if the command is run in the background or not
void print_bg(int bg) {
      if(bg) {
        printf("run in the background is true\n");
      } else {
        printf("run in the background is false\n");
      }
}
/*******************************************************************/
// This function prints out the cmdline and argv list
//   cmdline: the command line string
//   argv: the argv list of command line argumetns string
//
void print_cmd_args(char *cmdline, char **argv ){

  int i=0;

  printf("\nCommand line: %s\n", cmdline);

  while (argv[i] != NULL) {
    // note: I'm printing out each argv string between # chars
    //       so that I can see if I have left any space or other
    //       invisible characters in an argv[i] string (I shouldn't)
    printf("%3d  #%s#\n", i, argv[i]);
    i++;
  }
}
