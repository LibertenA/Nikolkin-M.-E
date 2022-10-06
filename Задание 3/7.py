# -*- coding: utf-8 -*-
def visoc(a):
    if (a % 4 == 0 and a % 100 != 0) or (a % 400==0):
        return ("Да")
    else:
        return ("Нет")
b=int(input())
print(visoc(b))
