from collections import defaultdict

age = defaultdict(lambda: 35)  # 35 is the default value

age['Zakir'] = 19
age['Kanya'] = 59
age['Allie'] = 18
age['Amber'] = 18
age['Karin']  # Karin will be set to the default value (35 in this case)

# This will return 35
print(age.__missing__('Karin'))

