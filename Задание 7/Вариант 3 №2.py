# -*- coding: utf-8 -*-
def bruh(n):
    D = []
    for i in range(0, n):
        D.append(int(input()))
    print("Не преобразованный массив:", D, sep='\n')
    for i in range(0, n):
        if D[i] < 15:
            D[i] = D[i] * 2
    print("Преобразованный массив:")
    return D
n=8
print(bruh(n))
