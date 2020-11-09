"""
DEFINITION
One partition:
One partition (ascending):
Choose the first element to be the sorted portion, and 2nd element for making comparison,
compare the next element to the sorted portion and insert it in the appropriate index of the sorted portion.
Sorted portion has increment by 1, unsorted has decremented by 1

Repeat the partition by comparing the next element from the unsorted portion to the elements in the newly
sorted portion of the array. Each partition is one pass

COMPARISON
Number of comparisons = (N-1)+(N-2)+(N-3)...+1 = (N * (N-1))/2
To insert the first element in the first partition it takes N-1 comparisons, and N decrements by
1 in each subsequent partition, since after each partition one element become into sorted portion

TIME COMPLEXITY
Time Complexity = O(N^2). N is the size of the array
Minimum number of insertion sort comparisons  =  N - 1
Maximum number of insertion sort comparisons  =  1/2(N2 - N)
Average number of insertion sort comparisons  =  1/4(N2 - N)
"""

def insertionSort(arr):
    # arr[0[ is the assumed portion of array that is sorted
    for i in range(1, len(arr)):
        # element to be compared
        current  = arr[i]

        # Compare the current element with the sorted portion and swap.
        while i>0 and arr[i-1] > arr[i]:
            arr[i] = arr[i-1]
            i-=1
            arr[i] = current

    return arr

array = [4, 6, 7, 3, 8, 24, 67]
print(insertionSort(array))