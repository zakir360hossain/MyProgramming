import os

print(dir(os))

# gets the current working directory
print(os.getcwd())

# Changes the current working directory
print(os.chdir())

# Fetches all the list under the directory. Also takes parameter as a directory and will look under that particular
# directory
print(os.listdir())

# Making directories
os.mkdir()

# os.makedirs('h/d')
# Here, d is a sub-directory and I wanted to create h under d, but what if h does not exist? Makedirs will
# create it, h and as well as d, but mkdir will not do that.

# renames a file
os.rename("old_name.txt", "to_new_name.txt")

# Read environment variable. Takes parameter, such as PATH or HOME
os.environ.get()

# Joins two paths
os.path.join()

# Checks for path existence
os.path.exists()

# os.path.isX()
# Where X = file, dir, abs, path, etc.

os.removedirs()

# Gives statistical information about files or dirs, such as size, time, etc.
os.stat()

os.walk()

print(os.listdir())
