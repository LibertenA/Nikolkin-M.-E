# -*- coding: utf-8 -*-
def bagg(x,y):
    if x>y:
        if x%2!=0:
            for i in range(x,y-1,-2):
                print(i)
        else:
            x=x-1
            for i in range(x,y-1,-2):
                print(i)
a=int(input())
b=int(input())
bagg(a,b)