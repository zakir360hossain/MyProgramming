# map(function, iterable)

# Return True or False for each value
lst1 = list(map(lambda x: x % 2 == 0, [1, 2, 3, 4, 5, 7]))
print(lst1)

arr = [45, 6, 7, 7]
arr2 = list(map(lambda x: x * 5, arr))
print(arr2)

# Each element is the sum of itself
def elemProd(member):
    return member * member

arr3 = [1, 4, 5, 2, 5]
print(list(map(elemProd, arr3)))


# Each element is the power of itself
def powSelf(member):
    return member ** member

arr4 = [2, 3, 4, 5, 6]
print(list(map(powSelf, arr4)))

# Each element is the binary equivalent of each element. The return type is string
def deciToBin(num):
    return bin(num).replace("0b", "")
    # Algorithmically
    # if num>1:
    #
    #     deciToBin(num//2)
    # binary = str(num%2)
    # print(binary, end='')

a = [1, 3, 4, 6, 734, 45]
print(list(map(deciToBin, a)))
