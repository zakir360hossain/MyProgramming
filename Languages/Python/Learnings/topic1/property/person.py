class Person:
    def __init__(self, name):
        self.name = name

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, name):
        self._name = name.capitalize()


person1 = Person('jim')
print(person1.name)

person1.name = 'matt'
print(person1.name)

