def digital_root(n):
    n = abs(n)
    while n >9:
        nString = str(n)

        n = 0
        for i in nString:
            n += int(i)
    
    return n

print (digital_root(2020))
print (digital_root(210))
print (digital_root(2110))
print (digital_root(2))
print (digital_root(-250))
