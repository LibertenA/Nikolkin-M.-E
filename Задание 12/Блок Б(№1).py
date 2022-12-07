# -*- coding: utf-8 -*-
def sas():
    n = int(input())
    if n!=0:
        max = sas()
        if n > max:
            return n
        else:
            return max
    else:
        return 0

print(sas())


