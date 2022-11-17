# -*- coding: utf-8 -*-
from math import *

def gipotenusa(n,n1,m,m1):
    s=sqrt(n**2+n1**2)
    s1=sqrt(m**2+m1**2)
    if s>s1:
        return s
    else:
        return s1
x=int(input('Введите катет первого прямоугольного треугольника:'))
x1=int(input('Введите катет первого прямоугольного треугольника:'))
y=int(input('Введите катет второго прямоугольного треугольника:'))
y1=int(input('Введите катет второго прямоугольного треугольника:'))
print(gipotenusa(x,x1,y,y1))