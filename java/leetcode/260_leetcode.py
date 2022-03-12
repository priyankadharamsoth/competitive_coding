from itertools import count


arr = [3,3,3,2]
d = {}
n = len(arr)
for ele in arr:
    if ele not in d:
        d[ele] = 1
    else:
        d[ele] += 1
print([key for key,val in d.items() if val >= (n/2)])