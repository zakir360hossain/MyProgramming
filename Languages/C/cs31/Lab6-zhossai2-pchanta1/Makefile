LIBDIR=/home/newhall/public/cs31
CC = gcc
CFLAGS = -g -Wall -Wvla -Werror -Wno-error=unused-variable

TARGET = cs31shell

.PHONY: clean

all: $(TARGET) sleeper

$(TARGET) : $(TARGET).c  
	$(CC) $(CFLAGS) -o $(TARGET) $(TARGET).c $(LIBDIR)/parsecmd.o

sleeper: sleeper.c
	$(CC) $(CFLAGS) -o sleeper sleeper.c

clean:
	$(RM) $(TARGET) sleeper 
