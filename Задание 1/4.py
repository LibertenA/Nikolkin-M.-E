# -*- coding: utf-8 -*-
seconds=int(input())
minutes=int(seconds/60)
hours=int(seconds/60/60)
days=int(seconds/60/60/24)
print(days,hours,minutes,seconds, sep=':')