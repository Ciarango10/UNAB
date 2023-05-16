"""
ingresar dos numeros de tipo entero por teclado.
validar que los numeros no sean vacios.
elaborar un programa que contenga un menu de opciones:
1 - sumar dos numeros
2 - restar dos numeros
3 - multiplicar dos numeros
4 - dividir dos numeros
5 - aplicar el modulo de la division
6 - saliendo del programa
"""

# recibir datos por teclado
numero1 = input("Ingrese el numero 1:")
numero2 = input("Ingrese el numero 2:")

# logica de negocio
if len(numero1) == 0 or len(numero2) == 0:
    print("Los numeros son ogligatorios.")
else:
    if numero1.isnumeric() and numero2.isnumeric():
        print("""
        ****************************************************
        MENU DE OPCIONES
        ****************************************************
        1) SUMAR
        2) RESTAR
        3) MULTIPLICACION
        4) DIVIDIR
        5) HALLAR EL MODULO
        6) SALIR DEL PROGRAMA
        ****************************************************
        """)
        opcion = int(input("Ingrese la opcion deseada:"))
        numero1Final = int(numero1)
        numero2Final = int(numero2)

        if opcion == 1:
            resultado = numero1Final + numero2Final
            print(f"el resultado de la suma es {resultado}")
        elif opcion == 2:
            resultado = numero1Final - numero2Final
            print(f"el resultado de la resta es {resultado}")
        elif opcion == 3:
            resultado = numero1Final * numero2Final
            print(f"el resultado de la multiplacion es {resultado}")
        elif opcion == 4:
            if numero2Final > 0:
                resultado = numero1Final / numero2Final
                print(f"el resultado de la division es {resultado}")
            else:
                print("el numero 2 debe ser mayor a cero.")
        elif opcion == 5:
            resultado = numero1Final % numero2Final
            print(f"el residuo de la division es {resultado}")
        elif opcion == 6:
            print("saliendo del programa.")
        else:
            print("opcion no valida.")
    else:
        print("Los valores deben ser numericos.")