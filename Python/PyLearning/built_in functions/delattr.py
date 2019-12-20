class Fruit:
    size = 7


orange = Fruit()
print(orange.size)

delattr(Fruit, 'size')
print(orange.size)  # => 'size' attribute is deleted
