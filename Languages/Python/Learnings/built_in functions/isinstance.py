# Checks if a class has a given instance
shape = None


class Fruit:
    size = 7

class Cloth:
	color = "Purple"

orange = Fruit()
shirt = Cloth() 
print(isinstance(orange, Fruit))
print(isinstance(shirt, Fruit))  # => False

print(isinstance(shirt, Cloth))
print(isinstance(orange, Cloth))