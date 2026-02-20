import sys

n, m = map(int, sys.stdin.readline().split(" "))
inp = [i+1 for i in range(n)]
for i in range(m):
    l, r = map(int, sys.stdin.readline().split(" "))
    l, r = l-1, r-1
    tmp = inp[l]
    inp[l] = inp[r]
    inp[r] = tmp
print(*inp)