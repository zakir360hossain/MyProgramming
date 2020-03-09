class Human:
    def say_hello(self, name=None):
        if name is not None:
            print(f"Hello {name}")

        else:
            print("Hello! What is your name?")


obj = Human()
# Will return default output
obj.say_hello()

# Will return conditional output
obj.say_hello("John")
import sys
print(sys.executable)
