# -- coding: utf-8 --
def squad(a,a1,b,b1):
    if ((a % 2 != 0 and a1 % 2 != 0) and ((b % 2 != 0) and (b1 % 2 != 0)))\
            or ((a % 2 != 0 and a1 % 2 != 0) and (b % 2 == 0 and b1 % 2 == 0))\
            or ((a % 2 == 0 and a1 % 2 == 0) and (b % 2 == 0 and b1 % 2 == 0))\
            or ((a % 2 == 0 and a1 % 2 == 0) and (b % 2 != 0 and b1 % 2 != 0))\
            or ((a % 2 == 0 and a1 % 2 != 0) and (b % 2 == 0 and b1 % 2 != 0))\
            or ((a % 2 != 0 and a1 % 2 == 0) and (b % 2 != 0 and b1 % 2 == 0))\
            or ((a % 2 == 0 and a1 % 2 != 0) and (b % 2 != 0 and b1 % 2 == 0))\
            or ((a % 2 != 0 and a1 % 2 == 0) and (b % 2 != 0 and b1 % 2 == 0)):
        return("Да")
    else:
        return("Нет")
x=int(input("Введите столбец(от 1 до 8) первой клетки:"))
x1=int(input("Введите строку(от 1 до 8) первой клетки:"))
y=int(input("Введите столбец(от 1 до 8) второй клетки:"))
y1=int(input("Введите строку(от 1 до 8) второй клетки:"))
print(squad(x,x1,y,y1))
