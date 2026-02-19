import sys

n, m = map(int, sys.stdin.readline().split())
buckets = [i for i in range(1, n+1)]

for i in range(m):
    left, right = map(int, sys.stdin.readline().split())
    slc = buckets[left-1:right]
    slc.reverse()
    buckets[left-1:right] = slc

for bucket in buckets:
    print(bucket, end=" ")