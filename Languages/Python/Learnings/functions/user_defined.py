

# Function with docstring
def remainder(a, b):
    """This function finds the remainder when a is divided by b"""
    return a % b
print(remainder(9, 3))
print(remainder.__doc__)


def cube_volume(l, w, h):
    volume = l * w * h

    def inner():
        print(f"The volume is {volume}")

    inner()  # Calling the inner function for the cube_volume so when the outer function (cube_volume) is called
    # it will print the value that is inside the inner function


# inner is the nested function of cube_volume. inner function does not exist outside the cube_function

cube_volume(12, 15, 20)
