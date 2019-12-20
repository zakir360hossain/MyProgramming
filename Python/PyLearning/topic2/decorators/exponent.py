import math
import time


# Using decorators to see the time each function takes to complete the execution.

def timing(func):
    def wrapper(*args, **kwargs):
        start = time.time()
        result = func(*args, **kwargs)
        end = time.time()

        print(f"It took {(end - start) * 1000} mil seconds.")
        return result

    return wrapper


@timing  # Decoration through Pie Syntax
def square(bases):
    result = []
    for i in bases:
        result.append(int((math.pow(i, 2))))
    print(result)


@timing  # Decoration
def cube(bases):
    result = []
    for i in bases:
        result.append(int(math.pow(i, 3)))
    print(result)


mantissa_array = range(1, 100000)

square(mantissa_array)
cube(mantissa_array)
