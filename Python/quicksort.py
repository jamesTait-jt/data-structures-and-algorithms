#TODO: FIX

def quicksort (A, lo, hi) :
    if (lo < hi) :
        p = partition (A)
        quicksort (A, lo, p)
        quicksort (A, p + 1, hi)

def partition (A) :
    pivot = A[0]
    i = A[0]
    print i
    j = A[len (A) - 1]
    print j
    while (True) :
        while ((A[i] < pivot) and (j > i)) :
            i = i + 1
            print i
        while ((A[j] > pivot) and (j > i)) :
            j = j - 1
            print j
        if (i >= j) :
            return j
        temp = A[i]
        A[i] = A[j]
        A[j] = temp


print (quicksort ([1,4,6,3,8], 0, 4))
