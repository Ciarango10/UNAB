def saludar():
    return "hola como estas"

cadena = saludar()
print(cadena)

def retornaListas():
    return [1,2,3,4,5]

lista = retornaListas()
print(lista)

# retorno de multiples valores
def prueba():
    cadena = "una cadena"
    entero = 100
    lista = [1,2,3]
    return cadena,entero,lista

tuplaRespuesta = prueba()
print(type(tuplaRespuesta))
print(tuplaRespuesta)

cadenaR = tuplaRespuesta[0]
enteroR = tuplaRespuesta[1]
listaR = tuplaRespuesta[2]
print(cadenaR)
print(enteroR)
print(listaR)

cadenaR, enteroR, listaR = prueba()
print(cadenaR)