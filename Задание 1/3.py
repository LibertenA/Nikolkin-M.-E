# -*- coding: utf-8 -*-
age=int(input())
name=input()
if (0 < age < 75) and (name.lower()!='Иван'):
    if age>=16:
        print('"Поздравляем вы поступили в ВГУИТ"')
    else:
        print('"Сначала нужно окончить школу!"')
        if age==15:
            print('Вам еще учиться', 16-age, 'год')
        elif age<15 and age>11:
            print('Вам еще учиться', 16 - age, 'годa')
        else:
            print('Вам еще учиться', 16 - age, 'лет')
