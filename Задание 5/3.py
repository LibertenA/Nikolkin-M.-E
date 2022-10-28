# -*- coding: utf-8 -*-
def stepenb(N):
    i=1
    k=0
    while i*2<=N:
        k=k+1
        i=i*2
    print(k, i, sep='\n')

N=int(input())
stepenb(N)
