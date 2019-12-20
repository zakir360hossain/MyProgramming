import random

freshmen = [270, 208, 257, 243, 149, 229, 242, 255, 220, 15, 210, 117, 156]
sophomore = [254, 247, 232, 146, 239, 233, 13, 222, 108, 215, 244, 238, 206, 212]
junior = [266, 260, 236, 115, 16, 150, 214, 235, 113, 127, 202, 114]
senior = [133, 131, 216, 125, 217, 267, 219, 148, 268, 248, 253, 218]

random.shuffle(freshmen)
random.shuffle(sophomore)
random.shuffle(junior)
random.shuffle(senior)

print("Sample selected from each strata:", "\n")
freshmen_sample = random.sample(freshmen, 1)
sophomore_sample = random.sample(sophomore, 1)
junior_sample = random.sample(junior, 1)
senior_sample = random.sample(senior, 1)

print(freshmen_sample)
print(sophomore_sample)
print(junior_sample)
print(senior_sample)




