import csv

with open('contactos.csv', 'r', newline='\n', encoding='utf8') as csvfile:
    reader = csv.reader(csvfile, delimiter=',')
    for nombre,cargo,email,sueldo in reader:
        print(f"""
        *****************************************************
        DETALLES DEL EMPLEADO
        *****************************************************
        NOMBRE: {nombre}
        CARGO: {cargo}
        EMAIL: {email}
        SUELDO: {sueldo}
        *****************************************************
        """)