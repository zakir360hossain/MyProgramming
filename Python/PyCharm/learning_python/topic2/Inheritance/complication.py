# When in all the parent classes, methods or variable have same name, which one get printed when
# that method is called by the child class.
class Color:
    x = "orange"

    @staticmethod
    def char():
        print("juicy")


class Fruit:
    x = "Mango"

    @staticmethod
    def char():
        print("Sour")


class Orange(Color, Fruit):
    pass


print(Orange.x)  # It output "orange" because in the order of the parent classes, Color was first.
Orange.char() # Output "Juicy" because Color is first again.
