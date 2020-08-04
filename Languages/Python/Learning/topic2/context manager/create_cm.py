from contextlib import contextmanager


class File:
    def __init__(self, filename, method):
        self.file = open(filename, method)

    def __enter__(self):
        print("Enter")
        return self.file

    def __exit__(self, type, value, traceback):
        print(f"{type}, {value}, {traceback}")
        print("Exit")
        self.file.close()
        if type == Exception:
            return True
    # We handled the error. This means that if the error is an exception error, there will be no error.


with File("file2.txt", "w") as file2:
    print("Middle")
    file2.write("Hi there!")


# raise Exception()
# Even though a raise exception is being occurred, it still executes the exit methods.
# If there is any other error besides Exception, the error will still be printed.
# Such as raise FileExistsError () => this will give the error.


# Creating the context manager with generator
@contextmanager
def filemanager(filename, method):
    print("Enter")
    file = open(filename, method)
    yield file
    file.close()
    print("Exit")


with filemanager("file3.txt", "w") as f:
    print("Middle")
    f.write("There I am")
