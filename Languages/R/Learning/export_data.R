# Exporting dataframe to a csv file

id <- c(101,102,103)
name <-c('Bob', 'Alice', 'John')
score <- c(78.25, 89.35, 90.9)
students <-data.frame(id, name, score)
students
write.csv(students, file='data/students.csv' )
