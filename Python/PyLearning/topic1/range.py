# The range function always travers to the right from 0, and does not travers left.

# One params => (stop)
print(tuple(range(12)))
# Output: (0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
print(tuple(range(0, 25, 5)))
# output:(0, 5, 10, 15, 20)

# Two params => (start, stop)
print(list(range(1, 23)))
# [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22]

# Three params => (start, stop, interval)
print(list(range(0, 25, 5)))
# Output:[0, 5, 10, 15, 20]
