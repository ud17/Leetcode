class Solution:
    def addBinary(self, a: str, b: str) -> str:
        carry = 0
        a = a[::-1]
        b = b[::-1]
        l = len(a) if len(a) > len(b) else len(b)
        sum = ""
        
        for x in range(0,l):
            abit = 0 if x >= len(a) else int(a[x])
            bbit = 0 if x >= len(b) else int(b[x])
            
            sum += str(0) if ((abit+bbit+carry) % 2 == 0) else str(1)            
            carry = 1 if abit+bbit+carry > 1 else 0
        
        if(carry>0): sum += str(carry)
        return sum[::-1]