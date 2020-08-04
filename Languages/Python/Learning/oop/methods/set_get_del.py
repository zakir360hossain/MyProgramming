import math

class Tennis:
    # Represents the countries that play tennis
    wherePlays = 34
    # Appropriate weight for tennis
    global weight
    weight = 150
    def __init__(self, first_name, last_name, salary, weight, ):
       self.first_name = first_name
       self.last_name = last_name
       self.salary = salary
       self.weight = weight

    #regular method (automatically passed the instance)
    def increase_salary(self, increaseAmount):
        self.salary += increaseAmount

    #class method (automatically passed class)
    @classmethod
    def increasePopularity(cls, newCountries=1):
        cls.wherePlays+=newCountries

    #static method (nothing is passed automatically)
    @staticmethod
    #if the given weight is appropriate for tennis, with a 10 lbs margin
    def weightValidation(w):
        return abs(weight-w)<=5

    #Delete Method -> deletes the entire attribute
    def del_weight(self):
        del self.weight

    # Remove method -> removes the value contained in the attribute.
    def rm_price(self):
        self.price = None


player = Tennis("Roger", "May", 100000, 156)

print(Tennis.weightValidation(170))
