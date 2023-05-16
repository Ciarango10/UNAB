# control de excepciones multiples

"""try:
    n = input("Ingrese un numero:")
    operacion = 5/n
except Exception as e:
    print("Ha ocurrido un error =>", type(e).__name__)"""


try:
    n = float(input("Ingrese un numero:"))
    operacion = 5/n
except TypeError:
    print("No se puede dividir el numero entre una cadena.")
except ValueError:
    print("Debes ingresar un valor que sea numerico")
except ZeroDivisionError:
    print("No se puede dividir por cero, ingrese otro numero.")
except Exception as e:
    print("Ha ocurrido un error =>", type(e).__name__)
