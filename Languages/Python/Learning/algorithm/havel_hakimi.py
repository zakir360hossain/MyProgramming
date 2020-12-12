"""
This program implements the Havel-Hakimi Algorithm, which finds if a degree sequence can form a a valid graph 
"""

def graphExist(a):
    # Keep performing the operations until one of the stopping condition is met
    while True:
        #Sort the list in a non-increasing order
        a = sorted(a, reverse=True)

        # Check if all the elements are equal to 0
        if a[0]==0 and a[len(a)-1]==0:
            return True
        #Store the firsr elements in a variable and delete it from the list
        v = a[0]
        a = a[1:]

        # Check if enough element are present in the list
        if v>len(a): return False
        # Subtract first element from the next v elements
        for i in range(v):
            a[i] -= 1
            # Check if negative element is encountered after subtraction
            if a[i]<0: return False



a = [6, 5, 4, 3, 2, 2]
print(graphExist(a))
a = [3, 3, 3, 3]
b = [3, 3, 3]
c = [4, 3, 2, 0]
print(graphExist(a))
print(graphExist(b))
print(graphExist(c))

