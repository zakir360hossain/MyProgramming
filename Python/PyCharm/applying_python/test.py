def IR(Principle, Rate, Years):
    Real_rate = .01 * Rate
    total = Principle * (1 + (Real_rate)) ** Years
    mm = total - Principle
    print('total', total)
    print("Money made", mm)


print(IR(1000, 5, 10))
