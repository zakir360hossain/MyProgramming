# issubclass(B, A); where A and B are classes. Checks if B is a subclass of A

class A:
	pass

class B(A):
	pass

print(issubclass(B, A))


class C:
    pass

print(issubclass(A, C))

# A class can be a subclass of itself.
print(issubclass(C, C))

