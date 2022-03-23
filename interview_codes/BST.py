
from collections import deque
from logging import root


class BinaryTree:
    def __init__(self,data):
        self.data = data
        self.left = None
        self.right = None

    def add_node(self,data):
        if data == self.data:
            return 
        
        if data < self.data:
            if self.left:
                self.left.add_node(data)
            else:
                self.left = BinaryTree(data)
        else:
            if self.right:
                self.right.add_node(data)
            else:
                self.right = BinaryTree(data)

    def pre_order_traversal(self):
        elements = []
        elements.append(self.data)
        if self.left:
            elements += self.left.pre_order_traversal()
        if self.right:
            elements += self.right.pre_order_traversal()
        return elements

    def find_min(self):
        if self.left:
            return self.left.find_min()
        else:
            return self.data
    def find_max(self):
        if self.right:
            return self.right.find_max()
        else:
            return self.data

        
            

    def search(self,val):
        if self.data == val:
            return True
        if val < self.data:
            if self.left:
                return self.left.search(val)
            else:
                return False
        if val > self.data:
            if self.right:
                return self.right.search(val)
            else:
                return False
    
def level_order(root):
    
    q = deque([root])
    while len(q):
        root = q.popleft()
        print(root.data, end = ' ')
        if root.left :
            q.append(root.left)

        if root.right:
            q.append(root.right)
        
    
    
    


def buildTree(elements):    
    root = BinaryTree(elements[0])
    for i in range(1,len(elements)):
        root.add_node(elements[i])
    return root

def depth(node):
    if node is None:
        return -1
    else:
        ldepth = depth(node.left)
        rdepth = depth(node.right)
    
    if ldepth > rdepth:
        return ldepth+1
    else:
        return rdepth+1

if __name__ == '__main__':
    # elements = [17, 4, 1, 20, 9, 23, 18, 34,45]
    # numbers_tree = buildTree(elements)
    # print(numbers_tree.pre_order_traversal())
    # print(numbers_tree.search(34))
    # print(numbers_tree.find_min())
    # print(numbers_tree.find_max())
    # print(depth(numbers_tree))
    # print(level_order(numbers_tree))
    
    root = BinaryTree(5)
    root.left = BinaryTree(3)
    root.right = BinaryTree(6)
    (level_order(root))