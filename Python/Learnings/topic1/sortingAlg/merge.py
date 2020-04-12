"""
The merge sort algorithm is a recursive algorithm, implemented through the use ofg divide-and-conquer technique.

IMPLEMENTATION
Split the array recursively into two halves until each element become an array of itself.
If length is even, divide into half the first time, otherwise split by nearest to the middle
Once it is completely divided into single-element array, begin to merge according to the order

TIME COMPLEXITY
O(NLogN)

"""


def mergSort(arr):
    if len(arr)>1:
        mid = len(arr)//2 # The mid index. // returns floating point
        # Diving into two halves
        left = arr[:mid] # The left side
        right = arr[mid:] # The right side

        # Sorting the two halves recursively
        mergSort(left)
        mergSort(right)

        # beginning to merge both recursive sub-arrays in ascending
        i = j = k = 0
        while len(left)>i and len(right)>j:
            if left[i] < right[j]:
                arr[k] = left[i]
                i+=1
            else:
                arr[k] = right[j]
                j+=1
            k+=1
        # Making sure no element is left in either subarray, at least one become empty
        while len(left)>i:
            arr[k] = left[i]
            i+=1
            k+=1
        while len(right)>j:
            arr[k] = right[j]
            j+=1
            k+=1

arr = [100, 4,13, 45, 6, 78]
mergSort(arr)
print(arr)

