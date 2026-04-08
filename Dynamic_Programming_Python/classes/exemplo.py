class Dog():
    """Uma classe para modelar um cachorro"""
    def __init__(self, nome , idade):
        self.nome = nome
        self.idade = idade

    def get_nome(self):
        return self.nome

    def get_idade(self):
        return self.idade

    def latir(self):
        return "auauau"

    # def __str__(self):
    #     return f"Nome: {self.nome}, Idade: {self.idade}"

    def __repr__(self):
        return f"Nome: {self.nome}, Idade: {self.idade}"

dog = Dog("Nina", 12)

print(dog)
print(dog)

print(dog.get_nome())
print(dog.get_idade())
print(dog.latir())