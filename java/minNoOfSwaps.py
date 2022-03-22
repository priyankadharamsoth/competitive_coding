def minNoOfSwaps(arr, n):
    count_ones = 0
    for i in range(n):
        if arr[i] == 1:
            count_ones += 1
    
    maxOnes = 0
    currentOnes = 0

    #window size
    x = count_ones

    #count ones in a subarray

    for i in range(0,x):
        if arr[i] == 1:
            currentOnes += 1
    
    maxOnes = currentOnes

    #sliding window
    for i in range(1, n-x+1):
        #check that the no we discarded from the window is 1 or not if 1 decrease count by 1
        if arr[i-1] == 1:
            currentOnes -=1
        #check the number welcomed into the window is 1 or not if 1 increase the count
        if arr[i-x+1] == 1:
            currentOnes += 1

        if maxOnes < currentOnes:
            maxOnes = currentOnes
        
        Noofzereos = x - maxOnes

    return Noofzereos

a = [1, 0, 0, 1, 1, 1, 1, 0, 0, 1]
n = 10
print (minNoOfSwaps(a, n))