import random
from random import randint

# stack = []
#
# def push(stack, item):
#     stack.append(item)
#
# def pop(stack):
#     if is_empty(stack):
#         raise IndexError("Pilha vazia")
#     return stack.pop()
#
# def peek(stack):
#     if is_empty(stack):
#         raise IndexError("Pilha vazia")
#     return stack[-1]
#
# def is_empty(stack):
#     return len(stack) == 0
#
# # 4 comandos principais
# stack = []
#
# # push
# stack.append(10)
#
# # pop
# stack.pop()
#
# # peek
# stack[-1]
#
# # size
# len(stack)
#
# # is_empty
# len(stack) == 0
from multiprocessing.connection import arbitrary_address
from zipapp import create_archive


# Exercício 1 Criar uma função que recebe uma string e usa uma pilha para inverter o conteúdo da string

def inverter(string):
    pilha = []

    for char in string:
        pilha.append(char)

    resultado = ""
    while pilha:
        resultado += pilha.pop()
    return resultado

print(inverter("abacaxi"))

# Exercício 2

def palindrome(string):
    string_lower = string.lower()
    pilha = []
    for char in string_lower:
        pilha.append(char)

    resultado = ''
    while pilha:
        resultado += pilha.pop()

    if resultado == string_lower:
        return "Palíndromo"
    else:
        return "Não é um Palíndromo"

print(palindrome("Amor A Roma"))

# Exercício 3

lista = ["A", "B", "C", "UNDO", "D"]

def sequencia_de_comandos(lista):
    pilha  = []

    for char in lista:
        if char != "UNDO":
            pilha.append(char)
        else:
            pilha.pop()
    return pilha

print(sequencia_de_comandos(lista))






