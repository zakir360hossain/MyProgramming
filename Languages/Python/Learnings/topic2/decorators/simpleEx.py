def decor1(func):
    def wrapper1():
        print("$$$$$$$$$$")
        func()
        print("$$$$$$$$$$")

    return wrapper1


def decor2(func):
    def wrapper2():
        print("##########")
        func()
        print("##########")

    return wrapper2


def say_hello():
    print("Hello!")


def say_hi():
    print("Hi!")


say_hello = decor1(say_hello)
say_hello()

say_hi = decor2(say_hi)
say_hi()


# Same as:
@decor1
def say_hello():
    print("Hello!")


@decor2
def say_hi():
    print("Hi!")


say_hello()
say_hi()
