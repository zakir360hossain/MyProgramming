/* Swarthmore College, CS 31
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
void add_to_history_queue(char *cmd[MAXARGS]);
void print_history_queue();
void sigchld_handler(int sig);
void sigint_handler(int sig);


/******************************************************************/
int main( ){ 

  char cmdline[MAXLINE];
  char *argv[MAXARGS];
  int bg;
  int ret_parse, ret_exec;
  pid_t pid;
  int status;

  // TODO: add a call to signal to register your signal handler on 
  //       SIGCHLD here
  signal(SIGCHLD, sigchld_handler);
  signal(SIGINT, sigint_handler);

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
 
    ret_parse = parse_cmd(cmdline, argv, &bg);
//    fprintf(stderr, "ret %d", ret); 
    if (ret_parse != -1){
	add_to_history_queue(argv);
      pid = fork();
      if (pid < 0) {
        printf("Fork failed\n");
        exit(0);
      }
      if (pid == 0) { // child
        if (strcmp(argv[0], "history")==0) {
          print_history_queue();
	  exit(0);
        
	}
        if(strcmp(argv[1], "&")==0 || strcmp(argv[2], "&")==0){
          pid = fork();
          //    this is set to one, otherwise it remains 0)
          if (pid == 0) {
                ret_exec = execvp(argv[0], argv);
                if (ret_exec < 0) {
                        printf("Error: execvp returned!!!\n");
                        exit(ret_exec);
                }

          }

        }

	  ret_exec = execvp(argv[0], argv);
        if (ret_exec<0) {
          printf("%s: Command is not found\n", argv[0]);
          exit(0);
        }

      }
	
      else {
        if (pid > 0) { // parent
          //signal(SIGCHLD, sigchld_handler);
            printf("hellow\n");
          waitpid(pid,&status,0);
        }
      }  
           /* if ((fgets(cmdline, MAXLINE, stdin) == NULL) && ferror(stdin)) {
              perror("fgets error");
            }
           ret = parse_cmd(cmdline, argv, &bg);
           */
   

        }

    
      
    // (4) determine how to execute it, and then execute it
    //
    
  }    
  return 0;
}

/******************************************************************/
void add_to_history_queue(char *cmd[MAXARGS]) {

        strcpy(history[history_next].command, *cmd);
        if(history_size < MAXHIST){
           history_size++;
        }
        history_next = (history_next+1)% MAXHIST;

}
/************************0*****************/
// print out the values in order that they
// were added to the queue: first to last
// print:  bucket_index_value: bucket_value
//
void print_history_queue(){

        int t = history_next;
	int index = 0;

        for(int i = 0; i<history_size; i++){
           if(history_size == MAXHIST){
             printf("%d : %s\n", index, history[t].command);
             t = (t+1)%MAXHIST;
             index++;
           }
           else{
            printf("%d : %s\n", i, history[i].command);
           }
        }
}

/**********************************************************/

void sigchld_handler(int sig){
  pid_t pid;
  int child_status;
  pid = waitpid(-1, &child_status, WNOHANG);
  while(pid > 0) {
  	printf("signal %d from %d\n", sig, pid);
  }
}

void sigint_handler(int sig){
	//pid_t pid = getpid();
        printf("Bye Bye!");
	exit(0);
	//kill(pid, SIGKILL);
}

