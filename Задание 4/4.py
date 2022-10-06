# -*- coding: utf-8 -*-
def sum_chisel(N):
    s=0
    for i in range(N):
        n = int(input())
        s = s + n
    return(s)
N=int(input())
print(sum_chisel(N))
