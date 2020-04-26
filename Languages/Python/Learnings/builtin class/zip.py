# No args
print(set(zip()))

# Single args
for i in zip([1, 2, 3]):
    print(i)


# Double args
for i in zip([1, 2, 3, 4], ['Apple', 'Mango', 'Banana', 'Peach']):
    print(i)

# Multi args
for i in zip([1, 2, 3, 4], ['Indonesia', 'Malaysia', 'China', 'Ecuador'],
             ['Jakarta', 'Kuala Lumpur', 'Beijing', 'Quito']):
    print(i)

# Stop when index is over
for i in zip([1, 2], ['a,', 'b', 'c']):
    print(i)

# To go all the way, even when the index is over
from itertools import zip_longest
for i in zip_longest([1, 2], ['a,', 'b', 'c']):
    print(i)

# Unzip
data = zip([231, 325, 345, 546], ['John', 'Sooraj', 'Arman', 'Nicole'])
id, name = zip(*data)
print(id, name)
