# Script to list all packages and what other packages are using each package in Homebrew
#i.e. package A -> what packages are using A
brew list --formula -1 | while read cask; do echo -ne "\x1B[1;34m $cask \x1B[0m  Users:"; brew uses $cask --installed | awk '{printf(" %s ", $0)}'; echo ""; done