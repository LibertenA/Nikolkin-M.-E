# -*- coding: utf-8 -*-
def min(a,b,c):
    if a>c and b>c:
        return c
    elif a>b and c>b:
        return b
    else:
        return a

a1=int(input())
b1=int(input())
c1=int(input())
print(min(a1,b1,c1))