# sentencia while (mientras)
contador = 0

while contador < 5:
    print(f"valor de contador {contador}")

    # incrementar el contador
    contador = contador + 1

print("**************************************************")

# uso sentancia else
contador = 0

while contador <= 5:
    print(f"valor del contador {contador}")
    contador = contador + 1
else:
    print(f"se ha completado las iteraciones y contador vale {contador}")

print("**************************************************")

# sentencia brake - sirve para romper o finalizar el ciclo cuando se desee
contador = 0

while contador <= 5:
    contador = contador + 1

    if contador == 4:
        print(f"finalizamos el ciclo cuando contador vale {contador}")
        break

    print(f"contador vale {contador}")
else:
    print(f"se ha completado las iteraciones y contador vale {contador}")

print("**************************************************")

# sentencia continue
contador = 0

while contador <= 5:
    contador = contador + 1

    if contador == 3 or contador == 4:
        continue

    print(f"contador vale {contador}")
else:
    print(f"se ha completado las iteraciones y contador vale {contador}")