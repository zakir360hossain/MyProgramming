class fruit:
    size = 7


orange = fruit()
print(orange.size)

delattr(fruit, 'size')
print(orange.size)  # => 'size' attribute is deleted

