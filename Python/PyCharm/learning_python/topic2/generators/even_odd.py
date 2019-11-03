def even_odd(x):
    while x > 0:
        if x % 2 == 0:
            yield "This number is even"
        else:
            yield "This number is odd"

        x -= 3


for i in even_odd(13):
    print(i)
