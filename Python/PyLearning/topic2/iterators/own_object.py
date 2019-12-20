class UntilForty:
    def __init__(self):
        self.num = 1

    def __iter__(self):
        return self

    def __next__(self):
        if self.num <= 40:
            val = self.num
            self.num += 1
            return val
        else:
            raise StopIteration

values = UntilForty()
print(next(values))  # Here it gets the first number, which is 1 (initial).

for i in values:
    print(i)

# In the for-loop, it does not start from 1, but 2 because 1 is already printed through next() and that is the power
# of iterators

