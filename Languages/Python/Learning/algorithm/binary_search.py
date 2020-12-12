"""
This program contains the implementation of the binary search algorithm
"""



#Recursive
"""
iterable: a sorted iterable object
target: element to be searched in the iterable
low: lower boundary of the iterable
high: upper boundary of the iterable
return index of target if it's present in the iterable
"""
def recursive_bin_search(array, target, low, high):

    if high >= low:
        mid = (high + low) // 2
        if array[mid] == target:
            return mid
        elif array[mid] > target:
            return recursive_bin_search(array, target, low, mid - 1)
        else:
            return recursive_bin_search(array, target, mid + 1, high)

    else: "Target is not contained in the array"


#Iterative
def iterative_bin_search(array, target):
    low = 0
    high = len(array) - 1
    mid = 0

    while low<=high:
        mid = (high+low)//2
        #Check if the target is present at the mid index
        if array[mid] < target: low = mid + 1
        #If the target is greater, ignore the left half
        elif array[mid]> target: high= mid - 1
        #If the target is smaller, ignore the right half.
        else: return mid
    return -1

x = [1, 2, 4, 5, 10, 10, 17]
target = 17

print(recursive_bin_search(x, target, 0, len(x) - 1))
print(iterative_bin_search(x, target))