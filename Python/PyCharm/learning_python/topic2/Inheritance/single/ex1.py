# A single Python inheritance is when a single class inherits from a class.

# Example 1

x = 0


class Fruit:
    def __init__(self):
        global x
        x += 1
        print(f"I am a fruit")


class Tropical(Fruit):
    def __init__(self):
        super().__init__()  # super() allows to call method from the parent function.
        global x
        x += 10
        print("I am tropical")


banana = Tropical()
print(x)
