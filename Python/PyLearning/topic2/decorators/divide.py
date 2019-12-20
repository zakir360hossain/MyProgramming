"""
In Python, decorators are used to add features or modify functions without having to touch those functions
"""


def div(a, b):
    print(a / b)


def smart_div(func):
    def inner(a1, b1):
        if a1 < b1:
            a1, b1 = b1, a1
        return func(a1, b1)

    return inner

# div1 is the modified or decorated version of function div. div1 is not same as div. div1 can
# also be named as div (recommended by PEP8). Here the logic added is that numerator always should be greater than
# denominator
div1 = smart_div(div)
div1(2, 4)
