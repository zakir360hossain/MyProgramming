num = [2, 4, 5, 6, 7]

# Convert the list into an iterable
iter_num = iter(num)

# They are same
print(iter_num.__next__())
print(next(iter_num))

# Next() preserves the state of the last value. Each time the next() methods is called, the next value in the iterable
# will be printed


