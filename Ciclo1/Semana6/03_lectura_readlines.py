from io import open

archivo = open('prueba.txt', 'r', encoding='utf8')

# leemos el archivo y convertimos el contenido del archivo en una lista
listaTexto = archivo.readlines()

# cerrar el archivo
archivo.close()

# recorrer la lista con un ciclo for
for i in listaTexto:
    cadena = i.replace('\n','')
    print(cadena)

print("********************************************")

print(listaTexto[3])