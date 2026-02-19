import sys

wholeList = [] 

# line by line input, row = 9
for i in range(9):
    line = list(map(int, sys.stdin.readline().split())) 
    wholeList.append(line)

maxVal = -1
maxPosX = 0
maxPosY = 0

for i in range(9):
    for j in range(9):
        if wholeList[i][j] > maxVal:
            maxVal = wholeList[i][j]
            maxPosX = i+1
            maxPosY = j+1

print(maxVal)
print(maxPosX, maxPosY)

