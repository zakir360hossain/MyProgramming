# Creates a dictionary

# dict(key: value) KEY CANNOT BE REPEATING

x = dict([('Robert', 34), ('William', 55), ('Anderson', 20)])
print(x)
print(x.keys())
print(x.values())
x_copied = x.copy()

my_dict = {y * y: y for y in range(20)}
print(my_dict)
print(my_dict[49])

my_dict2 = ([('h', 242), ('whr', 127)])
my_dict2.clear()
del my_dict2
