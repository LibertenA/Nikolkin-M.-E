# -*- coding: utf-8 -*-
def matrix(a):
    for i in range(n):
        b = []
        for j in range(n):
            b.append(int(input()))
        a.append(b)
def vyvod(a):
    for i in range(n):
        for j in range(n):
            print(a[i][j], end=' ')
        print()
def symmetrix(n):
    flag = 1
    for i in range(0, n - 1):
        for j in range(i + 1, n):
            if a[i][j] != a[j][i]:
                flag = 0
                break
    if flag!=0:
        print('Матрица симметрична')
    else:
        print('Матрица не симметрична')


n=int(input())
a = []
matrix(a)
file.open()
print("Матрица:")
vyvod(a)
symmetrix(n)
