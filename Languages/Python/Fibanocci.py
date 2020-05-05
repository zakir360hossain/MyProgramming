# Fibanocci Sequence, Recursion, and Memoization( Explicitly Implemented)
from math import pi

fibanocci_cashe = {}


def fibanocci(n):
    # If we have cashed the value, then return it
    if n in fibanocci_cashe:
        return fibanocci_cashe[n]

    # Compute the nth term
    if n == 1:
        value = 1
    elif n == 2:
        value = 1
    elif n > 2:
        value = fibanocci(n - 1) + fibanocci(n - 2)

    # Cashe the value and return it
    fibanocci_cashe[n] = value
    return value


for n in range(1, 1000000):
    print(n, ":", fibanocci(n))
