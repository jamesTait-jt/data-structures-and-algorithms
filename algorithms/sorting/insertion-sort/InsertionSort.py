def insertionSort(arr):
    for i in range(1,len(arr)):
        print(str(i) + "...")
        while(i > 0 and arr[i] < arr[i-1]):
            arr[i], arr[i-1] = arr[i-1], arr[i]
            i -= 1
    return arr


import random

arr = []

for i in range(10000):
    arr.append(random.randint(1, 100))

print(insertionSort(arr) == sorted(arr))
