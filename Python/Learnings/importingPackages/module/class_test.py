from topic1.classes import employee

employee1 = employee.Employee("Jack", "Ryan", 2000)
employee1.apply_raise(1.5)
print(employee1.fullname())
print(employee1.pay)
