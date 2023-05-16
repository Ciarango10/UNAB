# Crea una lista e inicalizala con 5 cadenas de caracteres leídas por teclado. 
# Copia los elementos de la lista en otra lista pero en orden inverso, y muestra 
# sus elementos por la pantalla.

lista1 = []
lista2 = []

for indice in range(1,6):
    cadena = input(f"Ingrese la cadena {indice}:")
    lista1.append(cadena)

print(lista1)

lista1.reverse()
lista2 = lista1
print(lista2)

for cadena in lista2:
    print(cadena)