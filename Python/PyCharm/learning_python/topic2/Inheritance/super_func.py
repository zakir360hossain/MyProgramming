# It allows us to call a method from the parent class.

class Vehicle:
    def start(self):
        print("Starting engine")

    def stop(self):
        print("Stopping engine")


class Car(Vehicle):
    def progress(self):
        super().start()
        print("I am in motion")
        super().stop()


bmw = Car()
bmw.progress()
