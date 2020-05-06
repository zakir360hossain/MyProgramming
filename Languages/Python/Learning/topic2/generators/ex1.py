"""
A python generator is an iterable, like a list or tuple. It generates sequence
that is iterable but cannot be indexed. In this example, the counter() is the generator
"""
def counter():
    i = 1
    while i <= 100:
        yield i
        i += 2

for i in counter():
    print(i)

