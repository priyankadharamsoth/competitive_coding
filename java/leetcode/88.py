
nums1 = [1,2,3,0,0]
nums2 = [2,5]
m = 3
n = 2
i = 0 
j = 0
nums = []
while(i < m and j < n):
    if nums1[i] < nums2[j]:
        nums.append(nums1[i])
        i = i+1
        
    else:
        nums.append(nums2[j])
        j = j+1
        
        
while i < m:
    nums.append(nums1[i])
    i = i+1
    
while j < n:
    nums.append(nums2[j])
    j = j+1
    
nums1 = nums
print(nums1)