# -*- coding: utf-8 -*-
def dlin(x):
    k = 0
    s = 0
    while x != 0:
        k = k + 1
        s = s + x
        x = int(input())
    d = s / k
    return d
x = int(input())
print(dlin(x))