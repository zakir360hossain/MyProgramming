# Creates a dictionary

# dict(key: value) KEY CANNOT BE REPEATING

x = dict([('Robert', 34), ('William', 55), ('Anderson', 20)])
print(x)
print(x.keys())
print(x.values())
xcopied = x.copy()

mydict = {y*y:y for y in range(20)}
print(mydict)
print(mydict[49])

mydict2 = ([('h', 242), ('whr', 127)])
mydict2.clear()
del mydict2