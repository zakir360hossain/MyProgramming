# bytearray() methods returns a bytearray object which is an array of given bytes. It gives a mutable sequence
# of integers in the range 0 <= x < 256.

# bytearray(source, encoding, errors)
    # source[optional]: Initializes the array of bytes
    # encoding[optional]: Encoding of the string
    # errors[optional]: Takes action when encoding fails

str = "Henderson High School"

# encoding the string with unicode 8 and 16
array1 = bytearray(str, 'utf-8')
array2 = bytearray(str, 'utf-16')

print(array1)
print(array2)


# Creates bytearray from byte literal
arr1 = bytearray(b"abcd")
# iterating the value
for value in arr1:
    print(value)

# Create a bytearray object
arr2 = bytearray(b"aaaacccc")
# count bytes from the buffer
print("Count of c is:", arr2.count(b"c"))

list = [1, 2, 3, 4]
# iterable as source
array = bytearray(list)
print(array)
print("Count of bytes:", len(array))


print(bytearray(11))