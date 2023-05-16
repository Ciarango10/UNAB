def burbujaAscendente(lista):
    for k in range(len(lista)-1):
        for x in range(len(lista)-1):
            if lista[x] > lista[x+1]:
                temporal = lista[x]
                # cambio de posiciones
                lista[x] = lista[x+1]
                lista[x+1] = temporal

def burbujaDescendente(lista):
    for k in range(len(lista)-1):
        for x in range(len(lista)-1):
            if lista[x] < lista[x+1]:
                temporal = lista[x]
                # cambio de posiciones
                lista[x] = lista[x+1]
                lista[x+1] = temporal

numeros = [23,25,30,1,28,11,96,2,3,1]
sueldos = [1200000,750000,820000,550000,490000]

print("**************************")
print("Listas originales")
print(numeros)
print(sueldos)
print("**************************")

print("**************************")
print("Listas ordenadas de menor a mayor")
burbujaAscendente(numeros)
burbujaAscendente(sueldos)
print(numeros)
print(sueldos)
print("**************************")

print("**************************")
print("Listas ordenadas de mayor a menor")
burbujaDescendente(numeros)
burbujaDescendente(sueldos)
print(numeros)
print(sueldos)
print("**************************")