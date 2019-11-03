class Data:
    def __init__(self, name, age, birthplace):  # Parameterized method
        self.name = name
        self.age = age
        self.bp = birthplace

    def intro(self):
        print(f"Hello, I am {self.age}, I am {self.age}"
              f" and I was born in {self.bp}.")


person1 = Data('Arul', 25, 'Indonesia')
person2 = Data('John', 30, 'Indonesia')
person1.intro()
person2.intro()
