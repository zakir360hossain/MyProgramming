import random


"""
Separate a RNS by 2 digits:
00-48 => Yes  (49%)
49-70 => No (
71-99 => Not sure (

Trial: Pick 73 numbers from the RNS and see how many of them
falls into each category.

trial size = 500
"""

# Variables
yes_numL = []
yes_num = 0
no_numL = []
no_num = 0
yes_no_numL = []
yes_no_num = 0

for j in range(200):
    rns = []
    for i in range(1, 74):
        rns.append(random.randint(0, 99))

    for n in rns:
        if 00 <= n <= 48:
            yes_num += 1
        elif 49 <= n <= 70:
            no_num += 1
        elif 71 <= n <= 99:
            yes_no_num += 1
    rns.clear()

    yes_numL.append(yes_num)
    yes_no_numL.append(yes_no_num)
    no_numL.append(no_num)
    yes_num = 0
    no_num = 0
    yes_no_num = 0

average_yes = round((((sum(yes_numL))/yes_numL.__len__())/73)*100)
median_yes = sorted(ye)
print(f"Average percentage of number falling under the yes category: {average_yes} %")

print("\n")
average_no = round((((sum(no_numL))/no_numL.__len__())/73)*100)
print(f"Average percentage of number falling under the no category: {average_no} %")

print("\n")
average_yes_no = round((((sum(yes_no_numL))/yes_no_numL.__len__())/73)*100)
print(f"Average percentage of number falling under the Not Sure category: {average_yes_no} %")
