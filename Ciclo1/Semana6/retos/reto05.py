
def burbujaAscendente(nProductos,listaCodigo,listaCantidad,listaIva,valorProducto,valorFinal):
        for x in range(nProductos-1):
            for k in range(nProductos-1):
                if listaCodigo[x] > listaCodigo[x+1]:
                    temporal = listaCodigo[x]
                    listaCodigo[x] = listaCodigo[x+1]
                    listaCodigo[x+1] = temporal
                    
                    temporal = listaCantidad[x]
                    listaCantidad[x] = listaCantidad[x+1]
                    listaCantidad[x+1] = temporal
                    
                    temporal = listaIva[x]
                    listaIva[x] = listaIva[x+1]
                    listaIva[x+1] = temporal

                    temporal = valorProducto[x]
                    valorProducto[x] = valorProducto[x+1]
                    valorProducto[x+1] = temporal

                    temporal = valorFinal[x]
                    valorFinal[x] = valorFinal[x+1]
                    valorFinal[x+1] = temporal
        return listaCodigo,listaCantidad,listaIva,valorProducto,valorFinal

nProductos = int(input())

#contadores
totalIva = 0
valorTotal = 0

#diccionarios
articulos={1:"Lapiz",2:"Cuaderno",3:"Borrador",4:"Regla",5:"ColoresX12",6:"Escuadra",7:"Calculadora",8:"CrayonesX6"}
precios={1:2500,2:4500,3:1500,4:5000,5:24000,6:4700,7:45000,8:8900}

#listas
listaCodigo = []
listaCantidad = []
listaIva = []
valorProducto = []
valorIva = []
valoresFinalesProductos = []

for producto in range(nProductos):
    listaCodigo.append(int(input()))
    listaCantidad.append(float(input()))
    listaIva.append(int(input()))
    
    
for indice in range(nProductos):
    valorProducto.append(listaCantidad[indice]*precios[listaCodigo[indice]])
    
    if listaIva[indice] == 1:
        valorIva.append(0)
    
    elif listaIva[indice] == 2:
        valorIva.append(valorProducto[indice] * 0.05)
    else:
        valorIva.append(valorProducto[indice] * 0.19)
    
    valoresFinalesProductos.append(valorProducto[indice]+valorIva[indice])
    
    valorTotal = valorTotal + valoresFinalesProductos[indice]
    totalIva = totalIva + valorIva[indice] 
    
llistaCodigo,llistaCantidad,llistaIva,lvalorProducto,lvalorFinal = burbujaAscendente(nProductos,listaCodigo,listaCantidad,listaIva,valorProducto,valoresFinalesProductos)
    
for indice in range(nProductos):
    print(llistaCodigo[indice])
    print(articulos[listaCodigo[indice]])
    print(lvalorProducto[indice])
    print(lvalorFinal[indice])
        
    
print(valorTotal)

if totalIva != 0.0:
        print(totalIva)
else:
        print(int(totalIva))
    