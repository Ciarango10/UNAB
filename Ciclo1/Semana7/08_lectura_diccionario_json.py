import json

with open('contactos2.json', encoding="utf8") as jsonfile:
    datos = json.load(jsonfile)
    for contacto in datos["contactos"]:
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

    for contacto in datos["usuarios"]:
        nombre = contacto["nombre"]
        cargo = contacto["cargo"]
        email = contacto["email"]
        sueldo = contacto["sueldo"]

        print(f"""
        *************************************************
        DATOS DEL USUARIO
        *************************************************
        NOMBRE: {nombre}
        CARGO: {cargo}
        EMAIL: {email}
        SUELDO: {sueldo}
        *************************************************
        """)