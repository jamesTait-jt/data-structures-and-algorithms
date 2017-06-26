import random

def checkSorted(arr):
    srtd = True
    for i in range(len(arr) - 1):
        if arr[i+1] < arr[i]:
            srtd = False
            break
    return srtd

def generatePerms(arr):

    if len(arr) <= 1:
        yield arr

    else:
        for perm in generatePerms(arr[1:]):
            for i in range(len(arr)):
                yield perm[:i] + arr[0:1] + perm[i:]


def bogoSort(arr):
    perms = generatePerms(arr)
    for perm in perms:
        if checkSorted(perm):
            return perm

arr = []
for i in range(10):
    arr.append(random.randint(0, 1000))

print(bogoSort(arr))
