# from array import array
#
# numeros = array('i', [10, 20, 30])
#
# for i in numeros:
#     print(i)

# import sys
# from array import array
#
# lista = list(range(1000))
# vetor = array('i', range(1000))
#
# print("Lista: ", sys.getsizeof(lista))
# print("Vetor: ", sys.getsizeof(vetor))

# ----------------------------------------------------------------------------

# Ex 01 | Complexidade é Linear pois executa o tamanho da lista
'''
from array import array
from random import randint

def array_max(array):
    max = array[0]

    for i in range(1, len(array)):
        if array[i] > max:
            max = array[i]

    return max

def array_min(array):
    min = array[0]

    for i in range(1, len(array)):
        if array[i] < min:
            min = array[i]

    return min

array = array('i', [randint(0, 1000) for i in range(100)])
array_max(array)
array_min(array)
'''
# ----------------------------------------------------------------------------

# Ex 02
from random import randint
from array import array

def busca_linear(array, target, size):
    for i in range(size):
        if array[i] == target:
            return "Indice", i
        if target not in lista:
            return -1
    return None

lista = array('i', [randint(0, 100) for i in range(100)])

numero = randint(0, 100)
print("Numero target: ",numero)
print(busca_linear(lista, numero, 100))

