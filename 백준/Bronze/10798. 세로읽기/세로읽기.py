import sys

inps = []
for _ in range(5):
    inps.append(list(sys.stdin.readline().rstrip()))

for i in range(15):
    for inp in inps:
        try:
            print(inp[i], end="")
        except:
            pass