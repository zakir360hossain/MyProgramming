# When more than one classes inherits from a classes, it is hierarchical Python inheritance.

class A:
    pass
class B(A):
    pass
class C(A):
    pass
print(issubclass(B, A) and issubclass(C, A) )