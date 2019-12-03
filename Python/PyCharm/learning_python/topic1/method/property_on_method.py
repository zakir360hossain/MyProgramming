class Employee:
    def __init__(self, fn, ln):
        self.fn = fn
        self.ln = ln

    def fullname(self):
        return f"{self.fn } {self.ln}"

e1 = Employee("Alex", "Goodman")

print(e1.fullname())