class Bank:
    def ratio_of_interest(self):
        return 0.06


class PNC(Bank):
    def ratio_of_interest(self):
        return 0.09


# Here, the method ratio_of_interest is present in both parent and child class, but doing different things

# returns 0.06
obj = Bank()
print(obj.ratio_of_interest())
# returns 0.09
obj2 = PNC()
print(obj2.ratio_of_interest())
