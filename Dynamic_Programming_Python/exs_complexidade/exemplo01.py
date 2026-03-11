import time

tempo_inicial = time.time()

lista = [i for i in range(10000)]

print(lista)

def get_last(a):
    return a[len(a) - 1]

get_last(lista)

print("Tempo decorrido: ", time.time() - tempo_inicial)

# complexidade é Constante pois não tem nenhum loop