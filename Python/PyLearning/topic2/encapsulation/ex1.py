# Encapsulation

# Single underscore => # private var or "protected member,
#   should not be accessed directly,but still able to.
# Double underscore => fully private, cannot be accessed outside the class.

class Robot:
    def __init__(self):
        self.a = 123

        self._b = 123
        self.__c = 123

    def _func1(self):
        print("func1")

    def __func2(self):
        print("func2")


obj = Robot()
print(obj.a)
print(obj._b)
print(obj.__c)
obj._run()
