# -*- coding: utf-8 -*-
def bag(x,y):
    if x<y:
        for i in range(x,y+1):
            print(i)
    else:
        for i in range(x,y-1,-1):
            print(i)
a=int(input())
b=int(input())
bag(a,b)