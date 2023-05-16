# Se debe crear y cargar una lista donde almacenar 5 sueldos. 
# Desplazar el valor mayor de la lista a la última posición.

# definimos una lista vacia
listaSueldos = []

for x in range(5):
    valorSueldo = int(input("Ingrese el valor de un sueldo: "))
    listaSueldos.append(valorSueldo)

print("***************************************")
print("Lista sin ordenar")
print(listaSueldos)
print("***************************************")

for x in range(len(listaSueldos)-1):
    if listaSueldos[x] > listaSueldos[x+1]:
        temporal = listaSueldos[x]
        # cambio de posiciones
        listaSueldos[x] = listaSueldos[x+1]
        listaSueldos[x+1] = temporal

print("***************************************")
print("Lista con el ultimo elemento ordenado")
print(listaSueldos)
print("***************************************")

