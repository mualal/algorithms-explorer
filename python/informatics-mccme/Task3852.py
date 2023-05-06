x = []
y = []
t = [1, 2, 3, 4, 5, 6, 7, 8]
flag = False
k = (1, 2)

for _ in range(8):
    k = input().split()
    x.append(int(k[0]))
    y.append(int(k[1]))

for i in range(8):
    if x.count(x[i]) > 1 or y.count(y[i]) > 1:
        flag = True

for i in range(8):
    t[i] = y[i] - x[i]

for i in range(8):
    if t.count(t[i]) > 1:
        flag = True

for i in range(8):
    t[i] = y[i] + x[i]

for i in range(8):
    if t.count(t[i]) > 1:
        flag = True

if flag:
    print("YES")
else:
    print("NO")
