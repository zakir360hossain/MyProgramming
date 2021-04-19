CC = gcc
C++ = g++
CFLAGS = -g -Wall -Wvla -Werror -Wno-error=unused-variable


all: gol

gol: gol.o
	$(C++) $(CFLAGS) -o gol gol.o 

gol.o: gol.c
	$(CC) $(CFLAGS) -c gol.c


clean:
	$(RM) gol *.o
