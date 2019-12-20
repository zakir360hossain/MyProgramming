# When one classes inherits from another, which in turn inherits from another,
# it is multilevel python inheritance.

class A:
    x = 1

class B(A):
    pass
class C(B):
    pass

c_obj = C()

print(c_obj.x)