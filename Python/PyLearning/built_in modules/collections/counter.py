# Collections: Counter, defaultdict, OrderedDict, namedtuple ( all of them are subclasses of dict function)

from collections import Counter
print(issubclass(Counter, dict))

# Counter => Counts how many times something occurs.
# Takes tuple, list, dict, or string
companies = ['Sisco', 'Tera Data', 'Amazon', 'SAP', 'Vanguard', 'AGI', 'JHC', 'Google']
print(Counter(companies))

# Populate after declaring empty
fruits = Counter()
fruits.update(['Apple', 'Banana', 'Banana', 'Peach', 'Peach', 'Peach', 'Orange', 'Orange'])
print(fruits)

# Accessing Counts
print(fruits['Apple'])
print(fruits['apple'])  # => this will give 0 because in the list, the Apple is uppercase.
print(fruits['Peach'])

# Iterator for Counts
for i in fruits.elements():
    print(f"{i}: {fruits[i]}")

# most_common method => if n=1 then which element is the most frequent, if n=2 then which two are most frequent.
print(fruits.most_common(1))

# Arithmetic
fruit2 = Counter(['Strawberry'])
combined_fruits = fruits+ fruit2
print(combined_fruits)

for i in combined_fruits.elements():
    print(f"{i}: {combined_fruits[i]}")