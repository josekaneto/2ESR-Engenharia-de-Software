import time, random

tempo_inicial = time.time()

def fib(n):
    if n <= 1:
        return n
    return fib(n - 1) + fib(n - 2)

print(fib(2))

print("Tempo decorrido: ", time.time() - tempo_inicial)

# Complexidade é Exponencial 0(2^n), pois ele executa a primeira vez e faz vezes a primeira vez