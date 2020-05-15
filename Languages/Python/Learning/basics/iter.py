arr1 = [1, 232, 345, 345, 2346]

# This is because a list is iterable
for num in iter(arr1):
    print(num)

# A tuple is also iterable
arr2 = {1, 2, 45, 56}
for num in iter(arr2):
    print(num)

student = {101: "William", 102: "Henry", 103: "Joshua", 104: "George"}

# A dictionary is also iterable (specifically its keys or values)
# By default, a dictionary is iterated through the keys.
for s in iter(student):
    print(s)
