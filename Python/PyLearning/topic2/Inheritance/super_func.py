# It allows to call a method from the parent classes.

class Vehicle:
    """This is the parent class"""

    def start(self):
        print("Starting engine")

    def stop(self):
        print("Stopping engine")


class Car(Vehicle):
    """This is the child class"""

    def progress(self):
        # Method from parent class
        super().start()
        print("I am in motion")
        # Method from the parent class
        super().stop()
        # start and stop are method from the parent class Vehicle, and using the super method, those methods are
        # being called in a method that belongs to the chil class Car.


bmw = Car()
bmw.progress()
