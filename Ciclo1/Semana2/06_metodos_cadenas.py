# lower() - devuelve todos los caracteres de la cadena en minuscula
cadena = "CADENA"
print(cadena.lower())

# upper() - devuelve todos los caracteres de la cadena en mayuscula
cadena = "cadena"
print(cadena.upper())

# strip() - quitar espacios en blanco al inicio y al final de la cadena
cadena = " hola "
print(cadena)
print(cadena.strip())

# len() - longitud o tamaño de la cadena
cadena = "hola como estas"
cadena = ""
print(len(cadena))

# isnumeric() - Si la cadena contiene sólo caracteres numéricos, devuelve True, de lo contrario False
cadena = "1000"
print(cadena.isnumeric())

# replace() - remplazar caracteres de una cadena
cadena = "Hola como estas hoy"
nuevaCadena = cadena.replace("a","A")
print(nuevaCadena)

# split() - partir cadenas por algun caracter
cadena = "Hola@como@estas@hoy"
listaCadenas = cadena.split("@")
print(listaCadenas)
print(listaCadenas[0])
