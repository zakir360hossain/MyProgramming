# Abstract class is a class that contains one or more abstract methods.
# An abstract method is declared, but not implemented.
# An abstract class cannot be instantiated, and require subclasses to provide implementations for the abstract methods.

# Subclasses of an abstract class in Python are not required to implement abstract methods of parent class,
# but if not implemented then those subclasses cannot be instantiated as well.

# All the abstract methods has to be implemented to instantiate an object, it is possible to implement
# abstract methods through multiple inheritance.

# It's often used when the requirement/what to implement is known, but the design/how to implement is unknown.

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
