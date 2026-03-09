def perm(n):
    if n == 0:
        return 1
    total = 0
    for i in range(n):
        total += perm(n - 1)
        print(total)
    return total

print(perm(3))

#Complexidade Fatorial O(n!), pois eu chamo a função de novo 