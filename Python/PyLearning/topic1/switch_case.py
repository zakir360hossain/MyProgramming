# Implementing switch cases in python
def week(i):
    switcher = {
        0: 'Monday',
        1: 'Tuesday',
        2: 'Wednesday',
        3: 'Thursday',
        4: 'Friday',
        5: 'Saturday',
        6: 'Sunday'
    }
    return switcher.get(i, "Invalid day of the week")


print(week(0))
