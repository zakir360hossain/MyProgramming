from abc import ABC, abstractmethod


class A(ABC):
    @abstractmethod
    def display(self):
        var = None


class B(A):
    def display(self):
        print("This display method is from class A")


# Cannot be instantiated for A. Used B to call display method from A
obj = B()
obj.display()
