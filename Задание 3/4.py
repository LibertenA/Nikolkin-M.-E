# -*- coding: utf-8 -*-
def botinok(a1,b1,l1,N1):
    return 2*l1+2*(b1*((N1-2)/2))+a1*(N1-1)
a=int(input())
b=int(input())
l=int(input())
N=int(input())
print(botinok(a,b,l,N))