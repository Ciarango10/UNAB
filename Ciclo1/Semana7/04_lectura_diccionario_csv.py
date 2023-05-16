import csv


with open('contactos2.csv', 'r', newline='\n', encoding='utf8') as csvfile:
    reader = csv.DictReader(csvfile)

    for contacto in reader:
        nombre = contacto["nombre"]
        cargo = contacto["cargo"]
        email = contacto["email"]
        sueldo = contacto["sueldo"]

        print(f"""
        *************************************************
        DATOS DEL EMPLEADO
        *************************************************
        NOMBRE: {nombre}
        CARGO: {cargo}
        EMAIL: {email}
        SUELDO: {sueldo}
        *************************************************
        """)