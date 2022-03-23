s ='abcab'
def Swaps(s,n):
    s =  list(s)
    count = 0
    ans = True
    for i in range(n//2):
        l = i
        r = n-i-1

        while (l < r):
            if s[l] == s[r]:
                break
            else:
                r -= 1
    
        if l == r:
            ans = False
            break
        else:
            for j in range(r, n-i-1):
                s[j],s[j+1]= s[j+1], s[j]
                count += 1

    if ans:
        return count
    else:
        return -1 

s = 'geeksfgaeks' 
n = len(s)
ans1 = Swaps(s, n)
print(ans1)
    



        
