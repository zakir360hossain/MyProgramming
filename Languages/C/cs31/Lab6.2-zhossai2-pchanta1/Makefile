CC = gcc
CFLAGS = -g -Wall -Wvla -Werror -Wno-error=unused-variable

TARGET = tester

all: $(TARGET) 

$(TARGET) : $(TARGET).c  parsecmd.h parsecmd.o
	$(CC) $(CFLAGS) -o $(TARGET) $(TARGET).c parsecmd.o  -lreadline

# this is the command to build the parsecmd library as a .o file
parsecmd.o: parsecmd.h parsecmd.c
	$(CC) $(CFLAGS) -c parsecmd.c

clean:
	$(RM) $(TARGET) parsecmd.o 
