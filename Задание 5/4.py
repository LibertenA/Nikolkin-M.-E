# -*- coding: utf-8 -*-
def probeg(x,y):
    day = 1
    while x < y:
        day = day + 1
        x = x + (x + x / 100 * 10)
    return(day)
x=float(input())
y=float(input())
print(probeg(x,y))