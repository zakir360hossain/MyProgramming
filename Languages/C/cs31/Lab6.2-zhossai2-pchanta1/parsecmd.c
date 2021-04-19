/*
 * Swarthmore College, CS 31
 * Copyright (c) 2019 Swarthmore College Computer Science Department,
 * Swarthmore PA, Professor Tia Newhall
 */

//
// TODO: add your comment here
//
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include "parsecmd.h"

/***************************************************/
/* a static global variable means private to code in this file
 * it is used by parse_cmd to store a copy of the command
 * line that it can modify and make argv parm point to
 */
static char cmdline_copy[MAXLINE];

/*
 * TODO: implement this function: and add a complete function comment here
 */
int parse_cmd(const char *cmdline, char *argv[], int *bg) {


  // TODO: replace/change this return when you implement this function.
  // this is returning that the command line is empty right now
  return -1;
}
/***************************************************/
/*
 * TODO: implement this function: and add a complete function comment here
 */
char **parse_cmd_dynamic(const char *cmdline, int *bg) {



  // TODO: replace/change this return when you implement this function.
  return NULL;
}

