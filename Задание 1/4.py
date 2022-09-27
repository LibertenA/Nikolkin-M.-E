# -*- coding: utf-8 -*-
seconds=int(input())
minutes=int(seconds/60)
seconds=seconds-minutes*60
hours=int(minutes/60)
minutes=minutes-hours*60
days=int(hours/24)
hours=hours-days*24
print(days,hours,minutes,seconds, sep=':')