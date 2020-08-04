class Person:
    """THE END"""

    def __init__(self):
        self.name = "Ethan"
        self.age = 28

    def update(self):
        self.age = 30

    def compare_age(self, other_person, b=True):
        if self.age == other_person.age:
            return True
        else:
            return False


person1 = Person()
person2 = Person()

person1.update()
# How does the update methods know that person1 is the one whose age is changing, not person2? Because of self.
# self is the indicator of the instance, which instance we are dealing with.

if person1.compare_age(person2):
    print("these two people have same age")

else:
    print("They do not have the same age")
# Here person1 become the self for methods compare_age. self indicates that person1 is being compared to person2
