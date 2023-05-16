"""Escribir un programa que pregunte al usuario su edad 
y muestre por pantalla si es mayor de edad o no.
"""

# recibir datos por teclado
edad = int(input("Ingrese su edad:"))

# logica de negocio
if edad >= 18:
    print("Eres mayor de edad.")
else:
    print("Eres menor de edad.")