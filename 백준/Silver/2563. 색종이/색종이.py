import sys

paper = [[0]*100 for i in range(100)]

n = int(sys.stdin.readline().rstrip())
for i in range(n):
    x, y = map(int, sys.stdin.readline().rstrip().split())

    for row in range(x, x+10):
        for col in range(y, y+10):
            paper[row][col] = 1

count = 0
for p in paper:
    count += sum(p)

print(count)