a = int(input())
b = int(input())
c = int(input())

print("YES" if a < b + c and b < a + c and c < a + b else "NO")
