import random

squares = []
# Without List Comprehension
for i in range(1, 10):
    squares.append(i**2)
print(squares)

# With List Comprehension
squares2 = [i**2 for i in range(1, 10)]
print(squares2)

remainders_of_3 = [x % 3 for x in range(1, 10)]
print(remainders_of_3)

movies = ['Star War', 'Casablanca', 'Green Mile', 'The Parent Trap', 'Shawshank Redemption',
          'Ganjana', 'Sanctuary', 'Gattaca', 'Selma']
# Without List Comprehension
movies_start_with_G = []
for title in movies:
    if title.startswith("G"):
        movies_start_with_G.append(title)
print(movies_start_with_G)

# With List Comprehension
movies_start_with_G = [title for title in movies if title.startswith('G')]
print(movies_start_with_G)


# Find the possible Cartesian Product of 2 list using List Comprehension
A = [34, 45]
B = [12, 33]
cartesian_product = [(a, b) for a in A for b in B]
print(cartesian_product)

# Add the 2 lists into a new one  (without List Comprehension)
E = []
for i in range(0, len(A)):
    E.append(A[i] + B[i])

print(E)

# Add the 2  into a new (With List Comprehension)
summed_list = [(A[i]+B[i]) for i in range(len(A))]
print(summed_list)



