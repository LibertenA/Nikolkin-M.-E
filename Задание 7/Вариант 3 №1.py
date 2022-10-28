# -*- coding: utf-8 -*-
def massive(n):
    D = []
    k = 0
    for i in range(0, n + 1):
        D.append(int(input()))
    for i in range(1, n + 1, 2):
        k += D[i]
    return D, k

n = int(input())
print(massive(n))



