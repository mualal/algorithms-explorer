a = input().split()

for i in range(int(len(a) / 2)):
    temp = a[i]
    a[i] = a[len(a) - 1 - i]
    a[len(a) - 1 - i] = temp

for _, value in enumerate(a):
    print(str(value) + " ", end="")
