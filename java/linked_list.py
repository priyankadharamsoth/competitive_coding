

class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def add_node(self,data):
        if self.head == None:
            self.head = Node(data)
            return 
        temp = self.head
        while(temp.next):
            temp = temp.next
        temp.next = Node(data)
    
    def insert_at_beginning(self,data):
        node = Node(data)
        node.next = self.head
        self.head = node
    
    def insert_values(self,data_list):
        for i in data_list:
            self.add_node(i)

    # def remove(self, index):
    #     if index < 0 or index > self.length():
    #         raise Exception("Invalid Index")
    #     else:
    #         if index == 0:
    #             self.head = self.head.next

    #     count = 0
    #     itr = self.head
    #     while itr:
    #         if count == index - 1:
    #             itr.next = itr.next.next
    #             break

    #         itr = itr.next
    #         count+=1
    def remove(self,val):
        if self.head.data == val:
            self.head = self.head.next

        temp = self.head.next
        prev = self.head
        while (temp.next):
            if temp.data == val:
                temp = temp.next
                prev.next = temp

            prev = temp
            temp = temp.next
        
        prev.next = temp.next
        
        


        

    
    def print(self):
        temp = self.head
        while(temp):
            if temp.next:
                print(temp.data, end = '-->')
            else:
                print(temp.data)
            temp = temp.next

    
    def length(self):
        if self.head == None:
            return 0
        else:
            temp = self.head
            count = 1
            while (temp.next):
                count += 1
                temp = temp.next
            return count 
        
        
if __name__ == '__main__':
    llist = LinkedList()
    llist.add_node(2)
    llist.add_node(3)
    llist.insert_at_beginning(1)
    #llist.insert_values(['jdjk','dhfk','hdsffh'])
    #llist.remove(1)
    llist.remove(3)
    llist.print()

    print('length of linked list',llist.length())