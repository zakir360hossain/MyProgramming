# A descriptor is any object that implements at least one of the following methods:
# __get__(), __set__(), __del__()

# A data descriptor implements both __get__() and __set__(). Implementing only __get__()
# makes it a non-data descriptor.

# __get__(self, instance, owner)
# __set__(self, instance, value)
# __del__(self, instance)
# __set_name__(self, owner, name)


