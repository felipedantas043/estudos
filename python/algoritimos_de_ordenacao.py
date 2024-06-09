import random
lista = []


def gerar_lista(tamanho):
    for i in range(tamanho):

        addElemento = random.randint(0, 10)
        lista.append(addElemento)
        i =+ i
    return lista

lista = gerar_lista(10)

def selection_sort(lista):
    operacoes = 0
    for i in range(len(lista)):
        indice_min  = i
        for j in range(i + 1, len(lista)):
            if lista[j] < lista[indice_min]:
                indice_min = j
        lista[i], lista[indice_min] = lista[indice_min], lista[i]
        operacoes = operacoes + 1
    print("Quantidade de trocas: ",operacoes)
    return lista

def insertion_sort(lista):
    operacoes = 0
    for i in range(len(lista)):
        chave = lista[i]
        j = i-1
        while j >= 0 and lista[j] > chave:
            lista[j + 1] = lista[j]
            j-= 1
            operacoes = operacoes + 1
        lista[j + 1] = chave
    print("Quantidade de trocas: ",operacoes)
    return lista

def bubble_sort(lista):
    operacoes = 0
    n = len(lista)
    for i in range(n - 1):
        for j in range(n - 1 - i):
            if lista[j] > lista[j + 1]:
                lista[j], lista[j + 1] = lista[j + 1], lista[j]
                operacoes = operacoes + 1
    print("Quantidade de trocas: ", operacoes)
    return lista