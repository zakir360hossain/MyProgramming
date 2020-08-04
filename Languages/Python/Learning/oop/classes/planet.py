class Planets:
    """This classes is about planets and their characteristics"""
    pass


planet1 = Planets()
planet1.name = "Earth"
planet1.gravity = "9.8 m/s*s"
print(planet1.name, " and its Gravity: ", planet1.gravity)

planet2 = Planets()
planet2.name = "Mars"
planet2.gravity = "3.711 m/s*s"
print(planet2.name)

print(Planets.__doc__)
