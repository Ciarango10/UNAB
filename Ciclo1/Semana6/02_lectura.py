from io import open

archivo = open('prueba.txt', 'r', encoding='utf8')

# lectura completa
texto = archivo.read()

# cerrar el archivo
archivo.close()

print(texto)