# Checks tells if an object is callable

print(callable([1, 2, 3]))  # => a list is not callable

print(callable(list))  # => function 'list' is callable


class fruit:
    def sayhi(self):
        print("Hi, I'm a fruit")


