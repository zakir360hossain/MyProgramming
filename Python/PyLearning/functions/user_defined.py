# User defined function with docstring
def remainder(a, b):
    """This function finds the remainder when a is divided by b"""
    return a % b
print(remainder(9, 3))
print(remainder.__doc__)