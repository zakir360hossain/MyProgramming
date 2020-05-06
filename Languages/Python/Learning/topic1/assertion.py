# Assert:
# If given condition is true, compute the rest
# Else: Throw the message

def fac(n):
    assert n >= 0, "factorial number cannot be negative"
    if n == 0:
        return 1
    else:
        return n*fac(n-1)


print(fac(-1))
print(fac(4))

