import time
import random

tempo_inicial = time.time()

lista = [i for i in range(10)]

print(lista)

def some_search(a, target):
    lo, hi = 0, len(a) - 1
    while lo <= hi:
        mid = (lo + hi) // 2
        if a[mid] == target:
            return mid
        if a[mid] < target:
            lo = mid + 1
        else:
            hi = mid - 1
    return -1

print(some_search(lista, 3))

# Complexidade é 0(log n), pois é uma busca binária e esta sendo divido por 2


