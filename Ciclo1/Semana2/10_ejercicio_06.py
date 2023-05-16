"""Desarrolle un algoritmo que permita 
leer tres valores numericos y almacenarlos en las variables
num1, num2 y num3 respectivamente. 
El algoritmo debe imprimir cual es el mayor de lo numeros"""

num1 = int(input("Ingrese el numero 1:"))
num2 = int(input("Ingrese el numero 2:"))
num3 = int(input("Ingrese el numero 3:"))

if num1>num2 and num1>num3:
    print(f"el numero 1 es el mayor {num1}")
elif num2>num1 and num2>num3:
    print(f"el numero 2 es el mayor {num2}")
else:
    print(f"el numero 3 es el mayor {num3}")