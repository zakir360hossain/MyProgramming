from collections import OrderedDict
# Remembers which element is paired with which value

age = OrderedDict()
age['Zakir'] = 19
age['Kanya'] = 59
age['Allie'] = 18
age['Amber'] = 18
print(age)

# Change pair location, move Zakir to the bottom
age.move_to_end('Zakir')
print(age)

# move Kanya to top
age.move_to_end('Kanya', last=False)

# Removes a value pair from the container; returns the removed pair.
print(age.popitem(last=False))

print(age)  # Kanya is no more in the container because she is popped out.
