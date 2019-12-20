# Checks if a classes has the indicated attribute
shape = None


class fruit:
    size = 7


orange = fruit()
print(isinstance(orange, fruit))
print(isinstance(shape, fruit))  # => False
