"""Dados dos numeros enteros pedidos por teclado 
mostrar las operaciones de suma, resta, 
division y multiplicacion de ambos numeros.
"""

# recibir datos por teclado
numero1 = int(input("Ingrese el numero 1:"))
numero2 = int(input("Ingrese el numero 2:"))

# proceso - logica de negocio
#suma
resultadoSuma = numero1 + numero2
#resta
resultadoResta = numero1 - numero2
#multiplicacion
resultadoMultiplicacion = numero1*numero2
#division
resultadoDivision = numero1/numero2

#salida de datos
print()
print("****************************************")
print("RESULTADO DE LAS OPERACIONES")
print("****************************************")
print(f"SUMA: {resultadoSuma}")
print(f"RESTA: {resultadoResta}")
print(f"MULTIPLICACION: {resultadoMultiplicacion}")
print(f"DIVISION: {resultadoDivision}")
print("****************************************")