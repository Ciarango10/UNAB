# Se debe crear y cargar una lista donde almacenar 5 sueldos. 
# Ordenar de menor a mayor la lista.


# definimos una lista vacia
listaSueldos = []

for x in range(5):
    valorSueldo = int(input("Ingrese el valor de un sueldo: "))
    listaSueldos.append(valorSueldo)

print("***************************************")
print("Lista sin ordenar")
print(listaSueldos)
print("***************************************")

for k in range(len(listaSueldos)-1):
    for x in range(len(listaSueldos)-1):
        if listaSueldos[x] > listaSueldos[x+1]:
            temporal = listaSueldos[x]
            # cambio de posiciones
            listaSueldos[x] = listaSueldos[x+1]
            listaSueldos[x+1] = temporal

print("***************************************")
print("Lista ordenada de menor a mayor con metodo burbuja")
print(listaSueldos)
print("***************************************")

for k in range(len(listaSueldos)-1):
    for x in range(len(listaSueldos)-1):
        if listaSueldos[x] < listaSueldos[x+1]:
            temporal = listaSueldos[x]
            # cambio de posiciones
            listaSueldos[x] = listaSueldos[x+1]
            listaSueldos[x+1] = temporal

print("***************************************")
print("Lista ordenada de mayor a menor con metodo burbuja")
print(listaSueldos)
print("***************************************")