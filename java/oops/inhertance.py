class A:
    def __init__(self):
        print('init class of A')
        
    def method(self):
        print('in A class')

class B(A):
    super()
    def method2(self):
        print('in B class')


obj = B()
obj.method()

