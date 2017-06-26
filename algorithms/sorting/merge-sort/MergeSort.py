import random

def divide(arr):
    ret = []
    for n in arr:
        ret.append([n])
    return ret

def merge(arr1, arr2):
    ret = []
    lim = len(arr1 + arr2)
    while len(ret) < lim:
        if arr1 == []:
            ret.extend(arr2)
        elif arr2 == []:
            ret.extend(arr1)
        elif arr1[0] < arr2[0]:
            ret.append(arr1[0])
            arr1.pop(0)
        else:
            ret.append(arr2[0])
            arr2.pop(0)
    return ret

def mergeSort(arr):
    divided = divide(arr)
    while len(divided) > 0:
        srtd = []
        for i in range(0, len(divided) - 1 , 2):
            srtd.append(merge(divided[i] , divided[i+1]))
        if not srtd == []:
            divided = srtd
        else:
            return [item for sublist in divided for item in sublist]

arr = []    
for i in range(20000):
    arr.append(random.randint(0, 10000))

print(mergeSort(arr))
