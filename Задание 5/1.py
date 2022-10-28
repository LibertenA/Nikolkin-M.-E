# -*- coding: utf-8 -*-
def quadrat(N):
    k=1
    x=1
    while k**2<N:
        x=k**2
        print(x)
        k=k+1

N=int(input())
quadrat(N)
