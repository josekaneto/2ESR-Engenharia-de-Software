def factorial(n):
    if n <= 1:
        return 1
    return n * factorial(n - 1)

print(factorial(100))

# Complexidade é Fatorial O(n!), o mais crítico