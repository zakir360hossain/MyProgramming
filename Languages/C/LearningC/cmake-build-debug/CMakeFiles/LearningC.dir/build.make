# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.17

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /Applications/CLion.app/Contents/bin/cmake/mac/bin/cmake

# The command to remove a file.
RM = /Applications/CLion.app/Contents/bin/cmake/mac/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/zakirhossain/Documents/Code/MyProgramming/Languages/C/LearningC

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/zakirhossain/Documents/Code/MyProgramming/Languages/C/LearningC/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/LearningC.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/LearningC.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/LearningC.dir/flags.make

CMakeFiles/LearningC.dir/main.c.o: CMakeFiles/LearningC.dir/flags.make
CMakeFiles/LearningC.dir/main.c.o: ../main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/zakirhossain/Documents/Code/MyProgramming/Languages/C/LearningC/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/LearningC.dir/main.c.o"
	/Library/Developer/CommandLineTools/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/LearningC.dir/main.c.o   -c /Users/zakirhossain/Documents/Code/MyProgramming/Languages/C/LearningC/main.c

CMakeFiles/LearningC.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/LearningC.dir/main.c.i"
	/Library/Developer/CommandLineTools/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/zakirhossain/Documents/Code/MyProgramming/Languages/C/LearningC/main.c > CMakeFiles/LearningC.dir/main.c.i

CMakeFiles/LearningC.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/LearningC.dir/main.c.s"
	/Library/Developer/CommandLineTools/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/zakirhossain/Documents/Code/MyProgramming/Languages/C/LearningC/main.c -o CMakeFiles/LearningC.dir/main.c.s

# Object files for target LearningC
LearningC_OBJECTS = \
"CMakeFiles/LearningC.dir/main.c.o"

# External object files for target LearningC
LearningC_EXTERNAL_OBJECTS =

LearningC: CMakeFiles/LearningC.dir/main.c.o
LearningC: CMakeFiles/LearningC.dir/build.make
LearningC: CMakeFiles/LearningC.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/zakirhossain/Documents/Code/MyProgramming/Languages/C/LearningC/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable LearningC"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/LearningC.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/LearningC.dir/build: LearningC

.PHONY : CMakeFiles/LearningC.dir/build

CMakeFiles/LearningC.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/LearningC.dir/cmake_clean.cmake
.PHONY : CMakeFiles/LearningC.dir/clean

CMakeFiles/LearningC.dir/depend:
	cd /Users/zakirhossain/Documents/Code/MyProgramming/Languages/C/LearningC/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/zakirhossain/Documents/Code/MyProgramming/Languages/C/LearningC /Users/zakirhossain/Documents/Code/MyProgramming/Languages/C/LearningC /Users/zakirhossain/Documents/Code/MyProgramming/Languages/C/LearningC/cmake-build-debug /Users/zakirhossain/Documents/Code/MyProgramming/Languages/C/LearningC/cmake-build-debug /Users/zakirhossain/Documents/Code/MyProgramming/Languages/C/LearningC/cmake-build-debug/CMakeFiles/LearningC.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/LearningC.dir/depend

