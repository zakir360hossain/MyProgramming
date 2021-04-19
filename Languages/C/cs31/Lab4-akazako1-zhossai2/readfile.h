#ifndef _READFILE_H_
#define _READFILE_H_
/*
 * Swarthmore College, CS 31
 * Copyright (c) 2019 Swarthmore College Computer Science Department,
 * Swarthmore PA, Professor Tia Newhall
 */

/*
 * This is a library for reading values of different types from a file.
 * It is used as helper code for lab 1 in CS31.
 *   To use this library:
 *   (0) #include "readfile.h" at the top of your .c file
 *
 *   (1) call openfile() passing in the file name string to open
 *        openfile("input.txt");
 *     
 *   (2) make calls to read_<type> to read values from
 *       the file.  These functions return 0 when the read was successful
 *       and -1 when not (like the file could have nothing left to read)
 *       You need to be careful to call the right function here to
 *       correspond to the next value to be read in the file (if you
 *       want to read in an int, make sure to call read_int and not
 *       read_char, for example)  Examples:
 *
 *       int x, ret, total;
 *
 *       ret = openfile("input.txt");
 *       if(ret == -1) {
 *          printf("open file failed\n");
 *          exit(1);
 *       }
 *       
 *       total = 0;
 *       ret = read_int(&x);
 *       while(ret != -1) {
 *         total += x;
 *         ret = read_int(&x);
 *       }
 *       
 *         
 *
 *   (3) call closefile() when you are all done reading values
 *       from the file
 * (newhall, 2013)
 */
/**********************************************************/
/*
 * open the file for reading
 *   filename: a string containing the name of the file to read
 *   returns: 0 on success, -1 if the file cannot be opened
 *
 */
int open_file(char *filename) ;
/**********************************************************/
/*
 * close the file for reading
 */
void close_file();

/**********************************************************/
/*
 * reads the next value in the file as a string
 *   str: a string to fill with the read in value
 *   returns: 0 on success, -1 if there is nothing left to
 *            read in the file
 */
int read_string(char str[]);
/**********************************************************/
/*
 * reads the next value in the file as an int
 *   val: the address of an int storage location 
 *        into which the read value is "returned"
 *   returns: 0 on success, -1 if there is nothing left to
 *            read in the file
 */
int read_int(int *val);
/*
 * reads the next value in the file as a float
 *   val: the address of a float storage location 
 *        into which the read value is "returned"
 *   returns: 0 on success, -1 if there is nothing left to
 *            read in the file
 */
int read_float(float *val);

#endif
