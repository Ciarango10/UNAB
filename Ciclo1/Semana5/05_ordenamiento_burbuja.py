#Realizar un programa que permita cargar los nombres de 5 alumnos 
# y sus notas respectivas. 
# Luego ordenar las notas de mayor a menor. Imprimir las notas 
# y los nombres de los alumnos.

listaAlumnos = []
listaNotas = []

for x in range(5):
    nombreAlumno = input("Ingrese el nombre del alumno: ")
    listaAlumnos.append(nombreAlumno)
    notaAlumno = int(input("Ingrese la nota del alumno: "))
    listaNotas.append(notaAlumno)

#print(listaAlumnos)
#print(listaNotas)

for k in range(len(listaNotas)-1):
    for x in range(len(listaNotas)-1):
        if listaNotas[x] < listaNotas[x+1]:
            temporal = listaNotas[x]
            # cambio de valores
            listaNotas[x] = listaNotas[x+1]
            listaNotas[x+1] = temporal
            temporal2 = listaAlumnos[x]
            listaAlumnos[x] = listaAlumnos[x+1]
            listaAlumnos[x+1] = temporal2

for x in range(5):
    print(listaAlumnos[x], listaNotas[x])