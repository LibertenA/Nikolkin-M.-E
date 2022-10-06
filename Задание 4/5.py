# -*- coding: utf-8 -*-
def num(x,s):
    s=0
    for i in range(1,x+1):
        s=i**3+s
    return(s)
n=int(input())
k=0
print(num(n,k))