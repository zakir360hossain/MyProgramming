# While loop
a = 10
while a > 0:
    print(a)
    a -= 2
    if a == 2:
        break
else:
    print("Broke at 2")

# For loop
for i in [1, 2, 4, 5]:
    n = 2
    if n == i:
        print("n is in the list")
        break

# Nested loop
for i in range(1, 11):
    for j in range(i):
        print(j + 1)

# Enumerate is useful when having to deal with index. Avoid using a counter
for i, num in enumerate(range(1, 20, 2)):
    print(i, num)