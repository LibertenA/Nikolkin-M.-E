# -*- coding: utf-8 -*-
def factorial(x,s):
    s=1
    for i in range(1,x+1):
        s=i*s
    return(s)
n=int(input())
k=1
print(factorial(n,k))