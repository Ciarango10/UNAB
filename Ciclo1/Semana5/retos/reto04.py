
def burbujaAscendente(nProductos,listaCodigo,listaNombre,listaCantidad,listaValor,listaIva,valorProducto,valorFinal):
        for x in range(nProductos-1):
            for k in range(nProductos-1):
                if listaNombre[x] > listaNombre[x+1]:
                    temporal = listaNombre[x]
                    listaNombre[x] = listaNombre[x+1]
                    listaNombre[x+1] = temporal

                    temporal = listaCodigo[x]
                    listaCodigo[x] = listaCodigo[x+1]
                    listaCodigo[x+1] = temporal

                    
                    temporal = listaCantidad[x]
                    listaCantidad[x] = listaCantidad[x+1]
                    listaCantidad[x+1] = temporal

                    temporal = listaValor[x]
                    listaValor[x] = listaValor[x+1]
                    listaValor[x+1] = temporal

                    temporal = listaIva[x]
                    listaIva[x] = listaIva[x+1]
                    listaIva[x+1] = temporal

                    temporal = valorProducto[x]
                    valorProducto[x] = valorProducto[x+1]
                    valorProducto[x+1] = temporal

                    temporal = valorFinal[x]
                    valorFinal[x] = valorFinal[x+1]
                    valorFinal[x+1] = temporal
        return listaCodigo,listaNombre,listaCantidad,listaValor,listaIva,valorProducto,valorFinal

nProductos = int(input())
totalIva = 0
valorTotal = 0

listaCodigo = []
listaNombre = []
listaCantidad = []
listaValor = []
listaIva = []
valorProducto = []
valorIva = []
valoresFinalesProductos = []

for producto in range(nProductos):
    listaCodigo.append(int(input()))
    listaNombre.append(input())
    listaCantidad.append(float(input()))
    listaValor.append(float(input()))
    listaIva.append(int(input()))
    
    
for indice in range(nProductos):
    valorProducto.append(listaCantidad[indice]*listaValor[indice])
    
    if listaIva[indice] == 1:
        valorIva.append(0)
    
    elif listaIva[indice] == 2:
        valorIva.append(valorProducto[indice] * 0.05)
    else:
        valorIva.append(valorProducto[indice] * 0.19)
    
    valoresFinalesProductos.append(valorProducto[indice]+valorIva[indice])
    
    valorTotal = valorTotal + valoresFinalesProductos[indice]
    totalIva = totalIva + valorIva[indice] 
    
llistaCodigo,llistaNombre,llistaCantidad,llistaValor,llistaIva,lvalorProducto,lvalorFinal = burbujaAscendente(nProductos,listaCodigo,listaNombre,listaCantidad,listaValor,listaIva,valorProducto,valoresFinalesProductos)
    
for indice in range(nProductos):
    print(llistaCodigo[indice])
    print(llistaNombre[indice])
    print(lvalorProducto[indice])
    print(lvalorFinal[indice])
        
    
print(valorTotal)

if totalIva != 0.0:
        print(totalIva)
else:
        print(int(totalIva))
    
    
