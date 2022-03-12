class A:
    def method(self,a):
        print("in A",a)
    

class B(A):
    def method(self):
        print("hsajdh")



obj = B()
obj.method(2)
