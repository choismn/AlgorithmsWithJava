import sys

alp = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]
cnt = 0

inp = sys.stdin.readline().rstrip()

for a in alp:
    posList = []
    pos = inp.find(a)
    if pos != -1:
        posList.append(pos)
        cnt+=1
    while pos != -1:
        pos = inp.find(a, pos+1)
        if pos!= -1:
            posList.append(pos)
            cnt+=1
        
    for p in posList:
        inp = list(inp)
        for j in range(len(a)):
            inp[p+j] = "0"
        inp = "".join(inp)
        
            
for f in inp:
    if f!='0':
        cnt+=1

print(cnt)