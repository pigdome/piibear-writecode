# Author piibear writecode

def sum(list):
    if len(list) == 1:
        return list[0]
    else:
        return list[0] + sum(list[1:])

print(sum([2, 4, 6, 8, 9]))