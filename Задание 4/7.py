# -*- coding: utf-8 -*-
def factorial(x,s):
    s=0
    g=1
    for i in range(1,x+1):
        g=g*i
        s=g+s
    return(s)
n=int(input())
k=0
print(factorial(n,k))