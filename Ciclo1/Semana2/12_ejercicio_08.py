"""
La empresa Cloudata SAS requiere contratar un desarrollador para elaborar 
un programa que sea ejecutado por consola usando el lenguaje de programación Python en su versión 3, 
que permita realizar el proceso de ingreso de 1 producto a un inventario.

•	El programa debe pedir el nombre del producto este debe ser de tipo cadena.
•	El programa debe pedir el código del producto este puede ser de tipo entero.
•	El programa debe pedir el tipo de producto de acuerdo a los siguientes valores, 
1 es servicio, 2 es físico el valor debe ser de tipo entero.
•	El programa debe pedir el tipo de flete del producto de acuerdo a los siguientes valores 1 flete nacional, 
2 flete internacional el valor debe ser de tipo entero.
•	El programa debe pedir la cantidad de producto a ingresar al inventario este debe ser de tipo entero.
•	El programa debe pedir el precio costo del producto sin incluir el IVA este debe ser de tipo flotante.

•	Si el producto es de tipo servicio se debe aplicar un 20% de margen de ganancia para hallar el precio de venta del producto.
•	Si el producto es de tipo físico se debe aplicar un 35% de margen de ganancia para hallar el precio venta del producto.

•	Si el tipo de flete a aplicar es nacional se debe aplicar el 20% al valor costo del producto sin IVA del producto ingresado.
•	Si el tipo de flete a aplicar es internacional se debe aplicar el 45% al valor costo del producto sin IVA del producto ingresado.

•	El porcentaje del IVA a aplicar en los cálculos debe ser el 19%
•	El programa debe calcular el valor del flete utilizando la siguiente formula valorFlete = costoSinIvaPorProducto * porcentajeFlete / 100
•	El programa debe calcular el costo final por producto incluido el valor de IVA utilizando 
la siguiente formula costoFinalPorProducto = (costoSinIvaPorProducto * 1.19) + valorFlete.
•	El programa debe calcular el valor de ganancia por producto basado en la siguiente formula 
valorGananciaPorProducto = costoSinIvaPorProducto * porcentajeGanacia / 100
•	El programa debe calcular el costo total del producto utilizando la siguiente formula 
costoTotalProducto = costoFinalProducto * cantidadProductos
•	El programa debe calcular el precio de venta por producto utilizando la siguiente formula 
precioVentaPorProducto = costoFinalProducto + valorGananciaPorProducto

•	El programa debe imprimir en pantalla por producto el costoFinalProducto, precioVentaProducto, 
costoTotalProducto y el valor gananciaPorProducto.
•	Para el redondeo de valores numéricos se debe utilizar la función round() 
para limitar a dos decimales los valores resultantes ejemplo round(precioVentaProducto).
•	Para la impresión de mensajes en pantalla utilizar la función f-string que nos permite colocar 
variables en la impresión de la siguiente manera ejemplo: 
print(f"Costo final por producto: {round(costoFinalProducto, 2)}")

formulaIva = 1 + (porcentajeIva / 100)
"""

# definicion de variables
iva = 19

# recibir datos por teclado
nombreProducto = input("Ingrese el nombre del producto:")
codigoProducto = int(input("Ingrese el codigo del producto:"))
tipoProducto = int(input("Ingrese el tipo de producto 1 servicio o 2 fisico:"))
tipoFlete = int(input("Ingrese el tipo de flete 1 nacional o 2 internacional:"))
cantidadProducto = int(input("Ingrese la cantidad de producto a inventario:"))
costoProductoSinIva = float(input("Ingrese el costo del producto sin IVA:"))

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

# salida de datos
print(f"""
*****************************************************
DETALLES DEL PRODUCTO
*****************************************************
COSTO FINAL PRODUCTO: {round(costoFinalPorProducto,2)}
PRECIO VENTA PRODUCTO: {round(precioVentaPorProducto,2)}
COSTO TOTAL PRODUCTO: {round(costoTotalProducto,2)}
VALOR GANANCIA PRODUCTO: {round(valorGananciaPorProducto,2)}
*****************************************************
""")