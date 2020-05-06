class Car:
    def __init__(self, model, price):
        self.model = model
        self.price = price

    # Getter method
    def get_model(self):
        return self.model

    def get_price(self):
        return self.price

    # Setter method
    def set_model(self, model):
        self.model = model

    def set_price(self, price):
        self.model = price

    # Delete Method
    def del_model(self):
        del self.model

    def del_price(self):
        del self.price

    # Remove method
    def rm_price(self):
        self.price = None

car1 = Car('SUV', 2000)
car2 = Car('BMW', 3000)

car1.set_model('Hyundai')
print(car1.get_model())

# car2.del_price() => this will delete, not just the value, but the entire attribute.
# print(car2.price) => will say that there is not attribute price

car2.rm_price()
print(car2.get_price())