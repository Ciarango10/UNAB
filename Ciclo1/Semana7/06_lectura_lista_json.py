import json

with open('contactos.json', encoding='utf8') as jsonfile:
    datos = json.load(jsonfile)

    for contacto in datos:
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