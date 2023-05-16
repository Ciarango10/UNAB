# Argumentos y parametros

# Argumentos por posicion
def resta(numero1,numero2):
    resultado = numero1 - numero2
    return resultado

respuesta = resta(100,20)
print(respuesta)

def datosEstudiante(nombres,apellidos,email,telefono):
    mostrarDatos = f"NOMBRE ESTUDIANTE: {nombres} {apellidos} EMAIL: {email} TELEFONO: {telefono}"
    return mostrarDatos

resultado = datosEstudiante("jhon jairo", "cortes paredes", "jhon@live.com", "3177891483")
print(resultado)

# Argumentos por nombre
resultado = datosEstudiante(email="jhon@live.com", telefono="3177891483", apellidos="cortes paredes", nombres="jhon jairo")
print(resultado)

# Argumentos por defecto
def suma(numero1=0,numero2=0,numero3=0):
    resultado = numero1+numero2+numero3
    return resultado

respuesta = suma(100,200,300)
print(respuesta)
