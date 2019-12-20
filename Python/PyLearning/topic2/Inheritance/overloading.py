# Python does not support overloading
# It calls the latest defined function

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
