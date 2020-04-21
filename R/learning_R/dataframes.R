# objects in R and used to store tabular data.
# Heterogeneous (for different columns). Similar to a list with multiple vectors. 
# In the case of a data frame, all vectors must have same length.
# Each row is an observation, and each column is a variable/measure
# Can be imported from several types of files with read.table() and read.csv() functions.

# Difference between dataframe and list:
# In list, vectors are stored in row-wise
# In dataframe, vectors are stored in column-wise.

# Creating one
id <- c(101, 102, 103)
name <- c('Bob', 'Alice', 'John')
score <- c(99.28, 97.45, 91.85)
students <- data.frame(id, name, score)
students

# Indexing dataframe
students[2, ] # Entire 2nd row
students[1:2,] # 1st and 2nd row
students[ ,1] # Entire first column
students[2] # 2nd column
students[[3]][1]
students$score
students$score[3]
students[-nrow(students), ] # Everything excepts the last row.


# Dataframe subset functions. Subset returns a subset of a dataframe that meets the condition
subset(students, score>92)
subset(students, score>92 & id<103)
subset(students, score>92, select = c(name, score))# Just the names of the subset that meets the condition
subset(students, score>93, select = name:score) # with seq also works



# cbind and rbind in dataframe
rbind(students, data.frame(id=104, name='Joshua', score=89.35))
cbind(students, age=c(18, 24, 19))

# Edit() function. edit(dataframe, factor, logical)
edit(students) # This opens the dataframe into an external R data editor, XQuartz in MacOS.


