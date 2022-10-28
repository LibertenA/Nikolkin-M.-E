# -*- coding: utf-8 -*-
def stroka(s):
    s1 = ""
    k = 0
    for i in range(0, len(s)):
        if s[i] != '.':
            s1 += s[i]
        else:
            k += 1
    print(s1, k, sep='\n')

s=input()
stroka(s)

