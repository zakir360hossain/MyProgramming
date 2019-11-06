class Employee:
    """This classes is about employee directory"""

    def __init__(self, first_name, last_name, pay):
        self.first_name = first_name
        self.last_name = last_name
        self.pay = pay
        self.email = first_name + '.' + last_name + '@company.com'

    def fullname(self):
        return '{} {}'.format(self.first_name, self.last_name)

    def apply_raise(self, raise_perc):  # Class Variables
        self.pay = int(self.pay * raise_perc)  # self.raise_percentage is also valid


employee1 = Employee('Zakir', 'Hossain', 89000)
employee2 = Employee('Rashendra', 'Minaj', 88000)

# print(employee1.email)
# print(employee1.fullname())  # Same thing as print(Employee.fullname(employee1))
# print(employee1.pay)
# employee1.apply_raise(1.4)
# print((employee1.raise_perc - 1) * employee2.pay)  # Delta in pay
# print(employee1.pay)
# print(employee1.__dict__)  # This will show all the attributes and their corresponding values.
# print(Employee.__doc__)
