#delattr(object, attribute name)
#Deletes an attribute permanently. 

class Fruit:
    size = 7


orange = Fruit()
# size is printed in here
print(orange.size)

# Throws error, the instance size is no more there.
delattr(Fruit, 'size')
print(orange.size)  # => 'size' attribute is deleted
delattr()