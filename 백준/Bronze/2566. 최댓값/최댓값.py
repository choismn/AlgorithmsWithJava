import sys

maxVal = -1
maxPosX = 0
maxPosY = 0

# line by line input, row = 9
for i in range(9):
    line = list(map(int, sys.stdin.readline().split())) 
    if max(line) > maxVal:
        maxVal = max(line)
        maxPosY = i+1
        maxPosX = line.index(maxVal)+1

print(maxVal)
print(maxPosY, maxPosX)