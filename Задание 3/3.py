# -- coding: utf-8 --
def t(minutes):
    minutes=minutes%(60*24)
    hours=minutes//60
    return hours,minutes%60
n=int(input())
hours,min=t(n)
print(hours, min, sep=':')