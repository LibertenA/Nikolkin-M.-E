# -*- coding: utf-8 -*-
def matrix():
    file = open('Николькин Михаил Евгеньевич_У-222_vvod.txt', 'r')
    global a
    a = file.readlines()
    for i in range(len(a)):
        a[i]=a[i].split(' ')
        if len(a)!=len(a[i]):
            print('Ошибка! Матрица не квадратная!!!')
            return
        for j in range(len(a[i])):
            a[i][j]=int(a[i][j])
    file.close()
def vyvod(a):
    for i in range(len(a)):
        for j in range(len(a[i])):
            print(a[i][j], end=' ')
        print()
def symmetrix(n):
    file = open('Николькин Михаил Евгеньевич_У-222_vivod.txt', 'w')
    flag = 1
    for i in range(0, n - 1):
        for j in range(i + 1, n):
            if a[i][j] != a[j][i]:
                flag = 0
                break
    if flag!=0:
        file.write('Матрица симметрична')
    else:
        file.write('Матрица не симметрична')
    file.close()


a = []
matrix()

print("Матрица:")
vyvod(a)
symmetrix(len(a))