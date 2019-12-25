from abc import ABC, abstractmethod


class X(ABC):
    @abstractmethod
    def m1(self):
        pass

    @abstractmethod
    def m2(self):
        pass


class Y(X):
    def m1(self):
        print("This is m1")


# obj = Y()
# obj.m1() => error, one of the abstract methods in X hasn't been implemented yet in Y.


class Z(Y):
    def m2(self):
        print("This is m2")


# Now it's fine because both methods are now out of abstraction, doesn't matter if through multiple inheritance.
obj = Z()
obj.m1()
obj.m2()
