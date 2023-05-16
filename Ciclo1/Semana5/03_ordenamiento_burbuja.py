# Crear una lista y almacenar los nombres de 5 países. 
# Ordenar alfabéticamente la lista e imprimirla.

listaPaises = []

for x in range(5):
    nombrePais = input("Ingrese el nombre de un pais: ")
    listaPaises.append(nombrePais)


print("***************************************")
print("Lista sin ordenar")
print(listaPaises)
print("***************************************")

for k in range(len(listaPaises)-1):
    for x in range(len(listaPaises)-1):
        if listaPaises[x] > listaPaises[x+1]:
            temporal = listaPaises[x]
            # cambio de posiciones
            listaPaises[x] = listaPaises[x+1]
            listaPaises[x+1] = temporal

print("***************************************")
print("Lista ordenada alfabeticamente")
print(listaPaises)
print("***************************************")