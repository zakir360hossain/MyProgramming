from topic2.abstraction import shapes

class Circle(shapes.Shape):
    def __init__(self, figureName, radius):
        super.__init__(figureName)
        self.radius = radius

    def area(self):
        return math.PI*math.pow(radius, 2)

    def perimeter(self):
        return 2*math.PI*radius
    def toString(self):
        return f"Radius: {radius} \n {super().toString()}"

circle = Circle("Circle", 34)
if __name__ == '__main__':
    print(circle.toString)
