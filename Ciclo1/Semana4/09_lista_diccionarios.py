listaEstudiantes = []

datosEstudiante1 = {'nombre':'carlos', 'apellido':'diaz', 'edad':25, 'telefono':3177891483,'genero':1}
datosEstudiante2 = {'nombre':'andres', 'apellido':'soto', 'edad':15, 'telefono':3177891500,'genero':1}
datosEstudiante3 = {'nombre':'felipe', 'apellido':'lopez', 'edad':20, 'telefono':3177891600,'genero':1}
datosEstudiante4 = {'nombre':'gerardo', 'apellido':'higuera', 'edad':35, 'telefono':3177891700,'genero':1}
datosEstudiante5 = {'nombre':'luis', 'apellido':'carvajal', 'edad':40, 'telefono':3177891800,'genero':1}
datosEstudiante6 = {'nombre':'cesar', 'apellido':'caceres', 'edad':22, 'telefono':3177891900,'genero':1}
datosEstudiante7 = {'nombre':'ana', 'apellido':'marquez', 'edad':18, 'telefono':3177891901,'genero':2}
datosEstudiante8 = {'nombre':'monica', 'apellido':'lopera', 'edad':19, 'telefono':3177891902,'genero':2}

listaEstudiantes.append(datosEstudiante1)
listaEstudiantes.append(datosEstudiante2)
listaEstudiantes.append(datosEstudiante3)
listaEstudiantes.append(datosEstudiante4) 
listaEstudiantes.append(datosEstudiante5)
listaEstudiantes.append(datosEstudiante6)
listaEstudiantes.append(datosEstudiante7)
listaEstudiantes.append(datosEstudiante8)

print(listaEstudiantes)

for estudiante in listaEstudiantes:
    nombre = estudiante['nombre']
    apellido = estudiante['apellido']
    edad = estudiante['edad']
    telefono = estudiante['telefono']
    genero = estudiante['genero']

    if genero == 1:
        mostrarGenero = 'Masculino'
    else:
        mostrarGenero = 'Femenino'

    print(f"""
    *************************************************
    DETALLES DEL ESTUDIANTE
    *************************************************
    NOMBRES: {nombre}
    APELLIDOS: {apellido}
    EDAD: {edad}
    TELEFONO: {telefono}
    GENERO: {mostrarGenero} 
    *************************************************
    """)
    