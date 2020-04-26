# Returns a boolean if attribute exist
class fruit:
    size = 7


orange = fruit()
print(hasattr(orange, 'size'))
print(hasattr(orange, 'shape'))
