from collections import deque

fila_alta = deque()
fila_media = deque()
fila_baixa = deque()

# inserções
fila_media.append("Cliente 1")
fila_alta.append("Emergência")
fila_baixa.append("Consulta simples")

def atender():
    if fila_alta:
        return fila_alta.popleft()
    elif fila_media:
        return fila_media.popleft()
    elif fila_baixa:
        return fila_baixa.popleft()
    else:
        return "Sem ninguém"

print(atender()) # Emergência
print(atender()) # Cliente 1
print(atender()) # Consulta simples