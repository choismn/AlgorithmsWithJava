import sys

n = int(sys.stdin.readline().rstrip())
li = list(map(int, sys.stdin.readline().rstrip().split()))
b, c = map(int, sys.stdin.readline().rstrip().split())

cnt = 0
for member in li:
    if member <= b:
        cnt+=1
    else:
        member = member-b
        cnt+=1

        boocnt = member//c
        if member%c != 0:
            boocnt += 1
        cnt += boocnt

print(cnt)