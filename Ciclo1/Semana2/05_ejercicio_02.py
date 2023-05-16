"""
Escribir un programa que almacene la cadena de caracteres 'contraseña' en una variable, 
pregunte al usuario por la contraseña e imprima por pantalla si la contraseña 
introducida por el usuario coincide con la guardada en la variable 
sin tener en cuenta mayúsculas y minúsculas.
"""

# declaracion de variables
clave = "contraseña"
usuario = "admin"

# recibir datos por teclado
usuarioIngresado = input("Ingrese su usuario:")
claveIngrasada = input("Ingrese su contraseña:")

# logica de negocio
if claveIngrasada.lower().strip() == clave and usuarioIngresado.lower().strip() == usuario:
    print("los datos de acceso son correctos.")
else:
    print("los datos de acceso son incorrectos.")