# importar un modulo io
from io import open 

texto = "Primera Línea del archivo\nSegunda Línea del archivo\nTercera Línea del archivo\nCuarta Línea del archivo"

texto2 = """jhon jairo
carlos andres
ana victoria
carolina marquez
frank caceres
edinson diaz
ciro soto
"""

# ruta y nombre donde crearemos el archivo, w indicando escritura y el puntero del archivo se coloca al inicio
#archivo = open('E:\\datos\prueba.txt', 'w', encoding='utf8')
archivo = open('prueba.txt', 'w', encoding='utf8')

# escribimos el contenido al archivo
archivo.write(texto2)

# cerrar el archivo
archivo.close()
