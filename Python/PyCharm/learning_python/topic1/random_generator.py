import random

for i in range(1, 10):
    print(random.randint(1, 101))

print("\n")

# Self_customizing
def my_random():
    return int(4 * random.random() + 3)


for i in range(10):
    print(my_random())
print("\n")

# Using Uniform() function
for i in range(20):
    print(random.uniform(40, 100))
print("\n")

# Normal Distribution normalvariate (mean. standard deviation)
for i in range(10):
    print(random.normalvariate(5, 10))
print("\n")

# Choose object randomly
outcomes = ['rock', 'paper', 'scissor', 'raver,', 'knife', 'sword', 'cleaver']
print(random.choices(outcomes, k=5))   # Choose 5 at once
print("\n")
for i in range(10):
    print(random.choice(outcomes))  # One at a time
print("\n")

array1 = [2, 3, 4, 7, 1, 8, 9]
# shuffles the list
random.shuffle(array1)
print(array1, "\n")

# Picks a sample set from list with given length
a = random.sample(array1, 3)
print(a, "\n")
