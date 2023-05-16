#Errores de sintaxis
#print("hola"

#Errores de nombres
#pint("hola")

#Errores semanticos
lista = []
#lista.pop()

# validacion
longitudLista = len(lista)
if longitudLista > 0:
    lista.pop()
else:
    print("La lista esta vacia.")

if longitudLista != 0:
    lista.pop()

# TypeError
"""n = input("Ingrese un numero:")
m = 4
print(n/m)"""

#ValueError
n = float(input("Ingrese un numero:"))
m = 4
print(n/m)