import time, random

tempo_inicial = time.time()

lista = [random.randint(0, 100) for _ in range(10)]

def bubble_sort(a):
    a = a[:] # cópia
    n = len(a)
    for i in range(n):
        for j in range(0, n - 1 - i):
            if a[j] > a[j + 1]:
                a[j], a[j + 1] = a[j + 1], a[j]
    return a

print(bubble_sort(lista))

print("Tempo gasto: ", time.time() - tempo_inicial)

# Complexidade é Qadratica O(n²), pois possui 2 loops