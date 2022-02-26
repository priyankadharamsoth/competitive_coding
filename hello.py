class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
    
    def inser_at_begin(self,new_data):
        new_node = Node(new_data)
        new_node.next = self.head
        self.head = new_node

    def insert(self,data_list):
        self.head = None
        for i in data_list:
            self.inser_at_begin(i)

    def Count(self):
        count = 0
        temp = self.head
        while temp:
            count += 1
            temp = temp.next
        return count 
    
    def Remove(self, position):
        
        if position==0:
            self.head = self.head.next
            return

        index = 0
        current = self.head
        prev = self.head
        temp = self.head
    
        while current:
            if index == position:
                temp = current.next
                break
            prev = current
            current = current.next
            index += 1
        prev.next = temp
    
    def RemoveElement(self,position):
        
        if position==0:
            self.head = self.head.next
            return
        count = 0
        itr = self.head
        while itr:
            if count == position-1:
                itr.next = itr.next.next
            itr = itr.next
            count = count+1
        
            

    


    def print(self):
        if self.head == None:
            print('empty list')
        itr = self.head
        while itr:
            print(itr.data)
            itr = itr.next


    
    
                

if __name__ == '__main__':
    ll = LinkedList()
    ll.insert(['banana','apple'])
    ll.inser_at_begin(5)
    ll.inser_at_begin(6)
    ll.RemoveElement(2)
    ll.print()

    print('no of elements',ll.Count())

