# -*- coding: utf-8 -*-
from math import *
x=3.74*pow(10,-2)
y=-0.825
z=0.16*10**2
s=(1+sin(x+y)**2)/abs(x-(2*y)/(1+pow(x,2)*pow(y,2)))*pow(x,abs(y))+cos(atan(1/z))**2
print(s)