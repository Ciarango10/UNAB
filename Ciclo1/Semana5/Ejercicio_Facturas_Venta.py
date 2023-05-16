consecutivoIncial = 500
iva19 = 1.19
iva5 = 1.05
numeroFactura = consecutivoIncial
listaDicFactura501 = []
listaDicFactura502 = []
listaDicFactura503 = []  

cantidadFacturas = int(input("¿Cuantas facturas deseas crear?: "))

for i in range(1,cantidadFacturas+1):
    nombreCliente = input(f"Ingrese el nombre del cliente para la factura {i}: ")
    documentoCliente = int(input(f"Ingrese el documento del cliente para la factura {i}: "))
    numeroFactura = numeroFactura + 1

    if numeroFactura == 501:
        listaDicFactura501.append({"nombre":nombreCliente,"documento":documentoCliente,"numerofactura":numeroFactura})
    elif numeroFactura == 502:
        listaDicFactura502.append({"nombre":nombreCliente,"documento":documentoCliente,"numerofactura":numeroFactura})
    elif numeroFactura == 503:
        listaDicFactura503.append({"nombre":nombreCliente,"documento":documentoCliente,"numerofactura":numeroFactura})
    
    print(f"La factura de venta Nro. {numeroFactura} fue creada correctamente.")

    print(f"""
    ********************************************************************
    ingrese los productos de la factura {numeroFactura}
    ********************************************************************
    """)

    for producto in range(1,4):
        cantidadProducto = int(input(f"Ingrese la cantidad del producto {producto} de la factura {numeroFactura}:"))
        detalleProducto = input(f"Ingrese el detalle del producto {producto} de la factura {numeroFactura}:")
        precioUnitarioSinIva = float(input(f"Ingrese el precio unitario sin IVA del producto {producto} de la factura {numeroFactura}:"))
        porcentajeIva = int(input(f"Ingrese el porcentaje del IVA del producto {producto} de la factura {numeroFactura}:"))
        porcentajeDescuento = float(input(f"Ingrese el porcentaje del descuento del producto {producto} de la factura {numeroFactura}:"))

        if numeroFactura == 501:
            listaDicFactura501.append(
                {
                    "cantidad":cantidadProducto,
                    "detalle":detalleProducto,
                    "preciounitario":precioUnitarioSinIva, 
                    "poriva":porcentajeIva,
                    "pordescuento":porcentajeDescuento
                })
        elif numeroFactura == 502:
            listaDicFactura502.append({
                    "cantidad":cantidadProducto,
                    "detalle":detalleProducto,
                    "preciounitario":precioUnitarioSinIva, 
                    "poriva":porcentajeIva,
                    "pordescuento":porcentajeDescuento
                })
        elif numeroFactura == 503:
            listaDicFactura503.append({
                    "cantidad":cantidadProducto,
                    "detalle":detalleProducto,
                    "preciounitario":precioUnitarioSinIva, 
                    "poriva":porcentajeIva,
                    "pordescuento":porcentajeDescuento
                })
print(listaDicFactura501)
print(listaDicFactura502)
print(listaDicFactura503)