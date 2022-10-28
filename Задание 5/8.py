# -*- coding: utf-8 -*-
def dlin(x):
    k = 0
    maximum=0
    y=0
    while x != 0:
        if x==y:
            k = k + 1
        y=x
        x = int(input())
        if x !=y:
            if k>maximum:
                maximum=k
                k=0
    return maximum
x = int(input())
print(dlin(x))