from oop.abstraction.shapes import Shape


class Rectangle(Shape):
    def __init__(self, figureName, width, length):
        super().__init__(figureName)
        self.width = width
        self.length = length

    def area(self):
        return self.width * self.length

    def perimeter(self):
        return 2 * self.width + 2 * self.length

    def toString(self):
        return f" \nWidth: {self.width} \nLength: {self.length} \n{super().toString()}"


rectangle = Rectangle("Rectangle", 12, 13)

if __name__ == '__main__':
    print(rectangle.toString())

