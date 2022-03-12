from abc import ABC, abstractmethod

class Polygon(ABC):

    @abstractmethod
    def sides(self):
        pass

class Triangle(Polygon):
    def sides(self):
        print('3 sides')

class hexagone(Polygon):
    def sides(self):
        print('6 sides')



obj1 = Triangle()
obj1.sides()
