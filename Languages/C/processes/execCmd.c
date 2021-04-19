#include <stdlib.h>
#include <stdio.h>
#include <string.h>
//#include <math.h>
#include <time.h>
#include <unistd.h>
#include <sys/wait.h>
#include <signal.h>
//#include <ctype.h>
//#include <conio.h>

int main(int argc, char* argv[]){

    char *cmd = argv[0];


    execvp(cmd, argv);

    return 0;
}