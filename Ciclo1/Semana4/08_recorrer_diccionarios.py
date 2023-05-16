datosEstudiante = {
    'nombre':'carlos', 
    'apellido':'diaz', 
    'edad':25, 
    'telefono':3177891483, 
    'direccion':'calle 100', 
    'genero':1
    }

for i in datosEstudiante:
    print(i)

print("********************************************")

for clave in datosEstudiante:
    print(datosEstudiante[clave])

print("********************************************")

for clave in datosEstudiante:
    print(clave, datosEstudiante[clave])

print("********************************************")

for clave,valor in datosEstudiante.items():
    print(clave, valor)