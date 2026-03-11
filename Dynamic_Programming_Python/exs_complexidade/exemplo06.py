import time

tempo_inicial = time.time()

words1 = [
    "internet",
    "interior",
    "interacao",
    "internacional",
    "interromper"
]
def common_prefix(words):
    if not words:
        return ""
    p = words[0]
    for w in words[1:]:
        while not w.startswith(p):
            p = p[:-1]
            if p == "":
                return ""
    return p

print(common_prefix(words1))

print("Tempo gasto: ", time.time() - tempo_inicial)

#Complexidade é Quadrática O(n²), pois possui 2 loops