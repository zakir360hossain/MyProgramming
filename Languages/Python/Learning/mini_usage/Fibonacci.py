# Fibonacci Sequence, Recursion, and Memoization( Explicitly Implemented)

fibonacci_cashe = {}


def fibonacci(n):
    # If we have cashed the value, then return it
    if n in fibonacci_cashe:
        return fibonacci_cashe[n]

    # Compute the nth term
    if n == 1:
        value = 1
    elif n == 2:
        value = 1
    elif n > 2:
        value = fibonacci(n - 1) + fibonacci(n - 2)

    # Cache the value and return it
    fibonacci_cashe[n] = value
    return value


for n in range(1, 100):
    print(n, ":", fibonacci(n))
