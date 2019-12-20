def even_square(x):
    for i in range(x):
        if i ** 2 % 2 == 0:
            yield i ** 2

even_square_list = list(even_square(20))
print(even_square_list)
