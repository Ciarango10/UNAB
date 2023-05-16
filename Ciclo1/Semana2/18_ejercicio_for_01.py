"""
pedir cantidad de numeros a ingresar y hallar la suma
de los numeros y el promedio
"""
suma = 0

cantidadNumeros = int(input("Cuanto numeros deseas ingresar:"))

for numero in range(cantidadNumeros):
    numeroIngresar = int(input("Ingrese un numero:"))
    suma = suma + numeroIngresar

promedio = suma / cantidadNumeros

print(f"la suma es {suma}")
print(f"el promedio es {promedio}")