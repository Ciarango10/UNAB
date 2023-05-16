#listas
listaNumeros = [] # definir lista vacia
print(listaNumeros)
listaNumeros = [1,2,3,4,5]
print(listaNumeros)

# indices o posiciones
datos = [4, "una cadena", -15, 3.14, "otra cadena"]
print(datos)
print(datos[0])
print(datos[4])
print(datos[-1]) # ultimo elemento de lista
print(datos[-2])

# agregar elementos a una lista
# append() - agregar un elemento al final de la lista
datos = [4, "una cadena", -15, 3.14, "otra cadena"]
print(datos)
datos.append(50)
datos.append("una nueva cadena")
datos.append(35.85)
print(datos)

# modificar elementos de la lista
datos[0] = 10
datos[3] = 20.5
print(datos)

# longitud de una lista
# len() - saber cuanto elementos tiene la lista
print(len(datos))