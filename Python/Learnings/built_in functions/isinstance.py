# Checks if a class has the indicated instance
shape = None


class fruit:
    size = 7


orange = fruit()
print(isinstance(orange, fruit))
print(isinstance(shape, fruit))  # => False
