# Used to represent categorical data.
# Treated as integer vector, having levels
# Factors are self describing, i.e. a vector of "female" and "male" is more descriptive than "0" and "1"

x <- factor(c('Male', 'Female', 'Male', 'Male', "Male"))
x # Returns the elements and the levels (male and female)
table(x) # Returns count of elements in each level
