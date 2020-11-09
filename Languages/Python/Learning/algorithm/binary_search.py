"""
This program contains the implementation of the binary search algorithm
"""

"""
iterable: a sorted iterable object
target: element to be searched in the iterable
low: lower boundary of the iterable
high: upper boundary of the iterable
return index of target if it's present in the iterable
"""

"Recursive"
def bin_search(array, target, low, high):

    if high >= low:
        mid = (high + low) // 2
        if target == array(mid):
            return mid
        elif target < mid:
            return bin_search(array, target, low, mid - 1)
        else:
            return bin_search(array, target, low, mid + 1)

    else: "Target is not contained in the array"


x = [1, 2, 4, 5, 10, 10, 17]
target = 17

print(bin_search())




