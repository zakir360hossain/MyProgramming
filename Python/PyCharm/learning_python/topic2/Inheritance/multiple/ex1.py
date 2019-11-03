# Multiple Python inheritance are when a class inherits from multiple base classes.

class Color:
    pass


class Fruit:
    pass


class Orange(Color, Fruit):
    pass


print(issubclass(Orange, Color) and issubclass(Orange, Fruit))

# Method Resolution Order (MRO). If an attribute is not found in the current class, orange in
# this case, it will be searched in parent classes with an order, top-to-bottom, depth-first.
# The order is called linearization of class Child. And the set of rules applied are called MRO.
print(Orange.mro())
