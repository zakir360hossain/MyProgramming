"""
Quick is one of the recursive or divide-and-conquer algorithm like merge sort
DEFINITION
One partition (ascending):
Choose a pivot and swap it with the last element. Select the first item from the left of the array that is larger than
the pivot and select the first element from the right, excluding the pivot, that is smaller than the pivot and
swap them. Stop when index from left > index from right. Swap the pivot with the element of the last left index.
The element of the last left index is the new pivot and the original pivot is in the sorted position

Repeat the partition

How to choose the right pivot in the first place?
The most used approach is with median-of-three
sort the first, mid, and last elements of the array and choose the new mid to be the pivot.

COMPARISON
Number of comparisons = (N-1)+(N-2)+(N-3)...+1 = (N * (N-1))/2
To find the minimum element in the first partition it takes N-1 comparisons, and N decrements by
1 in each subsequent partition, since after each partition one element become into sorted portion
Time Complexity = O(N^2). N is the size of the array

TIME
Minimum number of insertion sort comparisons  =  N - 1
Maximum number of insertion sort comparisons  =  1/2(N2 - N)
Average number of insertion sort comparisons  =  1/4(N2 - N)
"""

def partition(arr, low, high):
    i = low -1 # index of the smaller element
    pivot = arr[high]

    for j in range(low, high):
        if arr[j] <= pivot:
            i+=1
            arr[i], arr[j] = arr[j], arr[i]
    arr[i+1], arr[high] = arr[high], arr[i+1]
    return i+1

# low = starting index, high = ending index
def quickSort(arr, low, high):
    if low<high:
        # parIndex is partitioning index, arr[parIndex] is now at right place
        parIndex = partition(arr, low, high)

        # Recursively sort elements before and after partition
        quickSort(arr, low, parIndex-1)
        quickSort(arr, parIndex+1, high)

arr = [10, 8, 7, 9, 17, 13, 5, 11, 5, 89, 0, 12]
quickSort(arr, 0, len(arr)-1)
print(arr)

