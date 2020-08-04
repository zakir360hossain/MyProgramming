# Encapsulation => Privatizing certain data and behaviors of a class. Not letting methods,
# variables, etc., to be accessed or manipulated outside the scope. Or protecting them and warning
# that they should not be accessed.

# Single underscore => # private var or "protected member,
#   should not be accessed directly,but still able to.
# Double underscore => fully private, cannot be accessed outside the class.

class Ex1:
    def __init__(self):
        self.a = 123  # This variable is accessible

        self._b = 123  # This variable is a protected member, should not be accessed
        self.__c = 123  # This is variable is a fully private, cannot be accessed

    def _func1(self, something):  # This methods is a protected member, should not be accessed
        self.something = something

    def __func2(self, something):  # This is methods is a fully private, cannot be accessed
        self.something = something


ins1 = Ex1()
print(ins1.a)  # Access
print(ins1._b)  # Access, but should not attempt to access
# print(ins1.__c) => Does not exits outside (unresolved)

ins1._func1("I am an instance")  # Access, but should not attempt to access
# ins1.__func2("I am an instance") => Does not exits (unresolved)
