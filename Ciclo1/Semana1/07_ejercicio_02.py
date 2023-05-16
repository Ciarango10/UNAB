"""un vendedor recibe un sueldo base, mas un 20% extra por 
comisiones de sus ventas,el vendedor desea saber cuanto dinero obtendra 
por concepto de comisiones por 5 ventas,
realizada en el mes, ademas el total que recibira 
en el mes del sueldo base mas las comisiones.
"""

# recibir datos por teclado
sueldoBase = float(input("Ingrese el sueldo base:"))
venta1 = float(input("Ingrese el valor de la venta 1 :"))
venta2 = float(input("Ingrese el valor de la venta 2 :"))
venta3 = float(input("Ingrese el valor de la venta 3 :"))
venta4 = float(input("Ingrese el valor de la venta 4 :"))
venta5 = float(input("Ingrese el valor de la venta 5 :"))

# proceso - logica de negocio
totalVentas = venta1+venta2+venta3+venta4+venta5
valorComision = totalVentas * 20 / 100
sueldoFinal = sueldoBase + valorComision

# salida de datos
print()
print("********************************************")
print("VALORES TOTALES LIQUIDADOS")
print("********************************************")
print(f"TOTAL VENTAS: {totalVentas}")
print(f"TOTAL COMISIONES: {valorComision}")
print(f"SUELDO FINAL: {sueldoFinal}")
print("********************************************")
