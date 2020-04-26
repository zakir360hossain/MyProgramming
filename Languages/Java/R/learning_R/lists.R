# Also a collection of data in R. 1-dim and heterogeneous type is possible.

A <- list(10, 'John', TRUE, 7.89)
A

# List with vectors
roll <- c(101, 102, 103)
names <- c('John', 'Bob', 'Alice')
scores <- c(99.28, 97.45, 91.85)
students <- list(roll, names, scores) # Here the list contains 3 elems. Each elem is a vector
students

# Indexing.
students[1] # returns as a subset of list. Individual elem cannot be accessed
students[[1]] # Returns as a vector. Individual elem can be accessed.
students[[1]][1] # Accessing individual elem
students[c(1, 3)] # returns two subsets

# Naming List subset and subset operator
students_labeled <- list('rollnum'=roll, 'name'=names, 'score'=scores)
students_labeled$rollnum  # Retrieving subset of a list as a vector.
students_labeled[c('rollnum', 'score')] # Also returns towo subsets, but as a vector

# Concatenation
age <- list(c(19, 20, 18))
students_with_age <- c(students_labeled, age)
students_with_age
