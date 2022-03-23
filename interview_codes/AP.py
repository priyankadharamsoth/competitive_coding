a = [2, 6, 9, 12, 17, 22, 31, 32, 35, 42]
for i in range(0,len(a)-1):
    for j in (i+1,len(a)):
        b = int(a[i]+a[j])//2
        print(b)
        
        