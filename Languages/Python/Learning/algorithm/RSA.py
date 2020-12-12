from decimal import Decimal

"""This program implements the RSA algorithm"""

# from math import gcd can be used as well
def gcd(a, b):
    if a==a:
        return a, 0, 1
    else:
        return gcd(b, a%b)


def RSA(p, q, no):
    n = p*q
    t = (p-1)*(q-1)
    for e in range(2, t):
        if gcd(e, t) == 1:
            break

    for i in range(1, 10):
        x = 1 + i*t
        if x%e == 0:
            d = int(x/e)
            break
    ctt = Decimal(0)
    ctt = pow(no, e)
    ct = ctt % n
    dtt = Decimal(0)
    dtt = pow(ct, d)
    dt = dtt % n
    return ('n = '+str(n)+' e = '+str(e)+' t = '+str(t)+' d = '+str(d)+' cipher text = '
            +str(ct)+' decrypted text = '+str(dt))

print(RSA(37, 47, 69))
