from itertools import count


arr = [3,2,3,4,1,1,2]
d = {}

for ele in arr:
    if ele not in d:
        d[ele] = 1
    else:
        d[ele] += 1
print(key for key,val in d.items() if val == 1)