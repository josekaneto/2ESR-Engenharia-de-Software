import time, random

tempo_inicial = time.time()

def binary_search(arr, target):
    left = 0
    right = len(arr) - 1

    while left <= right:
        mid = (left + right) // 2

        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1

    return -1


# cria lista aleatória
a = random.sample(range(1, 100), 10)

# ordena a lista
sorted_a = sorted(a)

# cria queries aleatórias
queries = random.sample(range(1, 100), 5)

hits = 0
for q in queries:
    if binary_search(sorted_a, q) != -1:
        hits += 1

print("Lista ordenada:", sorted_a)
print("Queries:", queries)
print("Quantidade encontrada:", hits)

print("Tempo gasto: ", time.time() - tempo_inicial)

# Complexidade é Linear O(n), pois tem apneas um loop