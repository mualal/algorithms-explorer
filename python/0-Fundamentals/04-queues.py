class Node:

    def __init__(self, value):
        self.value = value
        self.next_node = None
        self.prev_node = None
    
    def __str__(self):
        return self.value


class LinkedQueue:

    def __init__(self):
        self.top = Node(None)
        self.first = None
        self.length = 0
    
    def enqueue(self, value):
        new_node = Node(value)
        new_node.next_node = self.top.next_node
        if self.top.next_node:
            self.top.next_node.prev_node = new_node
        self.top.next_node = new_node
        new_node.prev_node = self.top
        if not self.first:
            self.first = new_node
        self.length += 1
    
    def deque(self):
        if self.first:
            v = self.first.value
            self.first = self.first.prev_node
            self.first.next_node = None
            if self.first.value is None:
                self.first = None
            self.length -= 1
            return v
    
    def count(self):
        return self.length
    
    def peek(self):
        if self.first:
            return self.first.value
    
    def clear(self):
        self.top.next_node = None
        self.length = 0
        self.first = None


class Array:

    def __init__(self, size):
        self.data = [None] * size
        self.length = 0
        self.size = size
    
    def __str__(self):
        return '[' + ', '.join(map(str, self.data[:self.length])) + ']'


class ArrayQueue(Array):

    def __init__(self, size):
        super().__init__(size)
        self.last = 0
        self.first = 0

    def enqueue(self, value):
        if self.length == self.size:
            raise OverflowError
        self.data[self.last] = value
        self.last = (self.last + 1) % self.size
        self.length += 1
    
    def dequeue(self):
        if self.length:
            v = self.data[self.first]
            self.first = (self.first + 1) % self.size
            self.length -= 1
            return v


if __name__ == '__main__':

    linked_queue = LinkedQueue()
    linked_queue.enqueue(2)
    linked_queue.enqueue(4)
    linked_queue.enqueue(6)
    linked_queue.enqueue(8)
    linked_queue.deque()
    print(linked_queue.count())
    print(linked_queue.peek())
    linked_queue.clear()
    print(linked_queue.count())

    array_queue = ArrayQueue(8)
    array_queue.enqueue(10)
    array_queue.enqueue(20)
    array_queue.enqueue(30)
    print(array_queue)
    array_queue.dequeue()
    array_queue.dequeue()
    print(array_queue)
