"""
Escribir un programa que pida al usuario dos números y devuelva su división. 
Si el usuario no introduce números debe devolver un aviso de error 
y si el divisor es cero también.
"""

# recibir datos por teclado
dividendo = input("Ingrese el dividendo:")
divisor = input("Ingrese el divisor:")

# logica de negocio
if len(dividendo) == 0 or len(divisor) == 0:
    print("Los numeros son obligatorios.")
else:
    if dividendo.isnumeric() and divisor.isnumeric() and int(divisor) > 0:
        resultado = int(dividendo) // int(divisor)
        print(f"el resultado de la division es: {resultado}")
    else:
        print("no puedo hacer la operacion")

