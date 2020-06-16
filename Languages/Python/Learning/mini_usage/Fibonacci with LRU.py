from functools import lru_cache #lru  (Least Recently Used Cashe)

@lru_cache(maxsize=1000000)
def fibonacci(n):
    # Check that the input is a positive integer
    if type(n) !=int:
        raise TypeError("Index n must be a positive integer.")
    if n < 1:
        raise TypeError("Index n cannot be a negative number.")

    if n == 1:
        return 1
    elif n == 2:
        return 1
    elif n > 2:
        return fibonacci(n - 1) + fibonacci(n - 2)


for n in range(1, 1000):
    print(n, ":", fibonacci(n))

# Ratio between two consecutive terms in Fibanocci Sequence
for n in range(1, 101):
    fibonacci(n + 1) / fibonacci(n)
