#TODO: reduce comparisons by forgetting already sorted elements.
#TODO: Tidy up recursive.
#TODO: Iterative.


def AscBubbleSort(arr):
    i = 0
    j = 1
    swaps = 0
    comps = 0
    print(arr)
    while j < len(arr):
        if arr[i] > arr[j]:
            arr[j], arr[i] = arr[i], arr[j]
            swaps += 1
            print(arr)
        comps += 1
        i += 1
        j += 1
    if swaps == 0 and comps == len(arr) - 1:
        return arr
    else:
        AscBubbleSort(arr)

AscBubbleSort([4, 1, 2, 3, 10, 9, 4, 7, 6])
