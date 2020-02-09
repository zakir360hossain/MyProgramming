# Will print the except block if this fails
try:
    print(1 / 2)

# This will be printed only if the try block is faild
except ZeroDivisionError:
    print("Cannot divide by a negative number")

# This will print anything, regardless what above code is doing
finally:
    print("Your program is done here")
