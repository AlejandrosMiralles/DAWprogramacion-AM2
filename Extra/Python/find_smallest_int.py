def find_smallest_int(arr):
    # Code here
    minimo = arr[0]
    for i in arr:
        if minimo>i:
            minimo = i

    return minimo

print(find_smallest_int([34,52,79,0]))
print(find_smallest_int([3,35,356,345,563,-30]))