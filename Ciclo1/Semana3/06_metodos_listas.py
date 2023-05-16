# append() - agregar un elemento al final lista
lista = [1,2,3,4,5]
print(lista)
lista.append(6)
lista.append(7)
print(lista)

print("***************************************************")
#clear() - vaciar todos los elementos de una lista
lista.clear()
print(lista)

print("***************************************************")
# extend() - une una lista con otra
lista1 = [1,2,3]
print(lista1)
lista2 = [4,5,6]
print(lista2)
lista1.extend(lista2)
print(lista1)

print("***************************************************")
# count() - cuenta el numero de veces que aparece un elemento dentro una lista
listaCadenas = ["hola", "mundo", "mundo"]
print(listaCadenas.count("mundo"))

print("***************************************************")
#index() - devuelve el indice en el que aparece un elemento
listaCadenas = ["hola", "mundo", "mundo"]
print(listaCadenas.index("mundo"))

print("***************************************************")
# insert() - agregar un elemento a la lista en una posicion especifica
lista = [1,2,3,4,5,6,7,8,9]
print(lista)
lista.insert(0,100)
print(lista)

print("***************************************************")
# pop() - eliminar un elemento de la lista
lista = [1,2,3,4,5,6,7,8,9]
print(lista)
print(lista.pop())
print(lista)
print(lista.pop(2))
print(lista)

print("***************************************************")
# remove() - borra el primer elemento de la lista cuyo valor concuerde
lista = [20,30,30,30,40]
lista.remove(30)
print(lista)

print("***************************************************")
# reverse()le da la vuelta a la lista
lista = [20,30,30,30,40]
print(lista)
lista.reverse()
print(lista)

print("***************************************************")
# sort() - ordenar la lista por su valor de menor a mayor
lista = [5,-10,35,0,-65,100]
print(lista)
lista.sort()
print(lista)

print("***************************************************")
# len() obtiene la longitud de la lista
print(len(lista))