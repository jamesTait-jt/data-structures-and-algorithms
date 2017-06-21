#TODO: fix lol

def RECPartition(arr, lo, hi):
    pivot = hi
    for i in range(pivot - 1, lo, -1):
        print(i, pivot, arr)
        if arr[i] > arr[pivot]:
            arr[i], arr[pivot] = arr[pivot], arr[i]
            pivot -= 1
    

def RECQuickSort(arr, lo, hi):
    pivot = hi
    RECPartition(arr, lo, pivot)
    RECPartition(arr, pivot + 1, hi)

arr = [5,2,3,1,4]
RECPartition(arr, 0, 4)
print(arr)
