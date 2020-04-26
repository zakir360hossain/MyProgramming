import array

arr1 = array.array('i', [1, 3, 3, 4, 23, 45])  # i => represents int
print(arr1)
arr2 = array.array('u', 'hello John')  # u => Py_UNICODE
print(arr2)

print(array.typecodes)

print(arr1.typecode)

print(arr1.itemsize)  # Returns the number of bytes one item from the Python array takes internally.

arr1.append(14)  # Add to the end
arr1.buffer_info()  # returns tuple that holds memory location and the length of elements
arr1.count(3)  # How many 3's are there in the array?
arr1.extend([2, 3, 4])  # attaches the iterable, param of extend (2, 3, 4), to the end of the array.
arr1.fromlist([23, 1])  # Similar to extend() but this take the iterable from a list
arr1.insert(2, 7)  # insert 7 at index 2.
arr1.index(7)  # return index at the given parameter.
arr1.pop(2)  # Drops item at the given index. 7 will be popped.
arr1.remove(3)  # removes the first occurrence
arr1.reverse()

# Slicing
print(arr1)
print(arr1[4:6])  # Value at index 4, 5, but not 6.
print(arr1[6:])  # 5th index to the end, includes last one
print(arr1[:3])  # exclude the value at 3rd index
print(arr1[0:8:3])  # first, 3rd, 5th, 7th values are returned. Skips every two. i.e 2,3,5,4 => 2, 4 returned
print(arr1 * 2)  # i.e 2,4,5 => 2,4,5,2,4,5
