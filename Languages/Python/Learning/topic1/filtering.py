
nums = [2, 34, 564, 23, 64, 8, 3]
def iseven(n):
    return n % 2 == 0


even_num = list(filter(iseven, nums))
print(even_num)


even_num = list(filter(lambda n: n % 2 == 0, nums))
print(even_num)

name_list = ['Zack', 'Jack', 'Nathan', 'Tim', 'Shaker']
def names(name):
    if name in name_list:
        return True
    else:
        return False

name_list2 = ['Jack', 'Zack', 'Monica', 'Soondar', 'shaker']
filtered_name = list(filter(names, name_list2))
print(filtered_name)