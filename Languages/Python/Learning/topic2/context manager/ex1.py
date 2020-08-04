

# Not Context manager.
file  = open("file.txt", "w")
# Here w is write methods, which means it will create the file if does not exist.
file.write("Hello")
file.close()


# What if there was an error in line 3, it will not close the file.
# On way to come around this:
## (Before context manager)
file = open("file.txt", "r")
	# Here r is read methods, which means the file is already existed. Will not create if does not exist
	# and will throw an error
try:
	file.write("Hey!")
finally:
	file.close()
	# This will happen even if the try does not execute


# With context manager
with open ("file.txt", "r") as file:
	file.write("How are you doing?")
	# This is same as the try and finally approach.
