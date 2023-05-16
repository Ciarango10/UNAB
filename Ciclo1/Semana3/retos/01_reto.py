codigo = int(input())
nombre = input()
cantidad = float(input())
valorUnitario = float(input())

valorProducto = cantidad * valorUnitario
iva = valorProducto * 0.19
valorFinalProducto = valorProducto + iva

print(codigo)
print(nombre)
print(valorProducto)
print(valorFinalProducto)