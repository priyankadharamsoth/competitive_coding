# def linearSearch(arr,n):
#     for ele in range(0,len(arr)):
#         if arr[ele] == n:
#             return True
#     return False

# def BinarySearch(arr,n):
#     l = 0
#     r = len(arr)-1 
#     while (l <= r):
#         mid = (l+r)//2
#         if arr[mid] == n:
#             return True
#         if arr[mid] < n:
#             l = mid+1
#         else:
#             r = mid-1
#     return False



# arr = [1,2,3,4,5]
# n = 7
# print(linearSearch(arr,n))
# print(BinarySearch(arr,n))


#counting



# def NonDuplicate(nums):
#     d = {}

#     for ele in nums:
#         if ele not in d:
#             d[ele] = 1
#         else:
#             d[ele] += 1
            
#     return [key for key,val in d.items() if val == 1]
    
# str = [1,2,1,3,2]
# print(NonDuplicate(str))

# arr = [1,2,3,4,2,3,4]
# xor = 0
# for ele in arr:
#     xor ^= ele
# print(xor)


# #second max
# from re import I


# arr = [ 1,2,3,4,2,3,1,5,6]
# Max = arr[0]
# secMax = arr[0]

# #get the max first

# for ele in arr:
#     if ele > Max :
#         Max = ele
    
# #now get the sec max
# for ele in arr:
#     if ele > secMax and ele != Max:
#         secMax = ele
# print(secMax)

# set1 = set(arr)
# list1 = list(set1)
# print(list1[-2])









# def get_key(val):
#     for key, value in my_dict.items():
#          if val == value:
#              return key
 
#     return "key doesn't exist"
 
# # Driver Code
 
# my_dict ={"java":100, "python":112, "c":11}
 
# print(get_key(100))
# print(get_key(11))

# str1 = 'priyanka'
# for i in range(len(str1)-1,-1,-1):
#     print(str1[i], end = '')


# str1 = 'priyanka'
# str2 = ''
# for ch in str1:
#     str2  = ch+ str2
# print(str2)


# str1 = 'priyanka'
# str2 = ''
# count = len(str1)
# while (count > 0):
#     str2 += str1[count-1]
#     count = count-1
# print(str2)


# def Factorial (n):
#     if n == 0 or n == 1:
#         return 1
#     return n * Factorial(n-1)

# print(Factorial(5))

# def print_factors(x):
#    for i in range(1, x + 1):
#        if x % i == 0:
#            print(i)


# n = 320
# print_factors(n)

# def PrimeNumber(n):
#     if n > 1:
#         for i in range(2,int(n/2)+1):
#             if n%i == 0:
#                 return False
#         return True

#     else:
#         print('enter valid number')

# if PrimeNumber(10):
#     print('prime num')
# else:
#     print('not prime')


# # fibinocci series

# def fibinocii(n):
#     if n == 0 or n == 1:
#         return n
#     else:
#         return fibinocii(n-1)+fibinocii(n-2)

# print(fibinocii(11))


# def Target(arr,target):
#     d = {}
#     for idx,ele in enumerate(arr):
#         ele2 = target - ele
#         if ele2 in d:
#             return (d[ele2],idx)
#         else:
#             d[ele] = idx

# arr = [2,3,5,6]
# target = 5
# print(Target(arr,target))


# from typing import Counter


# str = 'abbcdabbcde'
# count = Counter(str)
# print([key for key,val in count.items() if val == 1])

# bubble sort

# def bsort(arr):
#     for i in range(len(arr)-1,-1,-1):
#         for j in range(0,i):
#             if arr[j] > arr[j+1]:
#                 arr[j],arr[j+1] = arr[j+1], arr[j]


# def ssort(arr):
#     for i in range(len(arr)-1,-1,-1):
#         maxpos = i
#         for j in range(0,i):
#             if arr[maxpos] < arr[j]:
#                 maxpos = j
#         arr[i],arr[maxpos] = arr[maxpos], arr[i]
            

# arr = [1,5,4,3,6]
# ssort(arr)
# print(arr)

#merge sort

# def mergeSort(arr):
#     if len(arr) >1:
        
#         mid = len(arr)//2

#         left_arr = arr[:mid]
#         right_arr = arr[mid:]
#         mergeSort(left_arr)
#         mergeSort(right_arr)

#         i = 0
#         j = 0
#         k = 0

#         while( i < len(left_arr) and j < len(right_arr)):
#             if left_arr[i] < right_arr[j]:
#                 arr[k] = left_arr[i]
#                 i += 1
#                 k += 1
#             else:
#                 arr[k] = right_arr[j]
#                 j += 1
#                 k += 1
        
#         while i < len(left_arr):
#             arr[k] = left_arr[i]
#             i += 1
#             k += 1

#         while j < len(right_arr):
#             arr[k] = right_arr[j]
#             j += 1
#             k += 1
# def pivot(arr,l ,n):
#     pivot = arr[n-1]
#     i = l-1
#     for j in range(l, n):
 
#         # If current element is smaller than or
#         # equal to pivot
#         if arr[j] <= pivot:
 
#             # increment index of smaller element
#             i = i+1
#             arr[i], arr[j] = arr[j], arr[i]
 
#     arr[i+1], arr[n] = arr[n], arr[i+1]
#     return (i+1)

# def quicksort(arr,l,h):
#     if len(arr) ==1:
#         return arr
#     if l < h:
#         p = pivot(arr,l,h)
#         quicksort(arr,l,p-1)
#         quicksort(arr,p+1,h)


# arr = [1,2,9,3,4,5,6]
# quicksort(arr,0,len(arr)-1)
# print(arr)

# #print(quicksort(arr,0,len(arr)))


#     return
# arr = [5,4,3,8,9]
# quickSort(arr)
# print(arr)

#insertion sort

# def insertion_sort(arr):
#     for i in range(1, len(arr)):
#         key = arr[i]
#         j = i-1
#         while j>0 and key < arr[j]:
#             arr[j+1] = arr[j]
#             j -= 1
#         arr[j+1]  = key
#         print(arr[j+1])
        
# arr = [1,8,9,3,2,4,5]
# insertion_sort(arr)
# print(arr)