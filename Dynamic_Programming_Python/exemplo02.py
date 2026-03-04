import time
import random

tempo_inicial = time.time()

lista = [random.randint(0, 100) for _ in range(1000)]
print(lista)

def count_pairs_equal(a):
    c = 0
    count = 0
    for i in range(len(a)):
        for j in range(i + 1, len(a)):
            count += 1
            if a[i] == a[j]:
                c += 1
        return c

print(count_pairs_equal(lista))

print("Tempo decorrido: ", time.time() - tempo_inicial)

# Complexidade é O(n²), pois possui 2 loops