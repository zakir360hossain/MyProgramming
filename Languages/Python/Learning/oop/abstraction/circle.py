from oop.abstraction import shapes
import math


class Circle(shapes.Shape):
    def __init__(self, figureName, radius):
        super.__init__(figureName)
        self.radius = radius

    def area(self):
        return math.PI*math.pow(self.radius, 2)

    def perimeter(self):
        return 2*math.PI*self.radius
    def toString(self):
        return f"Radius: {self.radius} \n {super().toString()}"

circle = Circle("Circle", 34)
if __name__ == '__main__':
    print(circle.toString)
