# En este ejercicio deberás crear un script llamado personas.py que lea los datos de un archivo de texto, 
# que transforme cada fila en un diccionario y lo añada a una lista llamada personas. 
# Luego rocorre las personas de la lista y para cada una muestra de forma amigable todos sus campos.

# El archivo de texto se denominará personas.txt y tendrá el siguiente contenido en texto plano (créalo previamente):

# 1;Carlos;Pérez;05/01/1989
# 2;Manuel;Heredia;26/12/1973
# 3;Rosa;Campos;12/06/1961
# 4;David;García;25/07/2006

# Los campos del diccionario serán por orden: id, nombre, apellido y nacimiento.

def formatoFecha(fecha):
    fechaProcesar = fecha.split("/")
    dia = fechaProcesar[0]
    mes = fechaProcesar[1]
    anio = fechaProcesar[2]

    nombreMes = ""
    if mes == '01':
        nombreMes = "Enero"
    elif mes == '02':
        nombreMes = "Febrero"
    elif mes == '03':
        nombreMes = "Marzo"
    elif mes == '04':
        nombreMes = "Abril"
    elif mes == '05':
        nombreMes = "Mayo"
    elif mes == '06':
        nombreMes = "Junio"
    elif mes == '07':
        nombreMes = "Julio"
    elif mes == '08':
        nombreMes = "Agosto"
    elif mes == '09':
        nombreMes = "Septiembre"
    elif mes == '10':
        nombreMes = "Octubre"
    elif mes == '11':
        nombreMes = "Noviembre"
    elif mes == '12':
        nombreMes = "Diciembre"
    
    fechaFinal = dia + " de " + nombreMes + " del año " + anio

    return fechaFinal

from io import open

archivo = open('personas.txt', 'r', encoding='utf8')
lineas = archivo.readlines()
archivo.close()

personas = []

for linea in lineas:
    campos = linea.replace('\n','').split(';')
    persona = {"id":campos[0], "nombre":campos[1], "apellido": campos[2], "nacimiento": campos[3]}
    personas.append(persona)


archivo = open('procesados.txt', 'a', encoding='utf8')
for p in personas:
    id = p["id"]
    nombre = p["nombre"]
    apellido = p["apellido"]
    fechaNacimiento = p["nacimiento"]

    nuevaFecha = formatoFecha(fechaNacimiento)

    datosPersona = f"""
    *********************************************************
    DATOS PERSONALES DE {nombre.upper() + " " + apellido.upper()}
    *********************************************************
    ID: {id}
    NOMBRE: {nombre}
    APELLIDOS: {apellido}
    FECHA DE NACIMIENTO: {nuevaFecha}
    *********************************************************
    """
    print(datosPersona)
    archivo.write(datosPersona)

archivo.close()
