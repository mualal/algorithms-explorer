a = input().split()
max = a.count(a[0])
t = a[0]

for i in range(a.__len__() - 1):
    if a.count(a[i + 1]) > max:
        max = a.count(a[i + 1])
        t = a[i + 1]
        
print(t)
