# sentencia for (para)

# recorrer una lista usando un ciclo while
numeros = [1,2,3,4,5,6,7,8,9,10]
indice = 0

while indice < len(numeros):
    print(f"posicion {indice} = {numeros[indice]}")
    indice = indice + 1

print("***************************************************")

# recorrer una lista usando un ciclo for
numeros = [1,2,3,4,5,6,7,8,9,10]
indice = 0
for numero in numeros:
    print(f"posicion {indice} = {numero}")
    indice = indice + 1

print("***************************************************")

# enumerate() - para obtener el indice y el valor de cada posicion
numeros = [1,2,3,4,5,6,7,8,9,10]
for posicion, valor in enumerate(numeros):
    print(f"posicion {posicion} = {valor}")

print("***************************************************")

# funcion range()
# inicial (valor inicial) sino se declara inicia en cero por defecto
# final (final-1)
# paso (el incremento) incrementar en 1 por defecto

for numero in range(10):
    print(numero)

print("***************************************************")

for numero in range(1,10):
    print(numero)

print("***************************************************")

for numero in range(1,10,2):
    print(numero)