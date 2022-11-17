# -*- coding: utf-8 -*-
from contextlib import redirect_stdout
def matrix():
    file = open('Николькин Михаил Евгеньевич_У-222_vvod.txt', 'r')
    global a
    a = file.readlines()
    for i in range(len(a)):
        a[i] = a[i].split(' ')
        for j in range(len(a[i])):
            a[i][j] = int(a[i][j])
    file.close()
def vyvod(a):
    for i in range(len(a)):
        for j in range(len(a[i])):
            print(a[i][j], end=' ')
        print()
def max_in_begin(a):
    maximum=a[0][0]
    for i in range(len(a)):
        for j in range(len(a[i])):
            if maximum < a[i][j]:
                maximum = a[i][j]
                x = i
                y = j
    x1 = 0
    y1 = 0
    for i in range(len(a)):
        t = a[i][y1]
        a[i][y1] = a[i][y]
        a[i][y] = t
    for j in range(len(a)):
        t = a[x1][j]
        a[x1][j] = a[x][j]
        a[x][j] = t

a = []

matrix()
with open('Николькин Михаил Евгеньевич_У-222_vivod.txt', 'w') as file:
    with redirect_stdout(file):
        print("Исходный массив:")
        vyvod(a)
        max_in_begin(a)
        print("Итоговый массив:")
        vyvod(a)
