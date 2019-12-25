from abc import ABC, abstractmethod


class Cal(ABC):
    def __init__(self, value):
        self.value = value

    @abstractmethod
    def add(self):
        pass

    def sub(self):
        pass


class C(Cal):
    def add(self):
        print(self.value + 100)

    def sub(self):
        print(self.value - 100)


cal1 = C(100)
cal1.add()
cal1.sub()
