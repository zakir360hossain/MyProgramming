/*
 * Swarthmore College, CS 31
 * Copyright (c) 2021 Swarthmore College Computer Science Department,
 * Swarthmore PA, Professors Tia Newhall, Andrew Danner, and Kevin Webb
 */

// TODO: add your top-level comment here
// Zakir Hossain, Fourth Sukprawit
// April 1, 2021

/*
 * To run:
 * ./gol file1.txt  0  # run with config file file1.txt, do not print board
 * ./gol file1.txt  1  # run with config file file1.txt, ascii animation
 *
 */
#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>
#include <sys/time.h>
#include <time.h>
#include <string.h>
#include <pthread.h>

/****************** Definitions **********************/
/* Two possible modes in which the GOL simulation can run */
#define OUTPUT_NONE   0   // with no animation
#define OUTPUT_ASCII  1   // with ascii animation

/* Used to slow down animation run modes: usleep(SLEEP_USECS);
 * Change this value to make theh animation run faster or slower
 */
//#define SLEEP_USECS  1000000
#define SLEEP_USECS    100000

/* A global variable to keep track of the number of live cells in the
 * world (this is the ONLY global variable you may use in your program)
 */
static int total_live = 0;

/* This struct represents all the data you need to keep track of your GOL
 * simulation.  Rather than passing individual arguments into each function,
 * we'll pass in everything in just one of these structs.
 * this is passed to play_gol, the main gol playing loop
 *
 * NOTE: You will need to use the provided fields here, but you'll also
 *       need to add additional fields. (note the nice field comments!)
 * NOTE: DO NOT CHANGE THE NAME OF THIS STRUCT!!!!
 */
struct gol_data {

    // NOTE: DO NOT CHANGE the names of these 4 fields (but USE them)
    int rows;  // the row dimension
    int cols;  // the column dimension
    int iters; // number of iterations to run the gol simulation
    int output_mode; // set to:  OUTPUT_NONE, or OUTPUT_ASCII

    // TODO: add more fields for gol data your main play_gol function needs
    int* grid;
};



/****************** Function Prototypes **********************/
// TODO: these are a few starting point function prototypes
//       for you.  You need to implement them.
/* the main gol game playing loop (prototype must match this) */
void play_gol(struct gol_data *data);
/* init gol data from the input file and run mode cmdline args */
int init_game_data_from_args(struct gol_data *data, char *argv[]);
void init_grid(struct gol_data *data);

// TODO: a mostly implemented function, but a bit more for you add
/* print board to the terminal (for OUTPUT_ASCII mode) */
void print_board(struct gol_data *data, int round);

// TODO: add your other function prototypes here

/**********************************************************/
int main() {

    int ret;
    struct gol_data data;
    double secs;
    fprintf(stdout, "dsgdfgf\n");
    // TODO: any additional local variables should be added up here

//    /* check number of command line arguments */
//    if (argc < 3) {
//        printf("usage: ./gol <infile> <0|1>\n");
//        printf("(0: with no visi, 1: with ascii visi)\n");
//        exit(1);
//    }

    /* Initialize game state (all fields in data) from information
     * read from input file */
    // TODO: you need to complete the implemention of this function
//    ret = init_game_data_from_args(&data, argv);
    data.rows = 10;
    data.cols = 10;
    init_grid(&data);
    printf("%d\n", data.grid[3]);
//    if(ret != 0) {
//        printf("Error init'ing with file %s, mode %s\n", argv[1], argv[2]);
//        exit(1);
//    }

//    /* Invoke play_gol in different ways based on the run mode */
//    if(data.output_mode == OUTPUT_NONE) {  // run with no animation
//        play_gol(&data);
//    }
//    else { // run with ascii animation
//        play_gol(&data);
//
//        // clear the previous print_board output from the terminal:
//        // (NOTE: you can comment out this line while debugging)
//        if(system("clear")) { perror("clear"); exit(1); }
//
//        // NOTE: DO NOT modify this call to print_board at the end
//        //       (its for grading)
//        print_board(&data, data.iters);
//    }

    // TODO: Compute the total runtime in seconds, including fractional seconds
    //       (e.g., 10.5 seconds should NOT be truncated to 10).
    // NOTE: you need to determine how and where to add timing code
    //       in your program to measure the total time to play the given
    //       number of rounds of GOL.  Then set the secs local variable
    //       to your computed total runtime so it gets printed out here.
    secs = 0.0;

    /* Print the total runtime, in seconds. */
    // NOTE: do not modify these calls to fprintf
    fprintf(stdout, "Total time: %0.3f seconds\n", secs);
    fprintf(stdout, "Number of live cells after %d rounds: %d\n\n",
            data.iters, total_live);


    // TODO: clean-up before exit


    return 0;
}
/**********************************************************/
// TODO: complete the implementation of the main application
//       functions started for you below
//       You must also add in your own additional helper function
//       for implementing partial functionality of these big
//       parts of the application: appply good Top Down Design
//       in your solution, and use incremental implementation
//       and testing as you go.
//

/* initialize the gol game state from command line arguments
 *       argv[1]: name of file to read game config state from
 *       argv[2]: run mode value
 * data: pointer to gol_data struct to initialize
 * argv: command line args
 *       argv[1]: name of file to read game config state from
 *       argv[2]: run mode
 * returns: 0 on success, 1 on error
 */
int init_game_data_from_args(struct gol_data *data, char *argv[]) {

    // TODO: implement this function
    //       you should also add some helper functions
    //       that implement partial functionality
    int ret;
    int i;
    int liveCellCol, liveCellRow;
    FILE *infile;  // a file pointer is not a pointer like pointers to other
    // C types: dereferencing it doesn't make any sense
    // (1) open the file for reading and check that open succeeded
    //     (the file name is passed as command line arg)
    infile = fopen(argv[1], "r");
    if (infile == NULL) {
        printf("Error: file open %s\n", argv[1]);
    }

    ret = fscanf(infile, "%d", &(data->rows));
    if(ret ==1){
        ret = fscanf(infile, "%d", &(data->cols));
    }
    if(ret ==1){
        ret = fscanf(infile, "%d", &(data->iters));
    }

    init_grid(data);
    i = 0;

    while(i < (data->iters) && ret==2){
        ret = fscanf(infile, "%d%d", &liveCellRow, &liveCellCol);
        data->grid[liveCellRow* data->rows + liveCellCol ] = 1;

    }

    return 0;
}

void init_grid(struct gol_data *data){
    int rows = data->rows;
    int cols = data->cols;
    data->grid = malloc(sizeof(int) * rows*cols);
    data->grid[1] = 4365;
    printf("dfhgh %d\n", data->grid[1]);
    if (!data->grid){
        printf("Malloc failed");
        exit(1);
    }
    for ( int i = 0; i < rows; i++)
    {
        for (int  j = 0; j < cols; j++)
        {
            data->grid[i*cols + j] = i+j;
        }
    }
    printf("%d\n", data->grid[2]);

    }
/**********************************************************/
/* the gol application main loop function:
 *  runs rounds of GOL,
 *    * updates program state for next round (world and total_live)
 *    * performs any animation step based on the output/run mode
 *
 *   data: pointer to a struct gol_data  initialized with
 *         all GOL game playing state
 */
void play_gol(struct gol_data *data) {

    // TODO: implement the main gol playing functionality here
    // you MUST have some helper functions (called by this function)
    // that implement parts of the larger game playing functionality

    //  at the end of each round of GOL, determine if there is an
    //  animation step to take based on the ouput_mode,
    //   if ascii animation:
    //     (a) call system("clear") to clear previous world state from terminal
    //     (b) call print_board function to print current world state
    //     (c) call usleep(SLEEP_USECS) to slow down the animation
}

/**********************************************************/
/* Print the board to the terminal.
 *   data: gol game specific data
 *   round: the current round number
 *
 * TODO: add in your application-specific code to test
 *       if a live or dead cell should be printed
 * NOTE: You may add extra printfs if you'd like, but please
 *       leave these fprintf calls exactly as they are to make
 *       grading easier!
 */
void print_board(struct gol_data *data, int round) {

    int i, j;

    /* Print the round number. */
    fprintf(stderr, "Round: %d\n", round);

    for (i = 0; i < data->rows; ++i) {
        for (j = 0; j < data->cols; ++j) {
            // //TODO: if cell is alive
            //     fprintf(stderr, " @");
            // //TODO: otherwise
            //     fprintf(stderr, " .");
            printf("%d", data->grid[i*data->cols + j]);
        }
        fprintf(stderr, "\n");
    }

    /* Print the total number of live cells. */
    fprintf(stderr, "Live cells: %d\n\n", total_live);
}
