# Multiple Python inheritance are when a classes inherits from multiple base classes.

class Color:
    pass


class Fruit:
    pass


class Orange(Color, Fruit):
    pass


print(issubclass(Orange, Color) and issubclass(Orange, Fruit))

# Method Resolution Order (MRO). If an attribute is not found in the current classes, orange in
# this case, it will be searched in parent classes with an order, top-to-bottom, depth-first.
# The order is called linearization of classes Child. And the set of rules applied are called MRO.
print(Orange.mro())
