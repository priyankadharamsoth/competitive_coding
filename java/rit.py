a = '111'
b = '01'
carry = 0
c = ''

a, b = a[::-1],b [::-1]
for i in range(max(len(a),len(b))):
    A = ord(a[i])-ord('0') if i < len(a) else 0
    B = ord(b[i])-ord('0') if i < len(b) else 0
    
    total = A + B + carry
    c = str(total%2) + c
    carry = total//2

    

if carry == 1:
    c = "1" + c
print(c[::-1])

