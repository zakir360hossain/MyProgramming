# Checks if there is an empty object in an iterable.
# Returns true if no element/object is empty, otherwise false

a = {'A', 'B', 'C'}
print(all(a))


a = ['A', 'B', 'C', '']
print(all(a))

c = [1, 2, 3, 4, None]
print(all(c)) # False, None is considered empty