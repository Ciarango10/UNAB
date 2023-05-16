def busquedaLineal(lista,elemento):
    longitud = len(lista)
    for i in range(longitud):
        if lista[i] == elemento:
            return i
    return -1

numeros = [1,2,3,4,5,5,7,8,9,10]
elementoBuscar = 20

posicion = busquedaLineal(numeros,elementoBuscar)
print(posicion)
