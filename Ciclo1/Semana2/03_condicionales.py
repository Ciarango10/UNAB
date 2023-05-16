"""
los condicionales permiten dividir el flujo de un programa en diferentes caminos
sentencia if(si)
el if se ejecuta siempre que la expresion que comprueba devuelva true
"""
a=5
b=10

if a==2:
    print("a vale 2")

if a==5:
    print("a vale 5")

# condiciones con multiples expresiones
if a==5 and b==10:
    print("a vale 5 y b vale 10")

# sentencia else (sino)
if a==2:
    print("a vale 2")
else:
    print("el valor no es igual a 2 es 5.")

# condiciones anidadas
if a==5:
    print("a vale 5")
    if b==10:
        print("y b vale", b)

numero1 = 20
numero2 = 50

if numero1 > 0:
    if numero1 >= 20:
        resultado = numero1+numero2
        print(f"la suma es: {resultado}")
        if resultado > 50:
            print("toda la operacion se realizo correctamente.")

# condicionales sentencia elif
comando = input("Ingrese el comando en mayuscula:")

if comando == "ENTRAR":
    print("Bienvenido al sistema")
elif comando == "SALUDAR":
    print("Hola como estas.")
elif comando == "SALIR":
    print("Saliendo del sistema.")
else:
    print("comando no reconocido")


