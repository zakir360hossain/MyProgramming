/*
 * Swarthmore College, CS 31
 * Copyright (c) 2017 Swarthmore College Computer Science Department,
 * Swarthmore PA, Professor Tia Newhall
 */

// parsecmd library interface file. 
#ifndef _PARSECMD__H_
#define _PARSECMD__H_

#define MAXLINE    1024   // max command line size 
#define MAXARGS     128   // max number of arguments on a command line 

/* 
 * parse_cmd - Parse the command line and build the argv array.
 *
 *    cmdline: the command line string entered at the shell prompt
 *    argv:  an array of size MAXARGS of char *
 *           parse_cmd will initialize its contents from the passed
 *           cmdline string.
 *           The caller should pass in a variable delcared as:
 *              char *argv[MAXARGS];
 *              (ex) int bg = parse_cmd(commandLine, argv);
 *
 *           argv will be filled with one string per command line
 *           argument.  The first argv[i] value following the last
 *           command line string will be NULL.  For example:
 *              ls -l     argv[0] will be "ls"  argv[1] will be "-l"
 *                        argv[2] will be NULL
 *          for an empty command line, argv[0] will be set to NULL
 *    bg:   pointer to an int that will be set to 1 if the last 
 *          argument is '&', 0 otherwise. So bg will be set to 1
 *          if the command is meant to be run in the background.
 *
 *    returns: -2 if cmdline is NULL
 *             -1 if the command line is empty
 *              0 to indicate success
 */
int parse_cmd(const char *cmdline, char **argv, int *bg);

#endif
