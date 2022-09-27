# -*- coding: utf-8 -*-
age=int(input())
name=input()
if (0 < age < 75) and (name!= 'Иван'):
    if age>=16:
        print('"Поздравляем вы поступили в ВГУИТ"')
    else:
        print('"Сначала нужно окончить школу! Осталось', 16 - age, 'лет"')

