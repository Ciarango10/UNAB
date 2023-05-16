# Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un 
# alumno (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, 
# la nota media, la nota más alta que ha sacado y la menor.

listaNotas = []

for indice in range(1,6):
    while True:
        try:
            nota = float(input(f"ingrese la nota {indice}:"))
            if nota >= 0 and nota <= 10:
                break
            else:
                print("La nota no se encuentra en el rango de 0 a 10.")
        except:
            print("Debes ingresar un valor numerico.")
    listaNotas.append(nota)

for nota in listaNotas:
    print(nota)

print()
promedio = sum(listaNotas) / len(listaNotas)
notaAlta = max(listaNotas)
notaBaja = min(listaNotas)

print(f"la media de las notas es {promedio}")
print(f"la nota mas alta es {notaAlta}")
print(f"la nota mas baja es {notaBaja}")