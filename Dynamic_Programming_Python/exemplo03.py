import time
from random import randint

tempo_inicial = time.time()

lista = [randint(-100, 100) for i in range(10)]
print(lista)

print(time.time() - tempo_inicial)

def has_zero_sum_triple(a):
    n = len(a)
    for i in range(n):
        for j in range(i + 1, n):
            for k in range(j + 1, n):
                if a[i] + a[j] + a[k] == 0:
                    return True
    return False

print(has_zero_sum_triple(lista))

print("Tempo decorrido: ", time.time() - tempo_inicial)

# Complexidade cúbica O(n³)