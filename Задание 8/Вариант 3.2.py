# -*- coding: utf-8 -*-
def alfabet(stroka):
    str1 = ''.join(sorted(str))
    s = ''
    for i in range(len(str1)):
        if str1[i] != ' ':
            s = s + str1[i]
    return s

str=input()
print(alfabet(str))
