
nums = [1,0,2,0,9]
list1 = []
list2 = []

for ele in nums:
    if ele == 0:
        list1.append(ele)
    else:
        list2.append(ele)
print(list2+list1)