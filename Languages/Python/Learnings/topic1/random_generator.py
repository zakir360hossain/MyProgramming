import random

for i in range(1, 10):
    print(random.randint(1, 101))

print("\n")

# Self_customizing
print("Self_customized")
def my_random():
    return int(4 * random.random() + 3)


for i in range(10):
    print(my_random())
print("\n")

# Using Uniform() function
print("With unifirm")
for i in range(20):
    print(random.uniform(40, 100))
print("\n")

# Normal Distribution normalvariate (mean. standard deviation)
print("Normal Distribution")
for i in range(10):
    print(random.normalvariate(5, 10))
print("\n")

# Choose word randomly
print("Choose word randomly")
outcomes = ['rock', 'paper', 'scissor', 'raver,', 'knife', 'sword', 'cleaver']
print(random.choices(outcomes, k=5))   # Choose 5 at once
print("\n")
for i in range(10):
    print(random.choice(outcomes))  # One at a time
print("\n")

print("Shuffling")
array1 = [2, 3, 4, 7, 1, 8, 9]
# shuffles the list
random.shuffle(array1)
print(array1, "\n")

# Picks a sample set from list with given length
print("Sample set")
a = random.sample(array1, 3)
print(a, "\n")


# Seeding: generate pseudo-random number
# If I again put the seed number again, it will give the same number
print("Seeding")
random.seed(1)
x = random.randint(1, 10000) # A number between 1-10000
print(x)

random.seed(1)
y = random.randint(1, 10000)
# x = y because of of the same seed number and same range
print(y)

for i in range(1, 10):
    random.seed(2)
    # All 10 numbers will be the same
    print(random.randint(1, 100))
