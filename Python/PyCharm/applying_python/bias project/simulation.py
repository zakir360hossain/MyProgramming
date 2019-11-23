import random
from numpy import median


"""
Unbiased sample
Do I think my bias sample will be higher or lower w.r.t some reply?

Simulation is seeing if your bias actually changed the responses.

Separate by 2 digits:
00-48 => Yes  (49%)
49-70 => No ( 22%)
71-99 => Not sure ( 29%)

Trial: Pick 73 (sample size) numbers from the RNS and see how many of them
fall into each category.

trial size = 100
"""

# Variables
yes_numL = []
yes_num = 0
no_numL = []
no_num = 0
yes_no_numL = []
yes_no_num = 0


for j in range(100):
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


print("\n")
print("\n")
print("\n")
average_yes = round((((sum(yes_numL))/yes_numL.__len__())/73)*100)
print(f"Based on a random simulation, involving 100 trials, {average_yes} % of the 2-digit random numbers "
      f"is classified to the Yes category")

print("\n")
average_no = round((((sum(no_numL))/no_numL.__len__())/73)*100)
print(f"Based on a random simulation, involving 100 trials, {average_no} % of the 2-digit random numbers "
      f"is classified to the No category")

print("\n")
average_yes_no = round((((sum(yes_no_numL))/yes_no_numL.__len__())/73)*100)
print(f"Based on a random simulation, {average_yes_no} % of the 2-digit random numbers is classified to "
      f"the Unsure category")
