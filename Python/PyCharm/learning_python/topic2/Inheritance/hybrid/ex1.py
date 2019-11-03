# Hybrid Python inheritance is a combination of any two kinds of inheritance

class A:
    x = 1


class B(A):
    pass


class C(A):
    pass


class D(B, C):
    pass

d_obj = D()
print(d_obj.x)