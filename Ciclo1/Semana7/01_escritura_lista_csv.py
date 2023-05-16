# importar modulo csv
import csv

# lista tuplas
contactos = [
    ("manuel", "desarrollador web", "manuel@gmail.com", 1000),
    ("lorena", "desarrollador movil", "lorena@gmail.com", 500),
    ("javier", "dba base de datos", "javier@gmail.com", 600),
    ("ana", "desarrollador backend", "ana@gmail.com", 800),
    ("carlos andres", "desarrollador senior", "andres@gmail.com",2000)
]

# with permite abrir un archivo dentro de un bloque de codigo no hace falta que cerremos el archivo de forma manual
# newline indica el caracter de salto de linea que deseo utilizar
# writer es un escritor que creamos para trabajar con el archivo
# delimiter indica el caracter delimitardor que queremos usar para separar los valores
# writerow sirve para escribir una nueva fila en el archivo csv
with open('contactos.csv', 'w', newline='\n', encoding='utf8') as csvfile:
    writer = csv.writer(csvfile, delimiter=',')
    for contacto in contactos:
        writer.writerow(contacto)