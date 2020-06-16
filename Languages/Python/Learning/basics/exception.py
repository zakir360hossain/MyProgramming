# If try block is computable, then proceeds, else computes the except block.

def div(a, b):
    return a/b
try:
    print(div(10, 0))

except ZeroDivisionError:
    print("Cannot divide by a negative number")

# This will print anything, regardless what above code is doing
finally:
    print("Your program is done here")


try:
    print(div(10, 5))
except ZeroDivisionError:
    print("Cannot divide by a negative number")
finally:
    print("Program is done here")