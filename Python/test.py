import math

x = 1
while math.factorial(x) < 2147483647:
    print(math.factorial(x+1))
    x += 1
