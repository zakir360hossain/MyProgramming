from abc import ABC, abstractmethod


class Shape(ABC):
    def __init__(self, figureName):
        self.figName = figureName

    @abstractmethod
    def area(self): pass

    @abstractmethod
    def perimeter(self): pass

    def toString(self):
        return f"Figure Name: {self.figName}\nArea: {self.area()} \nPerimeter: {self.perimeter()}"


# This is one instance, some are in other files
class Square(Shape):
    def __init__(self, figureName, side):
        super().__init__(figureName)
        self.side = side

    def area(self):
        return self.side * self.side

    def perimeter(self):
        return 4 * self.side

    def toString(self):
        return f"Side: {self.side} \n{super().toString()}"


square1 = Square("Square", 45)

if __name__ == '__main__':
    print(square1.toString())
