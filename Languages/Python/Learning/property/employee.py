# The property decorator helps to call a methods like an attribute. i.e instead of 'email()', just 'email' will work

class Employee:
    def __init__(self, fn, ln):
        self.fn = fn
        self.ln = ln

    @property
    def email(self):
        return f"{self.fn}.{self.ln}.@gmail.com"

    @property
    def fullname(self):
        return f"{self.fn} {self.ln}"

    @fullname.setter
    def fullname(self, name):
        fn, ln = name.split(' ')
        self.fn = fn
        self.ln = ln

    @fullname.deleter
    def fullname(self):
        print('Name Deleted!')
        self.fn = None
        self.ln = None


e1 = Employee("Alex", "Goodman")
e1.fn = "Jim"
e1.fullname = 'Seth McFarlane'
print(e1.fn)
print(e1.email)
print(e1.fullname)

del e1.fullname
# print(fullname) => Does not exist anymore
print(e1.ln)
