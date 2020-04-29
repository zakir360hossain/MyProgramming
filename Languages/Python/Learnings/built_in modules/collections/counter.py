# Counter: counts how many times something occurs.
# Takes tuple, list, dict, or string
#It is a type of the collections

# Collections: Counter, defaultdict, OrderedDict, namedtuple ( all of them are subclasses of dict function)


from collections import Counter

print(type(Counter))
print(issubclass(Counter, dict))

companies = ['Sisco', 'Tera Data', 'Amazon', 'SAP', 'Vanguard', 'AGI', 'JHC', 'Google']
print(Counter(companies))

# Populate after declaring empty, afterall Counter is a class.
fruits = Counter()
fruits.update(['Apple', 'Banana', 'Banana', 'Peach', 'Peach', 'Peach', 'Orange', 'Orange'])
print(fruits)

# Accessing counts, this will only give the count of the element, not the element.
print(fruits['Apple'])
print(fruits['apple'])  # => Case matters
print(fruits['Peach'])

# Through iterator for counts
for i in fruits.elements():
    print(f"{i}: {fruits[i]}")

# most_common(n) ->  returns n most frequent elements.
print(fruits.most_common(2))

# Arithmetic
fruit2 = Counter(['Strawberry'])
combined_fruits = fruits+ fruit2
print(combined_fruits)

for i in combined_fruits.elements():
    print(f"{i}: {combined_fruits[i]}")