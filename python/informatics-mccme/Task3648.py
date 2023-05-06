x = int(input()) * 100
p = int(input())
y = int(input()) * 100

count = 0

while x < y:
    x *= 1 + p / 100
    x = int(x)
    count += 1

print(count)
