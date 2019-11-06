import random

freshmen = [124, 123, 354, 234, 117, 150]
sophomore = [167, 242, 265, 278, 289, 190]
junior = [242, 124, 465, 5786, 123, 3, 35]
senior = [435, 2, 21, 345, 456, 12, 435, 456]

random.shuffle(freshmen)
random.shuffle(sophomore)
random.shuffle(junior)
random.shuffle(senior)

print(freshmen)
print(sophomore)
print(junior)
print(senior)

selected = random.sample(freshmen, 1)
print(selected)