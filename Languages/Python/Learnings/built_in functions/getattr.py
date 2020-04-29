# Returns the value of the passed attribute that belongs to the object
class fruit:
    size = 7


orange = fruit()
print(getattr(orange, 'size'))
