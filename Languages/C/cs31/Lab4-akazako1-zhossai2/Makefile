#
# make: compile stats and prog
#
TARGET=stats
CC = gcc
CFLAGS = -g -Wall -Wvla -Werror -Wno-error=unused-variable -Wno-error=unused-but-set-variable

TARGET2=prog
# gcc flags for IA32 compiling
C32FLAGS = -Wall -g -m32 -O0 -fno-asynchronous-unwind-tables -fno-pic

all: $(TARGET) $(TARGET2)


$(TARGET): $(TARGET).c readfile.o
	$(CC) $(CFLAGS) -o $(TARGET) $(TARGET).c readfile.o -lm

readfile.o: readfile.c readfile.h
	$(CC) $(CFLAGS) -c readfile.c

$(TARGET2): $(TARGET2).c sum.s  
	$(CC) $(C32FLAGS) -o $(TARGET2) $(TARGET2).c sum.s


clean:
	$(RM) $(TARGET) $(TARGET2) *.o


