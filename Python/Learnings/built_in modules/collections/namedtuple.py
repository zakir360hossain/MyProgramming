from collections import namedtuple

colors = namedtuple('colors', 'r g b')

red = colors(r=250, g=0, b=0)
print(red.r)
print(red[0])
print(getattr(red, 'r'))
# All 3 gives the same output

# namedtuple is immutable

# Convertible into dict
print(red._asdict())

# Iterables into namedtuple
color1 = colors._make([24, 234, 232])
print(color1)

# Dictionary to namedtuple
color2 = colors(**{'r': 200, 'g': 0, 'b': 67})
print(color2)

# What attributes belong to the tuple
print(color2._fields)

# It is immutable but it's replaceable, but does not change the original
print(color2._replace(**{'g': 34}))