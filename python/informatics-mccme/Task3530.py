n = int(input())

x = 10 ** n - 1
n = 10 ** (n - 1)

while x >= n:
    print(str(x) + " " if x % 2 == 1 else "", end="")
    x -= 1
