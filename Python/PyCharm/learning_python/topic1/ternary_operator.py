from random import random

a, b, = 34, 35

print(a if a < b else b)  # syntax: [on_true] if [expression] else [on_false]

# Using lambda
print((lambda: f"b:{b}", lambda: f"a:{a}")[a < b]())

# Using Dictionary
print({False: f"b:{b}", True: f"a:{a}"}[a >= b])

# Nested
n = random()
print(n)
print("n less than 0" if n < 0 else "n is between 0 and 1" if 0 <= n <= 1 else "n is greater than one")
