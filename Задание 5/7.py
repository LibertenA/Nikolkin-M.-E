# -*- coding: utf-8 -*-
def dlin(x):
    k = 0
    y=x
    while x != 0:
        if x>y:
            k = k + 1
        y=x
        x = int(input())
    return k
x = int(input())
print(dlin(x))