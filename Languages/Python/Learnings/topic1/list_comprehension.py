import random

squares = []
# Without List Comprehension
for i in range(1, 101):
    squares.append(i**2)  # Double ** = Exponent
print(squares)

# With List Comprehension
squares2 = [i**2 for i in range(1, 101)]
print(squares2)

remainders_of_11 = [x**2 % 11 for x in range(1, 101)]
print(remainders_of_11)

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

movies_with_year = [("Citizen Kane ", 1941), ("Spirited Away ", 2001), ("It's a Wonderful Life", 1946),
                    ("Gattaca", 1997), ("NO Country for Old Men", 2007), ("Rear Window", 1954),
                    ("The Lord of the Rings: The fellowship of the Rings", 2002), ("Groundhog Day", 1993 ),
                    ("Close Encounters of the Third King", 1977), ("The Royal Tenenbaums", 2001), ("The Aviator", 2004),
                    ("Raiders of the Lost Ark", 1981)]

# Find movies that were released before 2000 using List Comprehension
movies_before_2000 = [title for (title, year) in movies_with_year if year < 2000]
print(movies_before_2000)

# Find the possible Cartesian Product of four sets using List Comprehension
set_A = [34, 45, 67, 56]
set_B = [12, 33, 45, 14]
set_C = [91, 25, 24, 11]
set_D = [46, 99, 16, 10]
cartesian_product = [(a, b, c, d) for a in set_A for b in set_B for c in set_C for d in set_D ]
print(cartesian_product)

# Add the four sets into a new set (without List Comprehension)
set_E = []
for i in range(0, len(set_A)):
    set_E.append(set_A[i] + set_B[i] + set_C[i] + set_D[i])

print(set_E)

# Add the four sets into a new set (With List Comprehension)
summed_list = [(set_A[i]+set_B[i]+set_C[i]+set_D[i]) for i in range(len(set_A)) ]
print(summed_list)



