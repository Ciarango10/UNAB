# definicion de funciones
def calcularValores(costoProducto, porcentajeFlete, tarifaIva, porcentajeGanancia, cantidadProducto):
    #calculamos el valor del flete
    valorFlete = costoProducto * porcentajeFlete / 100

    #calculamos el costo final del producto
    costoFinalPorProducto = (costoProducto * tarifaIva) + valorFlete

    # calculamos el valor de la ganancia por producto
    valorGananciaPorProducto = costoProducto * porcentajeGanancia / 100

    #calculamos el costo total de los productos
    costoTotalProducto = costoFinalPorProducto * cantidadProducto

    # calculamos el precio venta por producto
    precioVentaPorProducto = costoFinalPorProducto + valorGananciaPorProducto

    return costoFinalPorProducto,valorGananciaPorProducto,costoTotalProducto,precioVentaPorProducto

def imprimirDetalleProducto(costoFinalPorProducto,precioVentaPorProducto,costoTotalProducto,valorGananciaPorProducto,nombreProducto):
    print(f"""
    *****************************************************
    DETALLES DEL PRODUCTO {nombreProducto}
    *****************************************************
    COSTO FINAL PRODUCTO: {round(costoFinalPorProducto,2)}
    PRECIO VENTA PRODUCTO: {round(precioVentaPorProducto,2)}
    COSTO TOTAL PRODUCTO: {round(costoTotalProducto,2)}
    VALOR GANANCIA PRODUCTO: {round(valorGananciaPorProducto,2)}
    *****************************************************
    """)

def imprimirTotalProducto(costoFinalProductoGlobal,costoTotalProductoGlobal):
    print(f"""
    *****************************************************
    VALORES TOTALES
    *****************************************************
    COSTO FINAL PRODUCTOS: {round(costoFinalProductoGlobal,2)}
    COSTO TOTAL PRODUCTOS: {round(costoTotalProductoGlobal,2)}
    *****************************************************
    """)

# definicion de variables
iva = 19

# definicion de listas
listaNombres = []
listaCodigos = []
listaTipoProducto = []
listaTipoFlete = []
listaCantidad = []
listaPrecioCosto = []

costoTotalProductoGlobal = 0
costoFinalProductoGlobal = 0

cantidadProductos = int(input("Cuantos productos desea ingresar a inventario:"))

for producto in range(1, cantidadProductos+1):
    # recibir datos por teclado
    nombreProducto = input(f"Ingrese el nombre del producto {producto}:")

    while True:
        try:
            codigoProducto = int(input(f"Ingrese el codigo del producto {producto}:"))
        except:
            print("el valor debe ser un numero.")
        else:
            break

    while True:
        try:
            tipoProducto = int(input(f"Ingrese el tipo de producto 1 servicio o 2 fisico para el producto {producto}:"))
        except:
            print("el valor debe ser un numero.")
        else:
            break

    while True:
        try:
            tipoFlete = int(input(f"Ingrese el tipo de flete 1 nacional o 2 internacional para el producto {producto}:"))
        except:
            print("el valor debe ser un numero.")
        else:
            break

    while True:
        try:
            cantidadProducto = int(input(f"Ingrese la cantidad de producto a inventario para el producto {producto}:"))
        except:
            print("el valor debe ser un numero.")
        else:
            break

    while True:
        try:
            costoProductoSinIva = float(input(f"Ingrese el costo del producto sin IVA para el producto {producto}:"))
        except:
            print("el valor debe ser un numero.")
        else:
            break
    
    listaNombres.append(nombreProducto)
    listaCodigos.append(codigoProducto)
    listaTipoProducto.append(tipoProducto)
    listaTipoFlete.append(tipoFlete)
    listaCantidad.append(cantidadProducto)
    listaPrecioCosto.append(costoProductoSinIva)

"""print(listaNombres)
print(listaCodigos)
print(listaTipoProducto)
print(listaTipoFlete)
print(listaCantidad)
print(listaPrecioCosto)"""

for indice in range(cantidadProductos):
    if listaTipoProducto[indice] == 1:
        porcentajeGanancia = 20
    elif listaTipoProducto[indice] == 2:
        porcentajeGanancia = 35
    else:
        porcentajeGanancia = 0

    if listaTipoFlete[indice] == 1:
        porcentajeFlete = 20
    elif listaTipoFlete[indice] == 2:
        porcentajeFlete = 45
    else:
        porcentajeFlete = 0

    resultados = calcularValores(listaPrecioCosto[indice],porcentajeFlete,1.19,porcentajeGanancia,listaCantidad[indice])

    costoTotalProductoGlobal = costoTotalProductoGlobal + resultados[2]
    costoFinalProductoGlobal = costoFinalProductoGlobal + resultados[0]

    imprimirDetalleProducto(resultados[0],resultados[3],resultados[2],resultados[1],listaNombres[indice])

imprimirTotalProducto(costoTotalProductoGlobal,costoFinalProductoGlobal)