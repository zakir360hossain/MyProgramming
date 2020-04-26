# When more than one class inherits a base class, it is said to be hierarchical.

class A:
    pass


class B(A):
    pass


class C(A):
    pass


print(issubclass(B, A) and issubclass(C, A))
