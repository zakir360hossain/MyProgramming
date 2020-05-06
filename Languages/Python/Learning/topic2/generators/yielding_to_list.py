# Whenever there is yield, it become generator

def even_square(x):
    for i in range(x):
        if i ** 2 % 2 == 0:
            yield i ** 2


even_square_list = list(even_square(20))
print(even_square_list)


# Generating cube number from 1 to a 1000

def cubeNumber():
    i = 0
    while True:
        yield i * i * i
        i += 1


for i in cubeNumber():
    if i > 1000:
        break
    print(i)
