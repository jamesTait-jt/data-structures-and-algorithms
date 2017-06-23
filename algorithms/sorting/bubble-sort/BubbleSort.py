def RECBubbleSort(arr, n):
    i = 0
    swaps = 0
    comps = 0
    print(arr)
    while i + 1 < n:
        if arr[i] > arr[i + 1]:
            arr[i + 1], arr[i] = arr[i], arr[i + 1]
            swaps += 1
        print(arr)
        comps += 1
        i += 1
    print(swaps, comps)
    if not (swaps == 0 and comps == n - 1):
        n -= 1
        RECBubbleSort(arr, n)
    return arr

srtd = RECBubbleSort([4, 2, 1, 3, 10, 9, 4, 7, 6], 9)
print(srtd)

def ITRBubbleSort(arr):
    n = len(arr)
    swaps = 0
    comps = 0
    while not (swaps == 0 and comps == n):
        print(arr)
        swaps = 0
        comps = 0
        for i in range(0, n - 1):
            if arr[i] > arr[i + 1]:
                arr[i], arr[i + 1] = arr[i + 1], arr[i]
                swaps += 1
            print(arr)
            comps += 1
        print(swaps, comps)
        #if n > 5:
        n -= 1
    return arr

srtd = ITRBubbleSort([4, 2, 1, 3, 10, 9, 4, 7, 6])
print (srtd)
