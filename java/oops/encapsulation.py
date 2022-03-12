# Python program to
# demonstrate protected members

# Creating a base class
class Base:
	def __init__(self):
		self.__a = 2

# Creating a derived class
class Derived(Base):
	def __init__(self):
		Base.__init__(self)
		print("Calling protected member of base class: ",
			self.__a)

		self._a = 3
		print("Calling modified protected member outside class: ",
			self._a)


obj1 = Derived()
print("Accessing protected member of obj1: ", obj1._a)


