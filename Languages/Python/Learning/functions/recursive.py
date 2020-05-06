# Recursion function is a function that calls itself until a condition for the recusion is
# reached.

# Returns nth factorial


def factorial(n):
    if n == 1:
        return 1
    return n * factorial(n - 1)


# Returns the product of all the numbers that are multple of n


