"""
ingresar por teclado 4 notas de un estudiante
hallar la nota final del estudiante
imprimir por pantalla si aprobo o no aprobo la materia
el valor para aprobar minimo seria 3
"""

nota1 = float(input("Ingrese la nota1:"))
nota2 = float(input("Ingrese la nota2:"))
nota3 = float(input("Ingrese la nota3:"))
nota4 = float(input("Ingrese la nota4:"))

totalNotas = nota1+nota2+nota3+nota4
notaFinal = totalNotas/4

if notaFinal >= 3:
    print("Aprobo")
else:
    print("No Aprobo")