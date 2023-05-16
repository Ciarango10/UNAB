import json

# lista tuplas
contactos = [
    ("manuel", "desarrollador web", "manuel@gmail.com", 1000),
    ("lorena", "desarrollador movil", "lorena@gmail.com", 500),
    ("javier", "dba base de datos", "javier@gmail.com", 600),
    ("ana", "desarrollador backend", "ana@gmail.com", 800),
    ("carlos andres", "desarrollador senior", "andres@gmail.com",2000)
]

datos = {
    "contactos":[],
    "usuarios":[]
}

for nombre,cargo,email,sueldo in contactos:
    datos["contactos"].append({"nombre":nombre,"cargo":cargo,"email":email,"sueldo":sueldo})
    datos["usuarios"].append({"nombre":nombre,"cargo":cargo,"email":email,"sueldo":sueldo})

with open('contactos2.json', 'w', encoding='utf8') as jsonfile:
    json.dump(datos,jsonfile)