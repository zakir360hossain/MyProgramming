
class Fruits:
    """This is a Fruit class"""

    def __init__(self, name, price):  # "self" is temporary placement for object's parameter
        self.name = name
        self.price = f"${price}"


# help(Fruits) == This will show the document that describes the classes


orange = Fruits("Orange", 12)  # "self" gets switched to the object (orange)
print(orange.name, orange.price)
