#TODO: REST OF ALG

str = 'aabaabaaa'

def findPrefTable (str) :
    prefTable = []
    for letter in str :
        prefTable.append(0)
    j = 0
    for i in range (1 , len (str)) :
        prefTable[0] = 0
        if (str[i] == str [j]) :
            prefTable[i] = j + 1
            j = j + 1
        elif (str[i] != str [j]) :
            j = prefTable[j - 1]
            if (str[i] == str[j]) :
                prefTable[i] = j + 1
            else :
                prefTable[i] = 0
    return prefTable
print findPrefTable (str)
