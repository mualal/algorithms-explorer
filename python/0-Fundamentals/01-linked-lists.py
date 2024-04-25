class Node:
    def __init__(self, value):
        self.value = value
        self.next_node = None
    
    def __str__(self):
        return str(self.value)


class List:
    def __init__(self):
        self.head = None
    
    def append(self, value):
        if self.head is None:
            self.head = Node(value)
            return
        
        current_node = self.head
        while current_node.next_node is not None:
            current_node = current_node.next_node
        
        current_node.next_node = Node(value)
    
    def prepend(self, value):
        old_head = self.head
        self.head = Node(value)
        self.head.next_node = old_head
    
    def __str__(self):
        current_node = self.head
        values = '['

        while current_node is not None:
            end_str = ', ' if current_node.next_node else ''
            values += str(current_node) + end_str
            current_node = current_node.next_node
        
        return values + ']'


if __name__ == '__main__':
    lst = List()
    lst.append('Hello')
    lst.append('Tom')
    lst.prepend('Jack')
    lst.prepend('Hello')
    print(lst)
