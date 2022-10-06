# -*- coding: utf-8 -*-
def raven(a,b,c):
    if a == b and b == c:
        return ('3')
    elif a == b or b == c or a == c:
        return ('2')
    else:
        return ('0')
x=int(input())
y=int(input())
z=int(input())
print(raven(x,y,z))
