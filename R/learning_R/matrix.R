# 2-d vectors
# dimentional attribute is of length 2
# Elements of same type.
# By default, it is constructed using column-wise, not row-wise
#attributes:
#data -> elements, NA by default.
#nrow -> number of rows
#ncol -> number of columns
#byrow -> consrtuct by row [boolean], false by default
#dimnames ->




# Initialize matrix 
A <- matrix(4, nrow = 2, ncol = 3) # All slots will be filled with 4
A
dim(A) # returns dimension in row x column

B <-
  matrix(c(1, 2, 3, 4, 5, 6)) # Created a 6 x 1 vector (6 rows  because it is column-wise)
B

C <- matrix(c(1, 2, 3, 4, 5, 6), 2, 3, TRUE)
C
nrow(C) # Returns number of rows
ncol(C) # Returns number of cols
length(C) # Number of elems in the matrix

# Can also be created with dim
M1 <- c(1, 2, 3, 4, 5, 6)
dim(M1) <- c(2, 3) # Yes, here 2 and 3 are rows and columns
M1

# matrix with seq
M2 <- matrix(1:12, 4, 3)
M2

# Matrix diagonal diag function. diag(x, row, col), where x is the diagonal value
M3 <- diag(1, 3, 3) # Diagonal filled with 1
M3
M3 <- diag(3, 4, 5) # Diagonal filled with 3
M3
M3 <-
  diag(1:5) # diagonal with 1 to 5 and the rests are 0. row and col are figured from the seq range
M3
diag(M3) # returns the diagonal elements. This is a square matrix (3x3)


# Assign names to rows and columns
M4 <- matrix(1:12, 4, 3, TRUE)
rownames(M4) <- c(1, 2, 3, 4)
colnames(M4) <- c('A', 'B', 'C')
M4
diag(M4) # This is not a square matrix. This will return a diagonal that starts with (0,0).


# Indexing matrices
A2 <- matrix(1:10, 5, 2)
A2
A2[1, 2] # [row, col]
A2[1,] # Entire first row
A2[-1, ] # All the rows excepts first one
A2[, 2] # Entire 2nd col
A2[nrow(A),] # entire last row. Otherway with ncol() for the column
A2[1:4, 1:2] # 4 rows and 2 columns
A2[1:nrow(A), 1:ncol(A)] # Entire matrix
A2[c(1, 3),] # Entire first and third rows
A2[1, 2] = 9 # reassigning
A2

A3 = A2[-nrow(A2),] #Last col is deleted. Since negative is for exclusion, rows or cols can be deleted this way.
A3
nrow(A3)
ncol(A3)
dim(A3)



# rbind (row bind) and cbind functions. Combines a vector toa matrxi or two matrices.
A4 <- matrix(1:9, 3, 3, TRUE)
A4
A5 <- rbind(A4, c(34, 45, 44)) # This will combine A5 with A4. A5 = A4 + a new row (the given vector)
A5
dim(A5)
# cbind. Similar to rbind, except it combines in column-wise
A6 <- cbind(A5, matrix((0:3), nrow = 4, ncol = 1)) # By now, the matrix A6 is 4x4.
A6
dim(A6)



# Operations on matrices
A7 <- matrix(1:9, 3, 3, TRUE)
A8 <- matrix(1:9, 3, 3, TRUE)
A7+A8 # Addition performed element by element.
A7*A8 # performed element by element.
A7/A8 # Elem by elem
A7%*%A8 # Matrix multiplication
t(A7) # Transpose of A7
# solve(A7) -> Inverse of the matrix, if convertible. This one is not convertible.

#Matrix functions:
rowSums(A8) # Returns the sum of each row. The returning type is a vector with elems=nrow
apply(A8, 1, sum) # Same as previous. 1 signifies row
colSums(A8) # of each column, instead of row
apply(A8, 2, sum) # Same as previous. 2 signifies column

rowMeans(A8) # Returns a vector of the means of each row
colMeans(A8) # For columns


