from collections import deque

fila_alta = deque()
fila_baixa = deque()

pessoas = [
    {
        "nome": "Pedro",
        "idade": 80
    },
    {
        "nome": "Antonio",
        "idade": 50
    },
    {
        "nome": "Bia",
        "idade": 90
    },
    {
        "nome": "André",
        "idade": 30
    }
]

def inserção(paciente):
    for p in paciente:
        if p["idade"] >= 65:
            fila_alta.append(p)
        else:
            fila_baixa.append(p)

def atender():
    if fila_alta:
        return fila_alta.popleft()
    elif fila_baixa:
        return fila_baixa.popleft()
    else:
        return "Sem ninguém"

inserção(pessoas)

retorno = ''
while(retorno != "Sem ninguém"):
    retorno = atender()
    print(f"Atendimento - ", retorno)
