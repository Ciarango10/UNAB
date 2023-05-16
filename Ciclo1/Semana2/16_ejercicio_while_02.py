# Algoritmo que pida números hasta que se ingrese un cero. 
# Debe imprimir la suma y la media de todos los números ingresados.
acumulador = 0
contador = 0

numero = int(input("ingrese un numero diferente de cero:"))

while numero != 0:
    acumulador = acumulador + numero
    contador = contador + 1
    numero = int(input("ingrese un numero diferente de cero:"))

media = acumulador / contador

print(f"la suma es {acumulador}")
print(f"la media es {media}")