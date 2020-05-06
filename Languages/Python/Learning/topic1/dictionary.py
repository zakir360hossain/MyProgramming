# dict(key, value)
# Value can be repeated, but key cannot be repeated.
# This is the concept of HashTable and HashMap


student = dict([(101, 'Robert'), (102, 'William'), (103, 'Anderson')])
print(student)
print(student.keys())
print(student.values())
print(student[101])

# The default iterable is the keys, not values. Only key is printed, not the pair.
for s in(student):
	print(s)

for s in (student.values()):
	print(s)
	
teacher = {101:"Anderson", 102:"DeLone", 103:"McCormick", 104:"Suleimann"} # simpler way to create a dict

body = {"student": student, "teacher": teacher} # dictionary of dictionaries.
print(body["teacher"])




student_copied = student.copy() # make a copy