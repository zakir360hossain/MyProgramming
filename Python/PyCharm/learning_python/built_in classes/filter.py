# Function filtering names
def names(name):
    name_list = ['Zack', 'Jack', 'Nathan', 'Tim', 'Shaker']
    if name in name_list:
        return True
    else:
        return False


name_list2 = ['Jack', 'Zack', 'Monica', 'Soondar', 'shaker']
filtered_name = filter(names, name_list2)
print("Filtered names:")
for s in filtered_name:
    print(s)  # => Zack and Jack
