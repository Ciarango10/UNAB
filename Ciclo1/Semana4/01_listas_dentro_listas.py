lista = [[1,2,3], [4,5,6], [7,8,9], [10,11,12]]
print(lista)

print("**************************************************")

# acceder a elementos de la lista principal
print(lista[0])
print(lista[1])
print(lista[2])

print("**************************************************")

# acceder a elementos de las sublistas
print(lista[0][0])
print(lista[0][1])
print(lista[0][2])

print(lista[1][0])
print(lista[1][1])
print(lista[1][2])

print(lista[2][0])
print(lista[2][1])
print(lista[2][2])

print("**************************************************")
# imprimir la lista con un ciclo for / la primera sublista
for indice in range(len(lista[0])):
    print(lista[0][indice])

for indice in range(len(lista[1])):
    print(lista[1][indice])

print("**************************************************")
# imprimir cada uno de los elementos de cada lista contenida en la lista principal
for indicePrincipal in range(len(lista)):
    for indiceSub in range(len(lista[indicePrincipal])):
        print(lista[indicePrincipal][indiceSub])
