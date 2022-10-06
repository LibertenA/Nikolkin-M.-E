# -*- coding: utf-8 -*-
def fibon(N):
    k = 1
    s = 0
    n = 0
    sum=0
    for i in range(0, N):
        n = k + s
        sum = sum + n
        k = s
        s = n
    return(sum)
N=int(input())
print(fibon(N))
