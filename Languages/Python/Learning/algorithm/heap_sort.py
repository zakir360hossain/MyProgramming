"""
heap: an ordered binary tree
max heap :a Complete Binary Tree where items are stored in a special order such that value in a parent node
is greater(or smaller) than the values in its two children nodes. The former is called as max heap and the latter
is called min heap. The heap can be represented by binary tree or array.

If the parent node is stored at index I, the left child can be calculated by 2 * I + 1 and right child by 2 * I + 2
(assuming the indexing starts at 0).

build-max-heap: creates a max heap from the unsorted array
heapify: similar to build-max-heap, but it assumes the array is already sorted


1. Create max heap
2. Remove the largest from the max heap
3. Place item in sorted partition


TIME COMPLEXITY
sorting : O(NlogN)
max heap :  O(N)
heapify :  O(logN), called n-1 times

"""


# To heapify subtree rooted at index i.
# n is size of heap
def heapify(arr, n, i):
    largest = i # Initialize largest as root
    l = 2 * i + 1     # left child index = 2*i + 1
    r = 2 * i + 2     # right child = 2*i + 2

    # See if left child of root exists and is
    # greater than root
    if l < n and arr[i] < arr[l]:
        largest = l

    # See if right child of root exists and is
    # greater than root
    if r < n and arr[largest] < arr[r]:
        largest = r

        # Change root, if needed
    if largest != i:
        arr[i],arr[largest] = arr[largest],arr[i] # swap

        # Heapify the root.
        heapify(arr, n, largest)

# The main function to sort an array of given size
def heapSort(arr):
    n = len(arr)

    # Build a max heap.
    for i in range(n, -1, -1):
        heapify(arr, n, i)

        # One by one extract elements
    for i in range(n-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i] # swap
        heapify(arr, i, 0)

    return arr

arr = [3, 12, 1, 2, 45, 23, 0, 67]
print(heapSort(arr))