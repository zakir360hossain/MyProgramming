from abc import ABC, abstractmethod


class Animal(ABC):
    @abstractmethod
    def eat(self):
        pass


class Tiger(Animal):
    def eat(self):
        print("Carnivorous")


class Cow(Animal):
    def eat(self):
        print("Herbivorous")


animal1 = Tiger()
animal1.eat()

animal2 = Cow()
animal2.eat()
