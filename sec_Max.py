arr= [1,4,3,2,1]
Max = arr[0]
secMax = 0

for i in range(1,len(arr)):
    if arr[i] > Max:
        Max = arr[i]
for i in range(1,len(arr)):
    if i > secMax and secMax != Max:
        secMax = arr[i]
print(secMax)
