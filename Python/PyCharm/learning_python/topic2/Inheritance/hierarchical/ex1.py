# When more than one class inherits from a class, it is hierarchical Python inheritance.

class A:
    pass
class B(A):
    pass
class C(A):
    pass
print(issubclass(B, A) and issubclass(C, A) )