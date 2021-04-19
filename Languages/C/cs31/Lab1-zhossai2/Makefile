# This makefile builds the prog executable
# it uses several makefile variables
# to compile:  make
# to cleanup: make clean
#

# define the compiler to use
CC = gcc

# define compilation flags, these are ones we will use often:
#   -g: add debugging info into executable
#   -Wall: turn on all warnings
#   -Wvla: warnings for variable length arrays (not applicable to this prog)
CFLAGS = -g -Wall -Wvla 

# any libraries that need to be linked in (none for this program)
LIBS =

# executable file name
TARGET = prog

# C source file name
SRC = $(TARGET).c 

# triggers compilation when run: make
all: $(TARGET)

$(TARGET): $(SRC) $(LIB)
	$(CC) $(CFLAGS) -o $(TARGET) $(SRC) $(LIBS) 

clean:
	$(RM) $(TARGET) $(LIB)
