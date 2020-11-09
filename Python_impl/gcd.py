def gcd(a,b):
    if b == 0:
        return a
    else:
        remainder = a % b
        return gcd(b,remainder)

n1 = int(input("Enter the first number:"))
n2 = int(input("Enter the second number:"))

print(gcd(n1,n2))