# Realizar un programa que inicialice una lista con 10 valores aleatorios (del 1 al 10)
# y posteriormente muestre en pantalla cada elemento de la lista junto con su cuadrado 
# y su cubo.

import random

listaNumeros = []

# llenar la lista de elementos
for indice in range(10):
    listaNumeros.append(random.randint(1,10))

print(listaNumeros)

for numero in listaNumeros:
    print(numero, " - ", numero**2, " - ", numero**3)
