# -- coding: utf-8 --
def choco(n1,m1,k1):
    if (k1<n1*m1) and (k1%n1==0) and (k1%m1==0):
        return('Да')
    else:
        return('Нет')
n=int(input("Введите количество долек по ширине:"))
m=int(input("Введите количество долек по длине:"))
k=int(input("Введите количество оставшихся после разделения долек:"))
print(choco(n,m,k))
