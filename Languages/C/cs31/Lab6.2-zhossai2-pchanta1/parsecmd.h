/*
 * Swarthmore College, CS 31
 * Copyright (c) 2019 Swarthmore College Computer Science Department,
 * Swarthmore PA, Professor Tia Newhall
 */

// parsecmd library interface file.  Do not change this file.  (newhall, 2013)
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
int parse_cmd(const char *cmdline, char *argv[], int *bg);


/*
 * parse_cmd_dynamic - parse the passed command line into an argv array
 *
 *    cmdline: the command line string entered at the shell prompt
 *         bg: will set value pointed to 1 if command line is run in
 *             background, 0 otherwise (a pass-by-reference parameter)
 *
 *    returns: a dynamically allocated array of strings, exactly one
 *             bucket value per argument in the passed command line
 *             the last bucket value is set to NULL to signify the
 *             end of the list of argument values.
 *             or NULL on an error
 *
 *             The caller is responsible for freeing the returned
 *             argv list.
 */
char **parse_cmd_dynamic(const char *cmdline, int *bg);

#endif
