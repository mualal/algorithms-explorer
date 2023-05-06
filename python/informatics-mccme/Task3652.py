count = 0

while True:
    a = int(input())
    if a == 0:
        break
    if a % 2 == 0:
        count += 1

print(count)
