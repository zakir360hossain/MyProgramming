# Checks if the second class is under the first class

class A:
	pass

class B(A):
	pass

print(issubclass(B, A))


class field:
    pass

# A class can be a subclass of itself.
print(issubclass(field, field))