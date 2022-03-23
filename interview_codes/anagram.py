class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        arr = [0]*26
        for ch in s:
            idx = ord(ch)-ord("a")
            arr[idx] += 1

        for ch in t:
            idx = ord(ch)-ord("a")
            arr[idx] -= 1

        for ele in arr:
            if ele != 0:
                return False
        return True
     


        
        
                        
                        