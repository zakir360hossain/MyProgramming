# Everything in R is an object.
# R executes line by line. This makes the debugging easier. It is dynamic type.
# + is not concatenation. Cannot concat string with number using +.
# R can have comma or nothing for ending statement.
# Variable reassignment is allowed.

print('Hello R')

# Unique operators
2 ** 4 # power
2 ^ 3 # this works to
2 ^ .5 # can have floating with out the 0
14 %% 4 # Modulus

8 %/% 3 # Integer division
8 / 3 # Not integer division, gives floating number

# Variables
num = 45
typeof(num)
storage.mode(num) # Also gives the type
mode(num) # Classification of objects, i.e. 'numeric', 'character', or 'logical'
class(num) # Also the classfication of objects
num2 = 4.5
class(num2)

name = "Jonny"
typeof(name) # character. Equivalent to string
class(name) # for type character, class is also character
is.character(name)

x = as.integer(10)
typeof(x)
x2 = 10L # Also integer.
typeof(x2) 

com <- 3 + 4i # complex number
class(com)




#1. Ways to assign variables:
x <- 50 # values points to the var
x -> 50 # var assign to the value
x = 50 # This is not available in console
assign('x', 50)
a <- b <- c <- pi # All vars are assigned with pi. Chaining assignment

print(x + x)
print(a)



# Builtin vectors:
let <- letters # All lowercase alphabets
print(let)
Upperlet <- LETTERS # Uppercase
print(Upperlet)
month <- month.name
print(month)
monthAbb <- month.abb # Abbreviation of months
print(monthAbb)



# Unique logical operator
TRUE & FALSE #this works as well. 
TRUE &&FALSE #common one is also available.
TRUE | FALSE # This is OR in R
FALSE || FALSE # This one cannot be used int vectorized operations



# Sequence generation:
# 1. With ':'
x <- 1:10 # created 10 elems, 1 to 10.
x

x <- 1:10 * 2 # 10 elems and each elem is doubled.
x

x <- 5
1:x - 1 # Created 5 elems and each elem is subtracted by 1.
x
1:(x - 1) # Created 4 elems, 1 to 4.
x

#2. With seq function (overloaded). seq(begin, end, step, length)

x <- seq(1, 5) # 1 to 5
x <- seq(from = 1, to = 5) # Same thing.
x_rev <- seq(5, 1) # From 5 to one
x <- seq(1, 10, 2) # step = 2, cannot be 0.
x <- seq(1, 10, by = 2) # Same as previous

# param length is the number of elements to be generated, the elements will automatically
# resize to make the length number of elements. Will also account if other params (not step) are given.
x <- seq(1, 20, length = 8) #
x
x <- seq(1.0, 2.0, 0.2) # Floating


# Element Replication.
#rep(object/elem, replication factor | each)
# Param elem -> can be var, sequence
# Param times -> replication factor
# Param each -> number of times each sum-elem to be replicated.
z <- rep(2, times = 5)
z

z <- rep('h', times = 3)
x <- 1:3
z <- rep(x, each = 4)
z

z <- rep(x, times = 3, each = 2) #
z

z <- rep(2, times = 3, each = 2) #
z





# Control Structure
#1.Sequential -> Run line be line in R

#2.Selection is not unique except ifelse(). #ifelse(condition, statement if true, statement if false)
x <- TRUE
ifelse(x, "True", "False")
x <- 6
ifelse(x %% 2 == 0, 'Even', 'Odd')

#3. for loop
for (i in 1:10) {
  print(i)
}

x <- letters # this is an iterable
for (let in x[1:5]) { # First five letters.
  print(let)
}


# 3. While loop
x <- 1
while (x <= 6) {
  print(x)
  x <- x + 1 # R does not have incremental operator (++).
}

#4. repeat loop
i <- 1
repeat {
  print(i)
  if (i > 4)
    break
  i <- i + 1
}

# With next
for (i in 1:10) {
  if (i %% 2 == 0)
    next # If the condition is true, skip the next statement and go to the next iteration
  print(i) # all odds are printed.
}




