import math

# Default Argument
def greeting(name='User'):
    print(f"Welcome, {name}!")

greeting()  # <= default case
greeting('Allie')

# Keyword Argument
def expon(a, b):
    return math.pow(a, b)
print(expon(a=24, b=3))  # Both gives the same answers because a and b are now keywords
print(expon(b=3, a=24))


# Arbitrary args
def sayhello(*names):
    for name in names:
        print(f"Hello, {name}")

sayhello('Zakir', 'Allie', 'Julia', 'Amber')



