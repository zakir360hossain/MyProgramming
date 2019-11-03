# When a subclass changes the functionality of a method that is in the parent class.

class A:
    def person(self):
        print("I am john")
class B(A):
    def person(self):
        print("I am Smith")
b_obj = B()
b_obj.person()
# This is changing from John to Smith. Always will print Smith
