from io import open

try:
    archivo = open('prueba.txt', 'w', encoding='utf8')
    archivo.write('java\n')
    archivo.write('python\n')
    archivo.write('php\n')
    archivo.write('javascript\n')
    archivo.write('typescript\n')
    archivo.write('go\n')
    archivo.write('asp net\n')
    archivo.write('c#\n')
except Exception as e:
    print(e)
finally:
    archivo.close()
