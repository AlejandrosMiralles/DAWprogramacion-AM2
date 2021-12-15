def descending_order(num):

    numero = str(num)
    orden = [-1 for i in range(len(numero))]
    resultado = ""

    for i in range(len(numero)):
        posicion = len(numero)-1

        for j in range(len(numero)):
            if i !=j and numero[i]>=numero[j]:
                posicion-=1
        
        while (orden[posicion] == numero[i]): 
            posicion += 1

        orden[posicion] = numero[i]
    
    for letra in orden:
        resultado+= str(letra)

    return int(resultado) 

print(descending_order(345))
print(descending_order(3446))
print(descending_order(864))
print(descending_order(684))
print(descending_order(565426243))

            
            
        

