# input() capturar datos por teclado

# entrada de datos
nombreEstudiante = input("Ingrese su nombre:")
edadEstudiante = int(input("Ingrese su edad:"))
telefonoEstudiante = int(input("Ingrese su telefono:"))
direccionEstudiante = input("Ingrese su direccion:")
promedioNotas = float(input("Ingrese su promedio de notas:"))
emailEstudiante = input("Ingrese su email:")

print()
print("***************************************")
print("********DATOS DEL ESTUDIANTE***********")
print("***************************************")
#print("NOMBRE ESTUDIANTE: ", nombreEstudiante)
print(f"NOMBRE ESTUDIANTE: {nombreEstudiante}")
print(f"EDAD ESTUDIANTE: {edadEstudiante}")
print(f"TELEFONO ESTUDIANTE: {telefonoEstudiante}")
print(f"DIRECCION ESTUDIANTE: {direccionEstudiante}")
print(f"PROMEDIO NOTAS ESTUDIANTE: {promedioNotas}")
print(f"EMAIL ESTUDIANTE: {emailEstudiante}")
print("***************************************")

# conversion de tipos de datos
# int() convertir un valor a un numero entero
# float() convertir un valor a un numero con decimales
# str() convertir un valor a una cadena de texto
# bool() convertir un valor a tipo booleano falso o verdadero

# f-string formatear cadenas dentro de la cadena poder imprimir valores de variables