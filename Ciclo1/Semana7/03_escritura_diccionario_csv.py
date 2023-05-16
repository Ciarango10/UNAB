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

# DictWriter es el escritor para colecciones de datos de tipo diccionario
# fieldnames indica el nombre de las claves o campos en el archivo csv que contiene el diccionario
# writeheader sirve para escribir los campos o claves en el archivo csv
with open('contactos2.csv', 'w', newline='\n', encoding='utf8') as csvfile:
    campos = ["nombre","cargo","email","sueldo"]
    writer = csv.DictWriter(csvfile, fieldnames=campos)
    writer.writeheader()

    for nombre,cargo,email,sueldo in contactos:
        writer.writerow({
            "nombre":nombre,"cargo":cargo,"email":email,"sueldo":sueldo
        })
