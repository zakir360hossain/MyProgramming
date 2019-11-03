class Fruits:
    """The fruit's name and its price"""  # Docstring

    def __init__(self, name, price): # "self" is temporary placement for object's parameter
        self.name = name
        self.price = f"${price}"


# help(Fruits) == This will show the document that describes the class


orange = Fruits("Orange", 12)  # "self" gets switched to the object (orange)
print(orange.name, orange.price)