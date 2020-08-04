# Python does not support overloading
# When overloaded, it calls the latest defined function

def multiply(a, b):
    prod = a * b
    print(prod)


def multiply(a, b, c):
    prod = a * b * c
    print(prod)


try:
    multiply(2, 3)
except Exception:
    print("A 3rd parameter is missing")

# multiply(2, 3) => Missing argument error because the latest multiply()function take 3 arguments

multiply(2, 4, 5)  # Correct


# Overloading is only possible for methods/constructor if the methods is not rewritten and one or more statements
# are put to behave differently.

class Number:
    def guess(self, num):
        if num < 0:
            print("The number is negative")
        else:
            print("The number is positive")


number1 = Number()
# Here they will have different output, because of different inputs
number1.guess(-5)
number1.guess(6)
