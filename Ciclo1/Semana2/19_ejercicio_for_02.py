# definicion de variables
iva = 19

costoTotalProductoGlobal = 0
costoFinalProductoGlobal = 0

cantidadProductos = int(input("Cuantos productos desea ingresar a inventario:"))

for producto in range(1, cantidadProductos+1):
    # recibir datos por teclado
    nombreProducto = input(f"Ingrese el nombre del producto {producto}:")
    codigoProducto = int(input(f"Ingrese el codigo del producto {producto}:"))
    tipoProducto = int(input(f"Ingrese el tipo de producto 1 servicio o 2 fisico para el producto {producto}:"))
    tipoFlete = int(input(f"Ingrese el tipo de flete 1 nacional o 2 internacional para el producto {producto}:"))
    cantidadProducto = int(input(f"Ingrese la cantidad de producto a inventario para el producto {producto}:"))
    costoProductoSinIva = float(input(f"Ingrese el costo del producto sin IVA para el producto {producto}:"))

    # logica de negocio
    if tipoProducto == 1:
        porcentajeGanancia = 20
    elif tipoProducto == 2:
        porcentajeGanancia = 35
    else:
        porcentajeGanancia = 0

    if tipoFlete == 1:
        porcentajeFlete = 20
    elif tipoFlete == 2:
        porcentajeFlete = 45
    else:
        porcentajeFlete = 0

    #calculamos el valor del flete
    valorFlete = costoProductoSinIva * porcentajeFlete / 100

    #calculamos el costo final del producto
    formulaIva = 1 + (iva / 100)
    costoFinalPorProducto = (costoProductoSinIva * formulaIva) + valorFlete

    # calculamos el valor de la ganancia por producto
    valorGananciaPorProducto = costoProductoSinIva * porcentajeGanancia / 100

    #calculamos el costo total de los productos
    costoTotalProducto = costoFinalPorProducto * cantidadProducto

    # calculamos el precio venta por producto
    precioVentaPorProducto = costoFinalPorProducto + valorGananciaPorProducto

    costoTotalProductoGlobal = costoTotalProductoGlobal + costoTotalProducto
    costoFinalProductoGlobal = costoFinalProductoGlobal + costoFinalPorProducto

    # salida de datos
    print(f"""
    *****************************************************
    DETALLES DEL PRODUCTO {producto}
    *****************************************************
    COSTO FINAL PRODUCTO: {round(costoFinalPorProducto,2)}
    PRECIO VENTA PRODUCTO: {round(precioVentaPorProducto,2)}
    COSTO TOTAL PRODUCTO: {round(costoTotalProducto,2)}
    VALOR GANANCIA PRODUCTO: {round(valorGananciaPorProducto,2)}
    *****************************************************
    """)


print(f"""
    *****************************************************
    VALORES TOTALES
    *****************************************************
    COSTO FINAL PRODUCTOS: {round(costoFinalProductoGlobal,2)}
    COSTO TOTAL PRODUCTOS: {round(costoTotalProductoGlobal,2)}
    *****************************************************
    """)