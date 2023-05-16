# menu interactivo
while True:
    print("""
    *********************************************
    Menu Interactivo, Seleccione una opcion
    *********************************************
    1) Saludar
    2) Sumar dos numeros
    3) Salir
    *********************************************
    """)
    opcion = int(input("Escriba una opcion:"))

    if opcion == 1:
        print("*********************************")
        print("hola como estas.")
        print("*********************************")
    elif opcion == 2:
        numero1 = int(input("Ingrese el numero 1:"))
        numero2 = int(input("Ingrese el numero 2:"))
        resultado = numero1+numero2
        print("*********************************")
        print(f"el resultado de la suma es {resultado}")
        print("*********************************")
    elif opcion == 3:
        print("*********************************")
        print("saliendo del sistema....")
        print("*********************************")
        break
    else:
        print("opcion no valida.")
