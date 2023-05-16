from io import open

archivo = open('prueba.txt', 'a', encoding='utf8')

texto = "jose andres\n"

archivo.write(texto)

archivo.close()