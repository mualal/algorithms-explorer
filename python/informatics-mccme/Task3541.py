N = int(input())
zero_count = 0

for _ in range(N):
    x = int(input())
    if x == 0:
        zero_count += 1

print(zero_count)
