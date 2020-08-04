# Overriding => having 2 methods with the same name but doing different things

# A subclass changes the functionality of a methods that is in the parent classes, same name.
class A:
    name = "Hello"

    def person(self):
        print("I am john")


class B(A):
    name = "Hi"

    def person(self):
        print("I am Smith")


obj = B()
obj.person()
print(obj.name)
# This is changing from John to Smith. Always will print Smith
