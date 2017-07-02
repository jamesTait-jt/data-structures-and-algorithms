def LSDradix(arr):
    for i in range(len(arr)):
        arr[i] = list(str(arr[i]))
        for j in range(len(arr[i])):
            arr[i][j] = int(arr[i][j])
    
    print (arr)

LSDradix([91,2,3])

