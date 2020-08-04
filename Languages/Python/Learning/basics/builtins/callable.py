# Checks if an object is callable
# The built-in callable() methods checks if the argument is either of the two:
# 1. Is it an instance of a class with a __call__ methods?
# 2. Is it of a type which indicates callability such as in functions, methods?


def Num():
	return 10

print("Is a function callable? "+ str(callable(Num))) # A function is callable

n = 5*5
print("Is a variable callable? "+str(callable(n))) # Absolutely not callable, it's just a single object of integer.


class A:
	pass

a = A()
print("Is a class without __call__ callable? "+ str(callable(A))) # A class is callable
print("Is an object of a class without __call__ is callable? "+str(callable(a)))


class B:
	def __call__(self):
		print("I am here!!!")

print("Is a class with __call__ callable? "+ str(callable(B)))
b = B()
print("Is an object of a class with __call__ is callable? "+str(callable(b)))


print("Is a list of integer callable? "+str(callable([1, 2, 3])))  # => a list is not callable

print("Is the function list() callable? "+str(callable(list))) # => function 'list' is callable
