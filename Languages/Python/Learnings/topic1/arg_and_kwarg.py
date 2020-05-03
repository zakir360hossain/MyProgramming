# args: non-keyworded, and variable-length. Optional. Returns as a tuple
# kwargs: keyworded, returns as a dictionary. Optional
# formal args: regular arguments, raises error if not given. Compulsory


# Formal
def product(a, b):
    return a * b
print(product(3, 4))


# args
def add(*nums):
    return sum(nums)


print(add(2, 3456, 56, 65856, 54676))


# kwargs
def book(**data):
    print(data)


book(title="Symposium", author="Plato", time="450 BC", subjects="Philosophy")


# All three
def planet(name, *characteristics, **properties):
    print(f"{name}:\n   {characteristics}\n   {properties}")


planet("Earth", "medium-sized", "3rd from the sun", "active surface", "contains water",
       age="4.543 years", refuge_life=True, radius="6356 km", shape="oblate-spheroid", orbital_period="360 days")
