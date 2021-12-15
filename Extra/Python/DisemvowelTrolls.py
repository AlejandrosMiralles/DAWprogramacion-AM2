def disemvowel(string_):

    codificado = ""

    for i in string_:
        j = i.lower()
        if not(j == 'a' or j == 'e' or j =='i' or j =='o' or j == 'u'):
            codificado+= i

    return codificado


print(disemvowel("This is a message LOL"))