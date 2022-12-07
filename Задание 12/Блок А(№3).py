# -*- coding: utf-8 -*-
def rekursia(a):
    print(a%10)
    if a//10>0:
        rekursia(a=a//10)



x=int(input())
rekursia(x)