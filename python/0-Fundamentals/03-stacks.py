class Node:

    def __init__(self, value):
        self.value = value
        self.next_node = None
    
    def __str__(self):
        return str(self.value)


class LinkedStack:

    def __init__(self):
        self.top = Node(None)
        self._cnt = 0
    
    def pop(self):
        cur = self.top.next_node
        if cur:
            self.top.next_node = cur.next_node
            self._cnt -= 1
            return cur.value
        else:
            return None
    
    def push(self, value):
        new_node = Node(value)
        new_node.next_node = self.top.next_node
        self.top.next_node = new_node
        self._cnt += 1
    
    def clear(self):
        self.top.next_node = None
        self._cnt = 0
    
    def peek(self):
        return self.top.next_node.value if self.top.next_node else None
    
    def count(self):
        return self._cnt


class Array:

    def __init__(self, size):
        self.data = [None] * size
        self.length = 0
        self.size = size
    
    def __str__(self):
        return '[' + ', '.join(map(str, self.data[:self.length])) + ']'


class ArrayStack(Array):

    def pop(self):
        self.length -= 1
        return self.data[self.length] if self.length != -1 else None
    
    def push(self, value):
        if self.length == self.size:
            raise OverflowError
        else:
            self.data[self.length] = value
            self.length += 1
    
    def clear(self):
        self.length = 0
    
    def peek(self):
        return self.data[self.length - 1] if self.length != 0 else None
    
    def count(self):
        return self.length


class DoubleArrayStack(Array):

    def __init__(self, size):
        super().__init__(size)
        self.left_length = 0
        self.right_length = 0
    
    def pop_left(self):
        if self.left_length != 0:
            self.left_length -= 1
            self.length -= 1
            v = self.data[self.left_length]
            self.data[self.left_length] = None
            return v
    
    def pop_right(self):
        if self.right_length != 0:
            self.right_length -= 1
            self.length -= 1
            v = self.data[self.size - self.right_length - 1]
            self.data[self.size - self.right_length - 1] = None
            return v
    
    def push_left(self, value):
        if self.length == self.size:
            raise OverflowError
        self.data[self.left_length] = value
        self.left_length += 1
        self.length += 1
    
    def push_right(self, value):
        if self.length == self.size:
            raise OverflowError
        self.data[self.size - self.right_length - 1] = value
        self.right_length += 1
        self.length += 1
    
    def clear(self):
        self.length = 0
        self.left_length = 0
        self.right_length = 0
        for i in range(self.size):
            self.data[i] = None
    
    def __str__(self):
        return '[' + ', '.join(map(str, self.data[:self.size])) + ']'


if __name__ == '__main__':

    linked_stack = LinkedStack()
    linked_stack.push(3)
    linked_stack.push(20)
    linked_stack.push(39)
    print('Peek:', linked_stack.peek())
    print('Count:', linked_stack.count())
    print(linked_stack.pop(),
          linked_stack.pop(),
          linked_stack.pop(), sep='\n')
    print('Peek:', linked_stack.peek())

    array_stack = ArrayStack(5)
    array_stack.push(10)
    array_stack.push(20)
    array_stack.push(30)
    print('ArrayStack:', array_stack)
    print(array_stack.pop())
    print('ArrayStack:', array_stack)
    print('Peek', array_stack.peek())
    print('Count', array_stack.count())
    array_stack.clear()
    print('Cleared ArrayStack:', array_stack)

    double_stack = DoubleArrayStack(8)
    double_stack.push_left(1)
    double_stack.push_left(2)
    double_stack.push_right(10)
    double_stack.push_right(20)
    double_stack.push_left(3)
    double_stack.push_right(30)
    print('DoubleArrayStack:', double_stack)
    print(double_stack.pop_left())
    print(double_stack.pop_right())
    print(double_stack.pop_right())
    print('DoubleArrayStack:', double_stack)
    