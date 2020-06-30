import array

"""With the builtin array module"""
print(type(array))
A = array.array('i', [1, 3, 3, 4, 23, 45])  # i => represents int
print(A)
arr2 = array.array('u', 'hello John')  # u => Py_UNICODE
print(arr2)

print(array.typecodes)

print(A.typecode)

print(A.itemsize)  # Returns the number of bytes one item from the Python array takes internally.

A.append(14)  # Add to the end
A.buffer_info()  # returns tuple that holds memory location and the length of elements
A.count(3)  # How many 3's are there in the array?
A.extend([2, 3, 4])  # attaches the iterable, param of extend (2, 3, 4), to the end of the array.
A.fromlist([23, 1])  # Similar to extend() but this take the iterable from a list
A.insert(2, 7)  # insert 7 at index 2.
A.index(7)  # return index at the given parameter.
A.pop(2)  # Drops item at the given index. 7 will be popped.
A.remove(3)  # removes the first occurrence
A.reverse()

# Slicing
print(A)
print(A[4:6])  # Value at index 4, 5, but not 6.
print(A[6:])  # 5th index to the end, includes last one
print(A[:3])  # exclude the value at 3rd index
print(A[0:8:3])  # first, 3rd, 5th, 7th values are returned. Skips every two. i.e 2,3,5,4 => 2, 4 returned
print(A * 2)  # i.e 2,4,5 => 2,4,5,2,4,5


"""With out the array module"""
B = [1, 34, 45, 567, 567]
for elem in B: print(elem)
