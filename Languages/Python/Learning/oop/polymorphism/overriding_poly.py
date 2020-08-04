class Bank:
    def ratio_of_interest(self):
        return 0.06


class PNC(Bank):
    def ratio_of_interest(self):
        return 0.09


# Here, the methods ratio_of_interest is present in both parent and child class, but doing different things

# returns 0.06
americanBank = Bank()
print(americanBank.ratio_of_interest())
# returns 0.09
americanPNCBank = PNC()
print(americanPNCBank.ratio_of_interest())
