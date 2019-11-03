"""This is for school
"""
def point(x, y):
    deltax = 1
    yprime = 0.04055*x*(10-y)
    deltay = deltax * yprime
    newxcor = x + deltax
    newycor = y + deltay
    return f" yprime = {yprime} deltay = {deltay} The next point: {newxcor, newycor}"


print(point(4, 3.5430))

