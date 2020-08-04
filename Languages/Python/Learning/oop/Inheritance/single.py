# A single inheritance is when a single class inherits a base class.

x = 0


class Fruit:
    def __init__(self):
        global x
        x += 1
        print(f"I am a fruit")


class Orange(Fruit):
    def __init__(self):
        super().__init__()  # super() allows to call methods from the parent class.
        global x
        x += 10
        print("I am an Orange")


banana = Orange()
print(x)
