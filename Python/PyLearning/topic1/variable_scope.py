def integer():
    x = 4  # local, cannot access from outside the integer() function
    print(x)


integer()
# print(x) in here will throw error.

x1 = 10


def integer2():
    x1 = 15  # created local variable, did not change outside the function
    print(x1)


integer2()  # gives 15
print(x1)  # gives 10, did not changes


def integer3():
    global x1  # now it changes 10 to 15 everywhere
    x1 = 15
    print(x1)


integer3()  # gives 15
print(x1)  # gives 15


def func1():
    a = 23

    def func2():
        a = 24  # created local variable.
        print(a)  # gives 24

    func2()
    print(a)  # gives 23


func1()


def func3():
    a = 23

    def func4():
        nonlocal a
        a = 24  # changes "a" to 24 even outside the func4.
        b = 70
        print(a)  # gives 24
        print(b)

    func4()
    print(a)  # also gives 24


func3()
