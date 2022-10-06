# -*- coding: utf-8 -*-
def fibon(N):
    k = 1
    s = 0
    n = 0
    sum=0
    sum1=0
    for i in range(0, N):
        n = k + s
        if K-1>i:
            sum1 = sum1 + n
        else:
            sum = sum + n
        k = s
        s = n
    return(sum)
N=int(input())
K=int(input())
print(fibon(N))