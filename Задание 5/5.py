# -*- coding: utf-8 -*-
def dlin(x):
    k = 0
    while x != 0:
        k = k + 1
        x = int(input())
    return k
x = int(input())
print(dlin(x))