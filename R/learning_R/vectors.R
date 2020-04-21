#The most basic datatype in R. They are contiguous cells containing data
#Six atomic/basic vector types: integer, double, logical, character, complex, raw (raw data)

#Single values or strings are still vectors of length 1
#All the elements of vector must be of same type.
# If there is one string in a vector and the rest are other types, then all will be converted to string.
# INDEX STARTS WITH ONE, NOT ZERO

# Creating vector with c (combine or concatenate) funtion.
A <- c(10, 20, 30, 40)
A
typeof(A)
length(A)
assign('B', c(1.5, 2.5, 3.7, 4.8, 5.8))
B
logicalVec <- c(T, F, F, T) # Can also be put TRUE or FALSE

C <- 1:6 # A vector
C <- seq(1, 10, 2) # A vector with step 2
D <- rep(10, times = 3)

# concatenates with c function
E <- c(C, D)

# With vector function to intialize a vector
A <- vector('numeric', length = 4)


grade <- c(90, 91, 68, 95, 96, 100)
grade[1]
grade[1:4]
grade[c(1, 3, 4)] # Returns elem at 1, 3, 4
grade[-2] # Returns all the elements except the one at the given index
grade[length(x)] = 99 # changes the last element
grade[-1] = 97 # Changes all the elements to 97 except the one in the given index.

a <- c(T, F, T, T, F, T)
# Retrieving numeric vector elems with logical vector
grade[a] # those elems of grade are returned which has the corresponding TRUE index of vector a.
#90, 68, 95, 100
# If the logical vector is less in length, it will be repeated until reaches the numeric vector length.
# In Round-robin fashion

# With for loop
for (i in 1:length(grade)) {
  # If range is greater than the length of a vector, it just retuns NA for the rest.
  print(grade[i])
}

# with seq_along() function. Sequence along a the vector
for (i in seq_along(grade)) {
  print(grade[i])
}

# With Python fashion
for (g in grade) {
  print(g)
}

# Matching Operator. Checks wheter element is in the vector. Can also check with another vector.
90 %in% grade


# Arithmetic operations on vector
score <- c(10, 45, 30, 50)
score + 2 # Scaled by adding 2 to each elem. Original has not changed
sqrt(score) # Square root of each elem.
score = score * 2 # Changes original.

score2 <- c(2, 3, 4, 5)
score + score2 # Adds the corresponding elements. If one vector has shorter length. It only gives
# a warning, but continues in Round-robin fashion.


# Methods:
sum(score2)
prod(score2) # Products of all elements
max(score)
min(score)
rev(score2) # Reverses
sort(score)
sort(score, decreasing = TRUE)

score %*% score2 # Dot products of two vectors
crossprod(score, score2) # Also Retuns dot products
score %o% score2 # The outer products of two vectors
tcrossprod(score, score2) # Also returns the outer product





# Vector Coersion
x <- c(10, 'John', 20, 30.75)
# R will coerce to turn this vector into the most convertible object type. All characters in this case
x
x <-
  c(10, TRUE) # Here TRUE will be implicitly coerced to integer (1). Which is easy.
x
x <-
  c('John', TRUE) # Here TRUE will be implicitly coerced to character. Again, the most easy option.

# When R cannot coerce
x <- 0:5
class(x)
as.logical(x) # converted into logical type. 0 will be treated FALSE, and all the rest will be TRUE

x <- c('John', 'Jack', 'Bob')

as.numeric(a) # Explicitly converting this vector will convert all elems to NA.



# Logical Operators on vectors. The result is often a logical vector.
x <- c(10, 45, 30, 50, 35)
y <-
  x > 30 # vector y is logical, elems are depending on the condition.
y

y <-
  x > 30 &
  x < 40 # Here, vector y will contain a TRUE elem only at the index of elem 35 of vector x.

a <- c(20, 15, 25, 65, 5)
x < y

which(x > 30) # Which element (s) of x are greater than 30. Returns the indices.
x[which(x > 30)] # To extract the elements, not the indices.

