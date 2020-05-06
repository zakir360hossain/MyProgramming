"""
DEFINITION
One partition (ascending):
Select first element to be the minimum, compare each next element to the first, if
the next element is smaller than the chosen minimum, consider it as the possible minimum, if the 3rd
element is smaller than the 2nd element than that becomes the possible minimum number. When the
smallest number is found it is swap with the first chosen minimum.

Repeat the partition until all elements are sorted. Each partition is one pass

COMPARISON
Number of comparisons = (N-1)+(N-2)+(N-3)...+1 = (N * (N-1))/2
To find the minimum element in the first partition it takes N-1 comparisons, and N decrements by
1 in each subsequent partition, since after each partition one element become into sorted portion
Time Complexity = O(N^2). N is the size of the array

TIME COMPLEXITY
Minimum number of insertion sort comparisons  =  N - 1
Maximum number of insertion sort comparisons  =  1/2(N2 - N)
Average number of insertion sort comparisons  =  1/4(N2 - N)
"""


def selectionSort(arr):
    # Traverse through all the arrays
    for i in range(len(array)):
        # Find the index of the smallest element in the unsorted portion of the array
        minIndex = i
        for j in range(i + 1, len(array)):
            if array[j] < array[minIndex]:
                minIndex = j

        # if the chosen (first) element is the smallest than do not swap
        if minIndex != i:
            array[i], array[minIndex] = array[minIndex], array[i]

    return arr


array = [6, 4, 7, 3, 7, 8, 1]
print(selectionSort(array))
