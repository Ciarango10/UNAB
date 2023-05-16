# Manejo de excepciones

# Bloque try - except

"""try:
    n = float(input("Ingrese un numero:"))
    m = 4
    print(n/m)
except:
    print("Ha ocurrido un error, debes ingresar un valor numerico")"""

# bloque else
"""while True:
    try:
        n = float(input("Ingrese un numero:"))
        m = 4
        print(n/m)
    except:
        print("Ha ocurrido un error, debes ingresar un valor numerico")
    else:
        #print("Todo funciona correctamente")
        break"""

# bloque finally
while True:
    try:
        n = float(input("Ingrese un numero:"))
        m = 4
        print(n/m)
    except:
        print("Ha ocurrido un error, debes ingresar un valor numerico")
    else:
        #print("Todo funciona correctamente")
        break
    finally:
        print("ejecutandose siempre haya o no error.")
