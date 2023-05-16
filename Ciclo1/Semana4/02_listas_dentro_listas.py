lista = [[1,1,1,1,1], [2,2,2,2,2]]

# sumar los elementos de la primera sublista utilizando posiciones
suma1 = lista[0][0] + lista[0][1] + lista[0][2] + lista[0][3] + lista[0][4]
print(suma1)

suma2 = lista[1][0] + lista[1][1] + lista[1][2] + lista[1][3] + lista[1][4]
print(suma2)

# sumar los elementos de la primera sublista con un ciclo for
sumaLista1 = 0
for i in range(len(lista[0])):
    sumaLista1 = sumaLista1 + lista[0][i]
print(sumaLista1)

sumaLista2 = 0
for i in range(len(lista[1])):
    sumaLista2 = sumaLista2 + lista[1][i]
print(sumaLista2)

# sumar todos los elementos de las listas contenida en la lista principal
sumaTotal = 0
for indicePrincipal in range(len(lista)):
    sumaParcial = 0
    for indiceSub in range(len(lista[indicePrincipal])):
        sumaParcial = sumaParcial + lista[indicePrincipal][indiceSub]
    print(f"el resultado de la suma de la lista[{indicePrincipal}] es {sumaParcial}")
    sumaTotal = sumaTotal + sumaParcial

print(sumaTotal)