# Definicion de diccionarios
diccionario = {} # vacio
print(type(diccionario))

datosEstudiante = {
    'nombre':'carlos', 
    'apellido':'diaz', 
    'edad':25, 
    'telefono':3177891483, 
    'direccion':'calle 100', 
    'genero':1
    }
print(datosEstudiante)

# acceder a los valores del diccionario
print(datosEstudiante['edad'])
print(datosEstudiante['nombre'])
print(datosEstudiante['telefono'])

# agregar elementos nuevos
print(datosEstudiante)
datosEstudiante['email'] = "correo@ejemplo.com"
print(datosEstudiante)

# modificar elementos
print(datosEstudiante)
datosEstudiante['nombre'] = "andres"
print(datosEstudiante)

# Metodos diccionarios

# get() - traer el valor por la clave pero no existe la clave devuelve un mensaje
print(datosEstudiante.get('apellido', 'no existe esta clave en el diccionario.'))
print(datosEstudiante.get('nombre', 'no existe esta clave en el diccionario.'))
print(datosEstudiante.get('email', 'no existe esta clave en el diccionario.'))

# keys() genera una lista en clave de los registros del diccionario
print(datosEstudiante.keys())

# values() genera una lista en valores de los registros del diccionario
print(datosEstudiante.values())

# items() generar una lista clave-valor
print(datosEstudiante.items())

# pop() eliminar un elemento apartir de su clave
print(datosEstudiante.pop('apellido', 'no existe esa clave'))
print(datosEstudiante)

# clear() elimina todos los elementos del diccionario
datosEstudiante.clear()
print(datosEstudiante)