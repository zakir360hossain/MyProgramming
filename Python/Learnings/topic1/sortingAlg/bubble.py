"""
One partition (ascending)
Compare each element with the next element and push the greater one to the right and continue to compare until the
biggest element is "bubbled" to the right

Repeat the partition with the remaining elements of the array (excluding the elements that are already "bubbled")

TIME COMPLEXITY
O(N^2)
"""


def bubbleSort(arr):
    for i in range(len(arr)):  # Traverse through all the elements in the list

        # each time i-th element put into "bubbles" into correct place, j's range will decrement
        for j in range(0, len(arr) - i - 1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr

arr = [8, 1, 34 ,90, 123, 145, 67]
print(bubbleSort(arr))



