# reduce(function, sequence)
# Recursive implementation of a function to a sequence. 
# First obtains a and b (the first 2 elems) and function is applied to them. result is stored
# To apply the function again, a = result and b = 3rd elem. result is stored.
# The process continues until it hits the last elem

from functools import reduce

A = [12, 34, 45, 67, 43, 2, 3]

# The sum of all elems
s = reduce(lambda a, b: a+b, A)
print(s)

# The max elem

m = reduce(lambda a, b: a if a>b else b, A)
print(m)