from random import randint

def RECQuickSort(arr, lo, hi):
    if lo < hi:
        p = RECPartition(arr, lo, hi)
        RECQuickSort(arr, lo, p - 1)
        RECQuickSort(arr, p, hi)
    else:
        return arr

def RECPartition(arr, lo, hi):
    pivot = lo 

    while lo <= hi:

        while arr[lo] < arr[pivot]:
            lo += 1

        while arr[hi] > arr[pivot]:
            hi -= 1

        if lo <= hi:
            arr[lo], arr[hi] = arr[hi], arr[lo]
            lo += 1
            hi -= 1

    return lo


arr = []
for i in range(10000):
    arr.append(randint(1,100000))
       

RECQuickSort(arr, 0, len(arr) - 1)
print(arr == sorted(arr))

