n = int(input())
totalVentas = 0
totalIva = 0

for i in range(n):
    codigo = int(input())
    nombre = input()
    cantidad = float(input())
    valorUnitario = float(input())
    tipoIva = int(input())

    valorProducto = cantidad * valorUnitario

    if tipoIva == 1:
        iva = 0
    elif tipoIva == 2:
        iva = valorProducto * 0.05
    else:
        iva = valorProducto * 0.19
    
    valorFinalProducto = valorProducto + iva

    totalVentas = totalVentas + valorFinalProducto
    totalIva = totalIva + iva

    print(codigo)
    print(nombre)
    print(valorProducto)
    print(valorFinalProducto)

print(totalVentas)
print(totalIva)