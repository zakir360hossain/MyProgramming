from numpy import median

def outer():
    msg = "hello"

    def inner():
        print(msg)

    return inner  # Function is an object in python. This return the object's memory location not the value.


# When 'outer' function is called, it will output the memory location of inner function, not the value, because it is
# not returning 'inner()' but simply 'inner'

a = outer()

# a = inner (the object reference of inner not the value "hello")

print(a.__name__)  # => will print the name, which is inner

print(a)  # => will print the memory location because it is not a()

a() # => This will print "hello." inner function does not exist outside the outer function, then how is this outputting
# value that is inside the inner function. This is closure, being able to access inner function, even though they are
# out of the scope of the outer function


# Closure Criteria:
# 1. Has to have nested function
# 2. Nested function must refer values in enclosing scope, the scope of outer function. (msg in this case becasue msg is
#    outside the inner function or nonlocal to it)
# 3. Enclosing function (outer in this case) must return the nested function (inner in this case)
