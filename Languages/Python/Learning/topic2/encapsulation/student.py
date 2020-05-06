class Student:
    def __init__(self, name, grade_level, email, home_address, mother_name, father_name):
        self.name = name
        self.grade_level = grade_level
        self.email = email
        self._home_address = home_address  # Should not be accessed
        self.__mother_name = mother_name  # private, cannot be accessed
        self.__father_name = father_name  # private, cannot be accessed

    def __official_transcript(self, name):  # private, cannot be accessed outside
        self.name = name
        print(f"{name}'s transcript")


john = Student("Jonathan", 12, "john@gmail.com", "234 Rose St", "Karen", "Frogman")
print(john.name)
print(john._home_address)  # Should not be accessed
print(john.__mother_name)  # Cannot access, does not exist
john.__official_transcript  # Cannot access, does not exist
