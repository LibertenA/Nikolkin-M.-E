# -*- coding: utf-8 -*-
def vyvod(a):
    for i in range(n):
        for j in range(m):
            print(a[i][j], end=' ')
        print()
def max_in_begin(a):
    maximum=a[0][0]
    for i in range(n):
        for j in range(m):
            if maximum < a[i][j]:
                maximum = a[i][j]
                x = i
                y = j
    x1 = 0
    y1 = 0
    for i in range(n):
        t = a[i][y1]
        a[i][y1] = a[i][y]
        a[i][y] = t
    for j in range(m):
        t = a[x1][j]
        a[x1][j] = a[x][j]
        a[x][j] = t

n = int(input())
m = int(input())
a = []
for i in range(n):
    b=[]
    for j in range(m):
        b.append(int(input()))
    a.append(b)
print("Исходный массив:")
vyvod(a)
max_in_begin(a)
print('Итоговый массив:')
vyvod(a)
