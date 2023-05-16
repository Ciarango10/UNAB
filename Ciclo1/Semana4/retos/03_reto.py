nProductos = int(input())
totalIva = 0
valorTotal = 0

listaCodigo = []
listaNombre = []
listaCantidad = []
listaValor = []
listaIva = []

for producto in range(nProductos):
    codigoProducto = int(input())
    nombreProducto = str(input())
    cantidadComprada = float(input())
    valorUnitario = float(input())
    tipoIva = int(input())
    
    listaCodigo.append(codigoProducto)
    listaNombre.append(nombreProducto)
    listaCantidad.append(cantidadComprada)
    listaValor.append(valorUnitario)
    listaIva.append(tipoIva)

    
print(len(listaCodigo))
print(len(listaNombre))
print(len(listaCantidad))
print(len(listaValor))
print(len(listaIva))


for indice in range(nProductos):
   
    if listaIva[indice] == 1:
        iva = 0
        
    elif listaIva[indice] == 2:
        iva = 0.05
    
    elif listaIva[indice] == 3:
        iva = 0.19
    
    valorProducto = listaCantidad[indice] * listaValor[indice]
    valorIva = valorProducto * iva 
    valorFinal= valorIva + valorProducto
    valorTotal = valorTotal + valorFinal
    totalIva = totalIva + valorIva 
    
    print(listaCodigo[indice])
    print(listaNombre[indice])
    print(valorProducto)
    print(valorFinal)
    
print(valorTotal)

if totalIva != 0.0:
    print(totalIva)
else:
    print(int(totalIva))
