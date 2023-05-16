numeros = [23,25,30,1,28,11,96,2,3,1]

print("**************************")
print("Lista original")
print(numeros)
print("**************************")

longitud = len(numeros)
for i in range(longitud-1):
    for j in range(i+1, longitud):
        if numeros[i] > numeros[j]:
            # intercambiar posiciones
            numeros[i],numeros[j] = numeros[j],numeros[i]

print("**************************")
print("Lista ordenada de menor a mayor")
print(numeros)
print("**************************")