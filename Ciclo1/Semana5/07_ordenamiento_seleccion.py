def seleccionAscendente(lista):
    longitud = len(lista)
    for i in range(longitud-1):
        for j in range(i+1, longitud):
            if lista[i] > lista[j]:
                # intercambiar posiciones
                lista[i],lista[j] = lista[j],lista[i]

def seleccionDescendente(lista):
    longitud = len(lista)
    for i in range(longitud-1):
        for j in range(i+1, longitud):
            if lista[i] < lista[j]:
                # intercambiar posiciones
                lista[i],lista[j] = lista[j],lista[i]

numeros = [23,25,30,1,28,11,96,2,3,1]
sueldos = [1200000,750000,820000,550000,490000]

print("**************************")
print("Listas originales")
print(numeros)
print(sueldos)
print("**************************")

print("**************************")
print("Listas ordenadas de menor a mayor")
seleccionAscendente(numeros)
seleccionAscendente(sueldos)
print(numeros)
print(sueldos)
print("**************************")

print("**************************")
print("Listas ordenadas de mayor a menor")
seleccionDescendente(numeros)
seleccionDescendente(sueldos)
print(numeros)
print(sueldos)
print("**************************")